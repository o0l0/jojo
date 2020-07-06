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

		JTextField x1=new JTextField("请输入账号",8);
		JTextField x2=new JPasswordField(8);
		JButton b1=new JButton("注册");
		JButton b2=new JButton("登录");
		JFrame c=new JFrame("此处有监控");
		
	public Dyy(){
		
		
		c.setSize(400,180);
		c.setLocationRelativeTo(null);//窗口居中
			c.setVisible(true);
		
	JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java！/7/src/11/src/jgk.jpg"));
	y3.setSize(400,180);
	c.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
	y3.setBounds(0,0,400,180);
	Container contain=c.getContentPane();
	((JPanel)contain).setOpaque(false);
	//this.add(y3);
	c.setLayout(new BorderLayout(5,5));
	JLabel y1=new JLabel("        账号:");
	JLabel y2=new JLabel("        密码:");
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
	b1.addActionListener(this);        //函数在当前类中实现
	b2.addActionListener(this);
	y1.setFont(new Font("华文行楷",Font.PLAIN,23));
	y2.setFont(new Font("华文行楷",Font.PLAIN,23));
	x1.setFont(new Font("微软雅黑",Font.PLAIN,18));
	x2.setFont(new Font("微软雅黑",Font.PLAIN,18));
	b1.setFont(new Font("华文彩云",Font.PLAIN,23));
	b2.setFont(new Font("华文彩云",Font.PLAIN,23));
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
		
		
		
		
		
		
		 
		
		
	      //声明Connection对象
	         Connection con;
	        //驱动程序名
	         String driver = "com.mysql.cj.jdbc.Driver";
	         //URL指向要访问的数据库名mydata
	         String url = "jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
       //MySQL配置时的用户名
	         String user = "root";
		         //MySQL配置时的密码
		         String password = "zzl123";
	        //遍历查询结果集
	        try {
	             //加载驱动程序
		             Class.forName(driver);
		            //1.getConnection()方法，连接MySQL数据库！！
		             con = DriverManager.getConnection(url,user,password);
		             if(!con.isClosed())
		                 System.out.println("Succeeded connecting to the Database!");
		             //2.创建statement类对象，用来执行SQL语句！！
		            java.sql.Statement statement = con.createStatement();
		            //要执行的SQL语句
		            String sql = "select * from usb2";
		            /*Statement stmt = null;
					@SuppressWarnings("null")
					ResultSet rset = stmt.executeQuery("select count(*) totalCount from yourTableName");
		            int rowCount = 0;
		            if(rset.next()) {
		            rowCount=rset .getInt("totalCount ");}*/
		             //3.ResultSet类，用来存放获取的结果集！！
		             ResultSet rs = ((java.sql.Statement) statement).executeQuery(sql);
		  /*           System.out.println("-----------------");
		            System.out.println("执行结果如下所示:");  
		             System.out.println("-----------------");  
		             System.out.println("姓名" + "\t" + "职称");  
	             System.out.println("-----------------");  */
		             String job = null;
		             String id = null;
		             while(rs.next()){
	                 //获取stuname这列数据
		                 job = rs.getString("zh");
		                 //获取stuid这列数据
		                 id = rs.getString("mm");
		
		                 
		                 
		             	if(e.getSource()==b2)//当点击按键b2时
		            	{  System.out.println(id + "\t" + job);
		            	String y=x1.getText().toString();String y1=x2.getText().toString();//获取文本框内容
		            	
		               
		            	if((y.equals(job))&&(y1.equals(id)))
		            			{
		            			JOptionPane.showMessageDialog(null, "登录成功");//跳出警告框
		            			//System.exit(0);//退出界面
		            			c.dispose();//退出上一个界面
		            			//setVisible(boolean);
		            			new Dey();
		            			break;
		            			//System.out.println(x1.getText());
		            			//System.out.println(x2.getText());
		            			}JOptionPane.showMessageDialog(null, "账号或密码错误");//跳出警告框
		            	
		            	
		            		//JOptionPane.showMessageDialog(null, ".....");//跳出警告框
//		            			System.out.println(x1.getText());
//		            			System.out.println(x2.getText());
//		            			System.out.println(s);
//		            			System.out.println(s1);
//		            	new Dey();
		            	
		            	}
		                 
		                 
		                 
		                 
		                 
		                 
		                 
	                 //输出结果
		                 System.out.println(job + "\t" + id);
		             }
		             rs.close();
		             con.close();
		         } catch(ClassNotFoundException e1) {   
		             //数据库驱动类异常处理
		             System.out.println("Sorry,can`t find the Driver!");   
	             e1.printStackTrace();   
		             } catch(SQLException e1) {
	             //数据库连接失败异常处理
		             e1.printStackTrace();  
		            }catch (Exception e1) {
		             // TODO: handle exception
		            e1.printStackTrace();
		                    }finally{
		                        System.out.println("数据库数据成功获取！！");
		                     }
		
		
		
		
		
		
		
		
		//System.out.println(wj);
		//System.out.println(wj1);
		BufferedReader br=null;
		BufferedReader br1=null;
		String s = null,s1 = null;
		try {
			br=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\java！\\7\\src\\11\\src\\wj.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			br1=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\java！\\7\\src\\11\\src\\wj1.txt"));
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
	//获取文件中的内容
	if(e.getSource()==b1)//当点击按键b1时
	{  
		//System.exit(0);//退出图形界面
		c.dispose();//退出上一个界面
		new Dsy();
	}

	}
}

