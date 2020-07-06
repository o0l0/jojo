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
		//读取文件中的4个基本信息
	/*	InputStream ix = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
		
		Properties pros=new Properties();
		System.out.print("ix 是"+ix);
		pros.load(ix);
		String name=pros.getProperty("name");
		System.out.print(name);
		String pass=pros.getProperty("password");
		String url=pros.getProperty("url");
		String driver=pros.getProperty("driver");*/
		
		String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String name="root";
		String pass="zzl123";
		
		
		//加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");System.out.print("加载驱动成功");
		//获取链接
		Connection con=DriverManager.getConnection(url,name,pass);System.out.print("获取链接成功");
		return con;
	}
	
	public static void closeResourec(Connection con,PreparedStatement ps)
	{
		//资源关闭
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
