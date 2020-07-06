package sjkjh;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Query {
	public <T> List<T> getForlist(Class<T> claxx,String sql,Object ...args)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//获取数据库连接 
	    try {
	    	con = sjklj.getConnection();
		
		
		//预编译
		ps = con.prepareStatement(sql);
		
		for(int i=0;i<args.length;i++)
		{
			ps.setObject(i+1, args[i]);
		//	System.out.print(args[i]);
		}
		rs=ps.executeQuery();
	//	System.out.print("@@@@@@"+rs);
		//获取结果集的元数据
	 java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		//提供ResultSetMetaData获取结果结果集中的列数
		int columnCount=rsmd.getColumnCount();
	//	System.out.print("----------"+columnCount);
		//创建集合对象
		ArrayList<T> list = new ArrayList<T>();
		//System.out.print("----2-----");
	//	System.out.print(rs+"----2-----");
		while(rs.next())		
		{
		//	System.out.print("----3-----");
			T t=claxx.newInstance();
			//处理结果集一行数据中每一列：给t对象指定的属性赋值
			for(int i = 0;i < columnCount;i++)	
			{	//获取列值
				Object columValue=rs.getObject(i+1);
			//	System.out.print(columValue);
				//获取列名
				String columnLabel=rsmd.getColumnLabel(i+1);
			//	System.out.print("**"+columnLabel);
				//给t对象指定columnName属性，赋值为columValue:通过反射
				Field declaredField = claxx.getDeclaredField(columnLabel);
				declaredField.setAccessible(true);
				declaredField.set(t,columValue);	
			}
			list.add(t);
		}return list;
		} catch (Exception e) {
			System.out.print("####"+e);
		
	}finally
	    {
		sjklj.closeResourec(con, ps);
	    }
		return null;
	}
	
}
