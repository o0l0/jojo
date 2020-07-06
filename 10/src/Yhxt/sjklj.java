package Yhxt;




	 import java.sql.Connection;
	 import java.sql.DriverManager;
	 import java.sql.PreparedStatement;
	 import java.sql.ResultSet;
	 import java.sql.SQLException;
	 import java.util.Scanner;
	  
	  
	 public class sjklj  {
	 	private static String userID;
	 	private static String psw1;
	 	
	 	public static void main(String args[]) throws ClassNotFoundException, SQLException{
	 		System.out.println("请输入数字 ：0--代表注册，1--代表登录");
	 		Scanner input = new Scanner(System.in);
	 		while(true){
	 			//注册模块
	 			if (input.nextInt()==0) {
	 				//默认输入的是字符串，所以建议测试的时候输入字符串
	 				while(true){
	 					System.out.println("用户名：");
	 					Scanner scanner = new Scanner(System.in);
	 					//获取用户名
	 					userID = scanner.nextLine(); 
	 					System.out.println("密码:");
	 					Scanner scanner2 = new Scanner(System.in);
	 					//获取密码
	 					psw1 = scanner2.nextLine();
	 					//先检查用户名是否存在，若不存在则继续注册
	 					String sql2 = "select * from usb3 where zh ="+"'"+userID+"'";
	 					DBHelper DBquery = new DBHelper();
	 					ResultSet rsSet =  DBquery.DB(sql2);
	 					if (rsSet.next()) {
	 						System.out.println("该用户名已被注册,请更换您的用户名再进行注册");
	 						DBquery.downConn();
	 						break;
	 					}
	 					else{
	 						String sql = "insert into usb3 (zh,mm) values ('fzynzs','fzynzs')";
	 						DBHelper DBupdate = new DBHelper();
	 						DBupdate.excuteSql(sql);
	 						System.out.println("恭喜您注册成功");
	 						//关闭connection的连接哦，防止泄露
	 						DBupdate.downConn();
	 						scanner.close();
	 						scanner2.close();
	 						break;
	 					}
	 				}
	 			}
	 			//登录模块
	 			else {
	 				//默认输入的是字符串，所以建议测试的时候输入字符串
	 				System.out.println("用户名：");
	 				Scanner scanner = new Scanner(System.in);
	 				userID = scanner.nextLine(); 
	 				System.out.println("密码：");
	 				Scanner scanner2 = new Scanner(System.in);
	 				psw1 = scanner2.nextLine();
	 				//*代表的是所有列
	 				String sql2 = "select * from usb3 where zh ="+"'"+userID+"'"+"and mm="+"'"+psw1+"'";
	 				//每次新建一个对象，就是新建一个连接connection
	 				DBHelper dbHelper = new DBHelper();
	 				//在数据库中查询结果，若结果存在返回登录成功
	 				ResultSet rsResultSet = dbHelper.DB(sql2);
	 				if(rsResultSet.next()==true){
	 					System.out.println("登录成功");
	 					dbHelper.downConn();
	 				}
	 				else{
	 					System.out.println("登录失败，请检查您的用户名和密码是否正确");
	 					dbHelper.downConn();
	 				}
	 				scanner.close();
	 				scanner2.close();
	 				break;
	 			}
	 		}
	 		input.close();
	 	}
	 }
	  
	 class DBHelper{
	 	public Connection connection;
	 	public PreparedStatement preparedStatement;
	 	
	 	public DBHelper() throws SQLException, ClassNotFoundException{
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
			             Class.forName(driver);
			            //1.getConnection()方法，连接MySQL数据库！！
			             con = DriverManager.getConnection(url,user,password);
	 		/*Class.forName("com.mysql.cj.jdbc.Driver");
	 		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC","root","zll123");
	 	*/
	 	}
	 	
	 	public ResultSet DB(String sql) throws ClassNotFoundException, SQLException{
	 		PreparedStatement  pstmt= connection.prepareStatement(sql);
	 	    ResultSet resultSet = pstmt.executeQuery();
	 	    return resultSet;
	 	}
	 	
	 	public void excuteSql(String sql) throws SQLException{
	 		PreparedStatement  pstmt = connection.prepareStatement(sql);
	 	    pstmt.executeUpdate();
	 	}
	 	
	 	public void downConn() throws SQLException{
	 		connection.close();
	 	}
	 	
	 }

