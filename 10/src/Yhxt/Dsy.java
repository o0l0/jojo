package Yhxt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 class Dsy extends JFrame implements ActionListener {
	 	public Connection connection = null;
		JButton b1=new JButton("注册");
		JButton b2=new JButton("退出注册");
		JTextField x1=new JTextField("请输入账号",8);
		JTextField x2=new JPasswordField(8);
		JTextField x3=new JPasswordField(8);
		JFrame t=new JFrame("此处有监控");
		public  PreparedStatement pst=null;
		public Dsy()
		{
	
			
			
			
			t.setSize(400,200);
			t.setLocationRelativeTo(null);//窗口居中
			t.setVisible(true);
			t.setLayout(new BorderLayout(5,5));
			t.add(new JLabel("  "),BorderLayout.EAST);
			t.add(new JLabel("  "),BorderLayout.WEST);
			t.add(new JLabel("  "),BorderLayout.NORTH);
			t.add(new JLabel("  "),BorderLayout.SOUTH);
			JPanel p1=new JPanel();
			
			JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java！/7/src/11/src/22.png"));
			y3.setSize(400,180);
			this.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
			y3.setBounds(0,0,400,180);
			Container contain=this.getContentPane();
			((JPanel)contain).setOpaque(false);
			t.add(y3);
			
			p1.setBackground(Color.CYAN);
			t.add(p1,BorderLayout.CENTER);
			p1.setLayout(new GridLayout(4,2,10,5));
			JLabel y1=new JLabel("                            账号");
			JLabel y2=new JLabel("                            密码");
			JLabel y4=new JLabel("                         确认密码");
			p1.add(y1);
			p1.add(x1);
			p1.add(y2);
			p1.add(x2);
			p1.add(y4);
			p1.add(x3);
			p1.add(b1);
			p1.add(b2);
			b1.addActionListener(this);
			b2.addActionListener(this);	
			
			

			b1.setBackground(Color.BLUE);
			b2.setBackground(Color.BLUE);
			p1.setBackground(Color.GREEN);
			
			class jtq implements ActionListener{
				public void actionPerformed(ActionEvent e) {//监听器
					new Dyy();
				}
			}
			ActionListener ls  =new jtq();
			b2.addActionListener(ls);

		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			
			
			
			
			
			
			            
			            
			            
			            if(e.getSource()==b1)//当点击按键b1时
						{
					/*		if((x1.getText().equals(null)) && (x2.getText().equals(null)))
							{
								JOptionPane.showMessageDialog(null, "前后输入不一致");
							}*/
					
							if((x3.getText().equals(x2.getText())) && (x1.getText().length()!=0) && (x2.getText().length()!=0))
							{
								String b=x1.getText();String b1=x2.getText();
							
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

							             //加载驱动程序
								             try {
												Class.forName(driver);
											
								            //1.getConnection()方法，连接MySQL数据库！！
								             con = DriverManager.getConnection(url,user,password);
								             if(!con.isClosed())
								                 System.out.println("Succeeded connecting to the Database!");
								             //2.创建statement类对象，用来执行SQL语句！！
								            // java.sql.Statement statement = con.createStatement();
								             
									            String sql = "inster into usb2 (zh,mm) values (?,?)";
									            PreparedStatement pstmt=con.prepareStatement(sql);
								        		pstmt.setString(1, b);
								        		pstmt.setString(2, b1);
								        		ResultSet rs=pstmt.executeQuery();
								        		if(rs.next()){
								        			JOptionPane.showMessageDialog(null, "注册成功");//跳出警告框
								        		}else JOptionPane.showMessageDialog(null, "账号密码不能为空且前后输入不一致");//跳出警告框
												
									            
								            
								            
								            //要执行的SQL语句
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
								
							JOptionPane.showMessageDialog(null, "注册成功");//跳出警告框
							new Dyy();t.dispose();

							}else JOptionPane.showMessageDialog(null, "账号密码不能为空且前后输入不一致");//跳出警告框
						}
			            
			            
			            
			           
			            /*Statement stmt = null;
						@SuppressWarnings("null")
						ResultSet rset = stmt.executeQuery("select count(*) totalCount from yourTableName");
			            int rowCount = 0;
			            if(rset.next()) {
			            rowCount=rset .getInt("totalCount ");}*/
			             //3.ResultSet类，用来存放获取的结果集！！
			            
		 
							
			  /*           System.out.println("-----------------");
			            System.out.println("执行结果如下所示:");  
			             System.out.println("-----------------");  
			             System.out.println("姓名" + "\t" + "职称");  
		             System.out.println("-----------------");  */
			            
			               
			
			
			
			
			
			
			
			
			
			
			
			
		/*	if(e.getSource()==b1)//当点击按键b1时
			{
		/*		if((x1.getText().equals(null)) && (x2.getText().equals(null)))
				{
					JOptionPane.showMessageDialog(null, "前后输入不一致");
				}*/
		
			/*	if((x3.getText().equals(x2.getText())) && (x1.getText().length()!=0) && (x2.getText().length()!=0))
				{
					String b=x1.getText();String b1=x2.getText();
				JOptionPane.showMessageDialog(null, "注册成功");//跳出警告框
				new Dyy();t.dispose();
				Xwj x=new Xwj();
				Xwj x1=new Xwj();
				
					try {
						x.wj("C:\\Users\\Administrator\\Desktop\\java！\\7\\src\\11\\src\\wj.txt",b);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		
					int q=0;
					String a =""+q;
					Xwj x2=new Xwj();
					
					try {
						x2.wj("./src/Yhxt/qian.txt",a);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		
					
				
				try {
					x1.wj("C:\\Users\\Administrator\\Desktop\\java！\\7\\src\\11\\src\\wj1.txt",b1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}
				else JOptionPane.showMessageDialog(null, "账号密码不能为空且前后输入不一致");//跳出警告框
				*/
			
		}

		}
 
