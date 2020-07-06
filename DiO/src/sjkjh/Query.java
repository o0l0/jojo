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
		//��ȡ���ݿ����� 
	    try {
	    	con = sjklj.getConnection();
		
		
		//Ԥ����
		ps = con.prepareStatement(sql);
		
		for(int i=0;i<args.length;i++)
		{
			ps.setObject(i+1, args[i]);
		//	System.out.print(args[i]);
		}
		rs=ps.executeQuery();
	//	System.out.print("@@@@@@"+rs);
		//��ȡ�������Ԫ����
	 java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		//�ṩResultSetMetaData��ȡ���������е�����
		int columnCount=rsmd.getColumnCount();
	//	System.out.print("----------"+columnCount);
		//�������϶���
		ArrayList<T> list = new ArrayList<T>();
		//System.out.print("----2-----");
	//	System.out.print(rs+"----2-----");
		while(rs.next())		
		{
		//	System.out.print("----3-----");
			T t=claxx.newInstance();
			//��������һ��������ÿһ�У���t����ָ�������Ը�ֵ
			for(int i = 0;i < columnCount;i++)	
			{	//��ȡ��ֵ
				Object columValue=rs.getObject(i+1);
			//	System.out.print(columValue);
				//��ȡ����
				String columnLabel=rsmd.getColumnLabel(i+1);
			//	System.out.print("**"+columnLabel);
				//��t����ָ��columnName���ԣ���ֵΪcolumValue:ͨ������
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
