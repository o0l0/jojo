package PJXT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Pljm2 {
	   JFrame a;
	   JScrollPane b;
	   JTextField c;
	   JTextArea d;
	   JButton e1;
	   JButton e2;
	   JPanel f;
   public Pljm2(){

	   a=new JFrame();
	   a.setBackground(Color.CYAN);
	   a.setSize(400, 300);
	   d=new JTextArea(20,30);
	   b=new JScrollPane(d);
	   d.setEditable(false);
	   f=new JPanel();c=new JTextField(15);
	   e1=new JButton("撤回");  e2=new JButton("发送");
	   f.add(e1);f.add(c);f.add(e2);
	   
	   
	   Connection con=null;
		  Statement stmt=null;
		  ResultSet rs=null;
		 
		  try {
			  con=LJSJK.getConnection();  
			 String sql2="select * from usb4 ";
			PreparedStatement pstmt2 =con.prepareStatement(sql2);
			rs=pstmt2.executeQuery();
			while(rs.next()){
				d.append("用户说:"+rs.getString("pl")+"\r\n小爱说:咱们聊些别的吧..\r\n");
				}	
		} 
			catch (Exception e1) {;
			e1.printStackTrace();
		}
		  finally{
			
			  LJSJK.close(rs,null,con);
		  }   
	   
	   
	   
	   
	   e2.addActionListener(new ActionListener() {
		   
		   public void actionPerformed(ActionEvent e) {
			
		   d.append("用户说:"+c.getText()
		   +"\r\n");
		   jmlj.plsjk(c.getText());//聊天记录数据库
		   if(c.getText()!="")
				d.append("小爱说:咱们聊些别的吧..\r\n");
		   c.setText("");
		   }
		   });
	   
	   e1.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   jmlj.delete();
				//System.exit(0);//退出图形界面
				a.dispose();//退出上一个界面
				
				 Connection con=null;
				  Statement stmt=null;
				  ResultSet rs=null;
				 
				  try {
					  con=LJSJK.getConnection();  
					 String sql2="select pl from usb4 ";
					PreparedStatement pstmt2 =con.prepareStatement(sql2);
					rs=pstmt2.executeQuery();
					while(rs.next()){
						d.append("用户说:"+rs.getString("pl")
						+"\r\n");	}	
				} 
					catch (Exception e1) {;
					e1.printStackTrace();
				}
				  finally{
					
					  LJSJK.close(rs,null,con);
				  }
				  new Pljm2();
			   
		   }
		   });
	   
	   
	   
	   
	   a.add(b,BorderLayout.CENTER);
	   a.add(f,BorderLayout.SOUTH);
	   a.setVisible(true);//放在后面才不会出错
	   a.setLocation(600, 250);
	   a.setLocationRelativeTo(null);//窗口居中
	   
	   
   }
 /* public static void main(String[] args) {
		Pljm2 t=new Pljm2();
	}*/
	
}
