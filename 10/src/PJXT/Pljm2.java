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
	   e1=new JButton("����");  e2=new JButton("����");
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
				d.append("�û�˵:"+rs.getString("pl")+"\r\nС��˵:������Щ��İ�..\r\n");
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
			
		   d.append("�û�˵:"+c.getText()
		   +"\r\n");
		   jmlj.plsjk(c.getText());//�����¼���ݿ�
		   if(c.getText()!="")
				d.append("С��˵:������Щ��İ�..\r\n");
		   c.setText("");
		   }
		   });
	   
	   e1.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   jmlj.delete();
				//System.exit(0);//�˳�ͼ�ν���
				a.dispose();//�˳���һ������
				
				 Connection con=null;
				  Statement stmt=null;
				  ResultSet rs=null;
				 
				  try {
					  con=LJSJK.getConnection();  
					 String sql2="select pl from usb4 ";
					PreparedStatement pstmt2 =con.prepareStatement(sql2);
					rs=pstmt2.executeQuery();
					while(rs.next()){
						d.append("�û�˵:"+rs.getString("pl")
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
	   a.setVisible(true);//���ں���Ų������
	   a.setLocation(600, 250);
	   a.setLocationRelativeTo(null);//���ھ���
	   
	   
   }
 /* public static void main(String[] args) {
		Pljm2 t=new Pljm2();
	}*/
	
}
