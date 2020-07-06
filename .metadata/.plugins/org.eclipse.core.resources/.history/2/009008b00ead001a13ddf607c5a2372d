package jk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jkk {
	
public void jcc(){
	Connection con;
	PreparedStatement pst;
	try{
		System.out.print("wdnmd11");
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e){System.out.print(e);}
	try{
		String uri="jdbc:mysql://127.0.0.1:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String name="root";
		String pwd="zzl123";
		con=DriverManager.getConnection(uri,name,pwd);
		String sql="delete from user where id=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1,36);
		pst.executeUpdate();
		con.close();
		pst.close();
		System.out.print("wdnmd22");
}catch(Exception e2){System.out.print(e2);}
}}