package PJXT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class jmlj {
	private static JOptionPane returnJOptionPane;
	public static void main(String[] args){
	Scanner c=new Scanner(System.in);
	//String x=c.nextLine();
	//String y=c.nextLine();
	Dlck x=new Dlck();
	
	}
	
        public static boolean select(String username,String password){
        	  Connection con=null;
        	  PreparedStatement pstmt=null;
							        	  ResultSet rs=null;
							        	 // System.out.println("数据库数据成功获取！！");
        	  try {
        		  con=LJSJK.getConnection();  
        		  /*stmt= con.createStatement();
        		//String sql="select from usb2 where zh='"+username+"' and mm='"+password+"'";//会产生sql注入->Statement stmt=null;
        		    String url = "jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
        			 String passwordo = "zzl123";
        			 String user = "root";
        			Class.forName("com.mysql.cj.jdbc.Driver");
					con= DriverManager.getConnection(url,user,passwordo);*/
        		  
        		  
        		  String sql="select * from usb3 where zh=? and mm=?";//-->PreparedStatement pstmt=null;
        		 pstmt=con.prepareStatement(sql);
        		pstmt.setString(1, username);
        		pstmt.setString(2, password);
        		rs=pstmt.executeQuery();
        		if(rs.next()){
        			return true;
        		}else return false;
        		  
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("出错");
				e.printStackTrace();
			}
        	  //System.out.println("数据库数据成功获取3！！");
        	  finally{
        		 
        		  LJSJK.close(rs,pstmt,con);
        	  }
        	  return false;
        	  
        	  
          }
        public static boolean insert(String username,String password){
      	  Connection con=null;
      	  Statement stmt=null;
      	  ResultSet rs=null;
      	 
      	  try {
      		  con=LJSJK.getConnection();  
      		  String sql="select * from usb3 where zh=?";
      		PreparedStatement pstmt=con.prepareStatement(sql);
      		pstmt.setString(1, username);
      		rs=pstmt.executeQuery();
      		if(rs.next()){
      			return false;
      		
      		}else{  
      			String sql2="insert into usb3 values(?,?)";
      			PreparedStatement pstmt2 =con.prepareStatement(sql2);
      			pstmt2.setString(1, username);
      			pstmt2.setString(2, password);
      			int x=pstmt2.executeUpdate();
      		}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("出错");
				e.printStackTrace();
			}
      	  //System.out.println("数据库数据成功获取3！！");
      	  finally{
      		
      		  LJSJK.close(rs,null,con);
      	  }
      	  return true;

        }
        public static boolean insert2(String username,String password){
        	  Connection con=null;
        	  Statement stmt=null;
        	  ResultSet rs=null;
        	  try {
        		con=LJSJK.getConnection();
        			String sql2="update usb3 set mm=? where zh=?;";
        			PreparedStatement pstmt2 =con.prepareStatement(sql2);
        			pstmt2.setString(1, password);
        			pstmt2.setString(2, username);
        			int x=pstmt2.executeUpdate();
        		if(x>0)
        		{returnJOptionPane.showMessageDialog(null, "修改成功");} 
        		else returnJOptionPane.showMessageDialog(null, "修改失败");
  			} catch (Exception e) {
  				// TODO: handle exception
  				System.out.println("出错");
  				e.printStackTrace();
  			}
        	  //System.out.println("数据库数据成功获取3！！");
        	  finally{
        		
        		  LJSJK.close(rs,null,con);
        	  }
        	  return true;

          }
        public static   void plsjk(String pjsj){
        	  Connection con=null;
        	  Statement stmt=null;
        	  ResultSet rs=null;
        	  try {
        		  con=LJSJK.getConnection();  
        		  String sql="insert into usb4 values(?,now())";
        		PreparedStatement pstmt=con.prepareStatement(sql);
        		pstmt.setString(1, pjsj);
        		int x=pstmt.executeUpdate();		
  			} catch (Exception e) {
  				// TODO: handle exception
  			//	System.out.println("出错");
  				e.printStackTrace();
  			}
        	  //System.out.println("数据库数据成功获取3！！");
        	  finally{
        		
        		  LJSJK.close(rs,null,con);
        	  }

        } 
    
        public static   void pfsjk(int x,int y){
      	  Connection con=null;
      	  Statement stmt=null;
      	  
      	 
      	  try {
      		  con=LJSJK.getConnection();  
      		 String sql2="insert into usb5 values(?,?)";
      		PreparedStatement pstmt2 =con.prepareStatement(sql2);
      		pstmt2.setInt(1, x);
      		pstmt2.setInt(2, x);
      		int rs=pstmt2.executeUpdate();
      		
      	  }catch (Exception e) {
				e.printStackTrace();
			}
      	  finally{
      		
      		  LJSJK.close(null,stmt,con);
      	  }
	
        
        
        }
        public static   void delete(){
        	  Connection con=null;
        	  Statement stmt=null;	 
        	  try {
        		  con=LJSJK.getConnection();  
        		 String sql2="delete from usb4 where 1 order by sj desc limit 1";
        		PreparedStatement pstmt2 =con.prepareStatement(sql2);
        		int rs=pstmt2.executeUpdate();     		
        	  }catch (Exception e) {
  				e.printStackTrace();
  			}
        	  finally{
        		
        		  LJSJK.close(null,stmt,con);
        	  }
  	
          
          
          }
        public static   void plsjk2(String pjsj){
      	  Connection con=null;
      	  Statement stmt=null;
      	  ResultSet rs=null;
      	  try {
      		  con=LJSJK.getConnection();  
      		  String sql="insert into usb6 values(?,now())";
      		PreparedStatement pstmt=con.prepareStatement(sql);
      		pstmt.setString(1, pjsj);
      		int x=pstmt.executeUpdate();		
			} catch (Exception e) {
				// TODO: handle exception
			//	System.out.println("出错");
				e.printStackTrace();
			}
      	  //System.out.println("数据库数据成功获取3！！");
      	  finally{
      		
      		  LJSJK.close(rs,null,con);
      	  }

      } 
        public static   void delete2(){
      	  Connection con=null;
      	  Statement stmt=null;	 
      	  try {
      		  con=LJSJK.getConnection();  
      		 String sql2="delete from usb6 where 1 order by sj desc limit 1";
      		PreparedStatement pstmt2 =con.prepareStatement(sql2);
      		int rs=pstmt2.executeUpdate();     		
      	  }catch (Exception e) {
				e.printStackTrace();
			}
      	  finally{
      		
      		  LJSJK.close(null,stmt,con);
      	  }
	
        
        
        }
        
		}
	

        
        
        
        
        
        
        

