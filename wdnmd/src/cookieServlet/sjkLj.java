package cookieServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;



public class sjkLj {

	
	
	public static void doit(){
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	System.out.println("11111111111111111");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (Exception e) {
		System.out.print("���������ɹ�����");
		e.printStackTrace();
	}	
	String uri="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";	
	String name="root";
	String password="zzl123";
	try {
		con=DriverManager.getConnection(uri,name,password);
		ps=con.prepareStatement("select * from user");
		rs=ps.executeQuery();
		if(rs.next())
		{
		rs.getString(1);
		rs.getString(2);
		}
		
	} catch (Exception e2) {
		// TODO Auto-generated catch block	
		System.out.print("���ݿ����ӳɹ�");
		e2.printStackTrace();
	}
			
		
	}

}
