package com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LJSJK {
	private static String url = "jdbc:mysql://localhost:3306/student?useSSL=false&serverTimezone=UTC";
	private static String password = "zzl123";
	private static String user = "root";
 public static Connection getConnection(){

	             try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					return DriverManager.getConnection(url,user,password);
				
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            //1.getConnection()方法，连接MySQL数据库！！
	             return null;
 
}

public static void  close (ResultSet rs,java.sql.Statement stmt,Connection con)
 {
	 try {
		if(rs!=null)
			rs.close();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 try {
			if(stmt!=null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 try {
			if(con!=null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
 }
	 //public static void main(String[] args)
	 public static void main(String[] args){
		
		 try {
			getConnection();
			 System.out.print("连接数据库成功！！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
 
 
}












