package Yhxt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Zhs{
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Dyy c =new Dyy();
	//添加图片
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
		             //3.ResultSet类，用来存放获取的结果集！！
		             ResultSet rs = ((java.sql.Statement) statement).executeQuery(sql);
		             System.out.println("-----------------");
		            System.out.println("执行结果如下所示:");  
		             System.out.println("-----------------");  
		             System.out.println("姓名" + "\t" + "职称");  
	             System.out.println("-----------------");  
		              
		             String job = null;
		             String id = null;
		             while(rs.next()){
	                 //获取stuname这列数据
		                 job = rs.getString("zh");
		                 //获取stuid这列数据
		                 id = rs.getString("mm");
		
	                 //输出结果
		                 System.out.println(id + "\t" + job);
		             }
		             rs.close();
		             con.close();
		         } catch(ClassNotFoundException e) {   
		             //数据库驱动类异常处理
		             System.out.println("Sorry,can`t find the Driver!");   
	             e.printStackTrace();   
		             } catch(SQLException e) {
	             //数据库连接失败异常处理
		             e.printStackTrace();  
		            }catch (Exception e) {
		             // TODO: handle exception
		            e.printStackTrace();
		                    }finally{
		                        System.out.println("数据库数据成功获取！！");
		                     }
		                }
		             
			//c.getContentPane().setVisible(false);
			// s="D:jgk.jpg";
			///JLabel y3=new JLabel(new ImageIcon(s));
			//y3.setSize(400,180);
			//c.add(y3);
	
	}

