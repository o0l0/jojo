package Yhxt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Dyy extends JFrame implements ActionListener {

		JTextField x1=new JTextField("�������˺�",8);
		JTextField x2=new JPasswordField(8);
		JButton b1=new JButton("ע��");
		JButton b2=new JButton("��¼");
		JFrame c=new JFrame("�˴��м��");
		
	public Dyy(){
		
		
		c.setSize(400,180);
		c.setLocationRelativeTo(null);//���ھ���
			c.setVisible(true);
		
	JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java��/7/src/11/src/jgk.jpg"));
	y3.setSize(400,180);
	c.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
	y3.setBounds(0,0,400,180);
	Container contain=c.getContentPane();
	((JPanel)contain).setOpaque(false);
	//this.add(y3);
	c.setLayout(new BorderLayout(5,5));
	JLabel y1=new JLabel("        �˺�:");
	JLabel y2=new JLabel("        ����:");
	c.add(new JLabel("    "),BorderLayout.EAST);
	c.add(new JLabel("    "),BorderLayout.WEST);
	c.add(new JLabel("    "),BorderLayout.SOUTH);
	c.add(new JLabel("    "),BorderLayout.NORTH);
	JPanel p1=new JPanel();
	c.add(p1,BorderLayout.CENTER);
	p1.setLayout(new GridLayout(3,2,10,5));
	p1.add(y1);
	p1.add(x1);//String s=x1.getText().toString();
	p1.add(y2);
	p1.add(x2);//String s2=x2.getText().toString();
	p1.add(b1);
	p1.add(b2);
	//ActionListener lai =new Dlk();
	b1.addActionListener(this);        //�����ڵ�ǰ����ʵ��
	b2.addActionListener(this);
	y1.setFont(new Font("�����п�",Font.PLAIN,23));
	y2.setFont(new Font("�����п�",Font.PLAIN,23));
	x1.setFont(new Font("΢���ź�",Font.PLAIN,18));
	x2.setFont(new Font("΢���ź�",Font.PLAIN,18));
	b1.setFont(new Font("���Ĳ���",Font.PLAIN,23));
	b2.setFont(new Font("���Ĳ���",Font.PLAIN,23));
	b1.setForeground(Color.RED);
	b2.setForeground(Color.RED);
	b1.setBackground(Color.PINK);
	b2.setBackground(Color.PINK);
	p1.setBackground(Color.YELLOW);
	//System.out.println(s);
	//System.out.println(s2);
	}
	@SuppressWarnings("resource")
	
	

	
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		
		
		 
		
		
	      //����Connection����
	         Connection con;
	        //����������
	         String driver = "com.mysql.cj.jdbc.Driver";
	         //URLָ��Ҫ���ʵ����ݿ���mydata
	         String url = "jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
       //MySQL����ʱ���û���
	         String user = "root";
		         //MySQL����ʱ������
		         String password = "zzl123";
	        //������ѯ�����
	        try {
	             //������������
		             Class.forName(driver);
		            //1.getConnection()����������MySQL���ݿ⣡��
		             con = DriverManager.getConnection(url,user,password);
		             if(!con.isClosed())
		                 System.out.println("Succeeded connecting to the Database!");
		             //2.����statement���������ִ��SQL��䣡��
		            java.sql.Statement statement = con.createStatement();
		            //Ҫִ�е�SQL���
		            String sql = "select * from usb2";
		            /*Statement stmt = null;
					@SuppressWarnings("null")
					ResultSet rset = stmt.executeQuery("select count(*) totalCount from yourTableName");
		            int rowCount = 0;
		            if(rset.next()) {
		            rowCount=rset .getInt("totalCount ");}*/
		             //3.ResultSet�࣬������Ż�ȡ�Ľ��������
		             ResultSet rs = ((java.sql.Statement) statement).executeQuery(sql);
		  /*           System.out.println("-----------------");
		            System.out.println("ִ�н��������ʾ:");  
		             System.out.println("-----------------");  
		             System.out.println("����" + "\t" + "ְ��");  
	             System.out.println("-----------------");  */
		             String job = null;
		             String id = null;
		             while(rs.next()){
	                 //��ȡstuname��������
		                 job = rs.getString("zh");
		                 //��ȡstuid��������
		                 id = rs.getString("mm");
		
		                 
		                 
		             	if(e.getSource()==b2)//���������b2ʱ
		            	{  System.out.println(id + "\t" + job);
		            	String y=x1.getText().toString();String y1=x2.getText().toString();//��ȡ�ı�������
		            	
		               
		            	if((y.equals(job))&&(y1.equals(id)))
		            			{
		            			JOptionPane.showMessageDialog(null, "��¼�ɹ�");//���������
		            			//System.exit(0);//�˳�����
		            			c.dispose();//�˳���һ������
		            			//setVisible(boolean);
		            			new Dey();
		            			break;
		            			//System.out.println(x1.getText());
		            			//System.out.println(x2.getText());
		            			}JOptionPane.showMessageDialog(null, "�˺Ż��������");//���������
		            	
		            	
		            		//JOptionPane.showMessageDialog(null, ".....");//���������
//		            			System.out.println(x1.getText());
//		            			System.out.println(x2.getText());
//		            			System.out.println(s);
//		            			System.out.println(s1);
//		            	new Dey();
		            	
		            	}
		                 
		                 
		                 
		                 
		                 
		                 
		                 
	                 //������
		                 System.out.println(job + "\t" + id);
		             }
		             rs.close();
		             con.close();
		         } catch(ClassNotFoundException e1) {   
		             //���ݿ��������쳣����
		             System.out.println("Sorry,can`t find the Driver!");   
	             e1.printStackTrace();   
		             } catch(SQLException e1) {
	             //���ݿ�����ʧ���쳣����
		             e1.printStackTrace();  
		            }catch (Exception e1) {
		             // TODO: handle exception
		            e1.printStackTrace();
		                    }finally{
		                        System.out.println("���ݿ����ݳɹ���ȡ����");
		                     }
		
		
		
		
		
		
		
		
		//System.out.println(wj);
		//System.out.println(wj1);
		BufferedReader br=null;
		BufferedReader br1=null;
		String s = null,s1 = null;
		try {
			br=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\java��\\7\\src\\11\\src\\wj.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			br1=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\java��\\7\\src\\11\\src\\wj1.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			s=br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			s1=br1.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	//��ȡ�ļ��е�����
	if(e.getSource()==b1)//���������b1ʱ
	{  
		//System.exit(0);//�˳�ͼ�ν���
		c.dispose();//�˳���һ������
		new Dsy();
	}

	}
}

