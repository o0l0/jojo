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
public class Pljm extends JFrame{
		   JFrame a;
		   JScrollPane b;
		   JTextField c;
		   JTextArea d;
		   JButton e1;
		   JButton e2;
		   JPanel f;
	   public Pljm(){

		   a=new JFrame();
		   a.setBackground(Color.CYAN);
		   a.setSize(400, 150);
		   d=new JTextArea(2,3);
		   b=new JScrollPane(d);
		   d.setEditable(false);
		   f=new JPanel();c=new JTextField(15);
		   e1=new JButton("����");  e2=new JButton("��������");
		   f.add(e1);f.add(c);f.add(e2);
		   
		   
		   Connection con=null;
			  Statement stmt=null;
			  ResultSet rs=null;
			 
			  try {
				  con=LJSJK.getConnection();  
				 String sql2="select * from usb6 ";
				PreparedStatement pstmt2 =con.prepareStatement(sql2);
				rs=pstmt2.executeQuery();
				while(rs.next()){
					d.append("�ҵ�����"+rs.getString("pl")+"\r\n��л�㱦������");
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
				
			   d.append("�ҵ����ۣ�"+c.getText()
			   +"\r\n");
			   jmlj.plsjk2(c.getText());//���۱������ݿ�
			   if(c.getText()!="")
					d.append("��л�㱦������\r\n");
			   c.setText("");
			   }
			   });
		   
		   e1.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   jmlj.delete2();
					//System.exit(0);//�˳�ͼ�ν���
					a.dispose();//�˳���һ������
					
					 Connection con=null;
					  Statement stmt=null;
					  ResultSet rs=null;
					 
					  try {
						  con=LJSJK.getConnection();  
						 String sql2="select pl from usb6 ";
						PreparedStatement pstmt2 =con.prepareStatement(sql2);
						rs=pstmt2.executeQuery();
						while(rs.next()){
							d.append("�ҵ����ۣ�"+rs.getString("pl")
							+"\r\n");	}	
					} 
						catch (Exception e1) {;
						e1.printStackTrace();
					}
					  finally{
						
						  LJSJK.close(rs,null,con);
					  }
					  new Pljm();
				   
			   }
			   });
		   
		   
		   
		   
		   a.add(b,BorderLayout.CENTER);
		   a.add(f,BorderLayout.SOUTH);
		   a.setVisible(true);//���ں���Ų������
		   a.setLocation(600, 250);
		   a.setLocationRelativeTo(null);//���ھ���
		   
		   
	   }
	 /* public static void main(String[] args) {
			Pljm t=new Pljm();
		}
		*/
	}
