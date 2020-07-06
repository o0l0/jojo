package sjk;


import java.io.PrintStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mysql.cj.jdbc.result.ResultSetMetaData;



public class query {
	
	
	public void cx()
	{
		String sql="select id,fz from userc where id=?";
		
			usbc list=getForlist1(sql,4);
			System.out.print(list);
		
	}
	
	
	
	@Test
	public  void cx3(){
	Connection con;
	ResultSet rst;
	PreparedStatement ps = null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.printf("^^^^^++^^^^^");
		
	}catch(Exception e){System.out.printf("加载驱动出错了");}
	
		String uri="jdbc:mysql://127.0.0.1:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String name="root";
		String pwd="zzl123";
		try{
		con=DriverManager.getConnection(uri,name,pwd);
		ps=con.prepareStatement("select * from userc where id=?");
		ps.setInt(1,1);
	    rst=ps.executeQuery();
	    if(rst.next())
	    {
	    	String x=rst.getString(2);
	    	System.out.print(x);
	    	System.out.print("没有数据");
			
	    }else
	    {
	    	System.out.print("有数据");
	    }
	  
	}catch(Exception e2){System.out.print(e2);}
	
	
	}
	
	public  void cx1()
	{
		String sql="select * from share where id=?";
		
			List<share> list=getForlist(share.class,sql,5);
			//for(int i = 0;i<list.;i++)
			list.forEach(System.out::println);
			//System.out.print(list);
		
	}
	
	
	
     
	public <T> List<T> getForlist(Class<T> claxx,String sql,Object ...args)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//获取数据库连接 
	    try {
			con = ConnectionText.sjk();
		
		
		//预编译
		ps = con.prepareStatement(sql);
		
		for(int i=0;i<args.length;i++)
		{
			ps.setObject(i+1, args[i]);
		}
		rs=ps.executeQuery();
		//获取结果集的元数据
	 java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		//提供ResultSetMetaData获取结果结果集中的列数
		int columnCount=rsmd.getColumnCount();
		//System.out.print("----------"+columnCount);
		//创建集合对象
		ArrayList<T> list = new ArrayList<T>();
		while(rs.next())		
		{
			T t=claxx.newInstance();
			//处理结果集一行数据中每一列：给t对象指定的属性赋值
			for(int i = 0;i < columnCount;i++)	
			{	//获取列值
				Object columValue=rs.getObject(i+1);
			//	System.out.print(columValue);
				//获取列名
				String columnLabel=rsmd.getColumnLabel(i+1);
				//System.out.print(columnLabel);
				//给t对象指定columnName属性，赋值为columValue:通过反射
				Field declaredField = claxx.getDeclaredField(columnLabel);
				declaredField.setAccessible(true);
				declaredField.set(t,columValue);
				
			}
			list.add(t);
		}return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}finally
	    {
		ConnectionText.closeResourec(con, ps);
	    }
	    if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
			//	System.out.print("我错l ");
			}
		return null;
	}
	
	
	
	
	
	
	
	
	public usbc getForlist1(String sql,Object ...args) 
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs;
		try {
			con = null;
			ps = null;
			rs = null;
			//获取数据库连接

				con = ConnectionText.sjk();
			
			//预编译
			ps = con.prepareStatement(sql);
			for(int i=0;i<args.length;i++)
			{
				ps.setObject(i+1, args[i]);
			}
			rs=ps.executeQuery();
			//获取结果集的元数据
			 java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			//提供ResultSetMetaData获取结果结果集中的列数
			int columnCount=rsmd.getColumnCount();
			//创建集合对象
			if(rs.next())
			{
				usbc us = new usbc();
				//处理结果集一行数据中每一列：给t对象指定的属性赋值
				for(int i=0;i<columnCount;i++) {
					Object value = rs.getObject(i+1);
					String columnLabel=rsmd.getColumnLabel(i+1);
					//System.out.print(columnLabel);
					//给t对象指定columnName属性，赋值为columValue:通过反射
					Field declaredField =usbc.class.getDeclaredField(columnLabel);
					declaredField.setAccessible(true);
					declaredField.set(us,value);
				}
					
				return us;

			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally
		{
			ConnectionText.closeResourec(con, ps);
		
		}
		return null;

}
}

