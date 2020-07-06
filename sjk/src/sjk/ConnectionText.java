package sjk;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionText {
	
	public static  Connection sjk() throws Exception
	{
		/*//ConnectionText.class.getClassLoader().getResource("jdbc.properties");
		String name="root";
		String pass="zzl123";
		String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,name,pass);
		System.out.print(con);*/
		
		InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
		Properties pros=new Properties();
		pros.load(is);
		//System.out.print("is 是"+is);
		String name=pros.getProperty("name");
		//System.out.print(name);
		String pass=pros.getProperty("password");
		String url=pros.getProperty("url");
		String driver=pros.getProperty("driver");
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,name,pass);
		//System.out.print(con);
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
