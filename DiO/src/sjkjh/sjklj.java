package sjkjh;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class sjklj {
	
	public static Connection getConnection() throws Exception
	{
		//��ȡ�ļ��е�4��������Ϣ
	/*	InputStream ix = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
		
		Properties pros=new Properties();
		System.out.print("ix ��"+ix);
		pros.load(ix);
		String name=pros.getProperty("name");
		System.out.print(name);
		String pass=pros.getProperty("password");
		String url=pros.getProperty("url");
		String driver=pros.getProperty("driver");*/
		
		String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String name="root";
		String pass="zzl123";
		
		
		//��������
		Class.forName("com.mysql.cj.jdbc.Driver");System.out.print("���������ɹ�");
		//��ȡ����
		Connection con=DriverManager.getConnection(url,name,pass);System.out.print("��ȡ���ӳɹ�");
		return con;
	}
	
	public static void closeResourec(Connection con,PreparedStatement ps)
	{
		//��Դ�ر�
		try {
		if(ps!=null)
			
			ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
		if(con!=null)
			
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
}
