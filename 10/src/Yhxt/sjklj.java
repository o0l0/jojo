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
	 		System.out.println("���������� ��0--����ע�ᣬ1--�����¼");
	 		Scanner input = new Scanner(System.in);
	 		while(true){
	 			//ע��ģ��
	 			if (input.nextInt()==0) {
	 				//Ĭ����������ַ��������Խ�����Ե�ʱ�������ַ���
	 				while(true){
	 					System.out.println("�û�����");
	 					Scanner scanner = new Scanner(System.in);
	 					//��ȡ�û���
	 					userID = scanner.nextLine(); 
	 					System.out.println("����:");
	 					Scanner scanner2 = new Scanner(System.in);
	 					//��ȡ����
	 					psw1 = scanner2.nextLine();
	 					//�ȼ���û����Ƿ���ڣ��������������ע��
	 					String sql2 = "select * from usb3 where zh ="+"'"+userID+"'";
	 					DBHelper DBquery = new DBHelper();
	 					ResultSet rsSet =  DBquery.DB(sql2);
	 					if (rsSet.next()) {
	 						System.out.println("���û����ѱ�ע��,����������û����ٽ���ע��");
	 						DBquery.downConn();
	 						break;
	 					}
	 					else{
	 						String sql = "insert into usb3 (zh,mm) values ('fzynzs','fzynzs')";
	 						DBHelper DBupdate = new DBHelper();
	 						DBupdate.excuteSql(sql);
	 						System.out.println("��ϲ��ע��ɹ�");
	 						//�ر�connection������Ŷ����ֹй¶
	 						DBupdate.downConn();
	 						scanner.close();
	 						scanner2.close();
	 						break;
	 					}
	 				}
	 			}
	 			//��¼ģ��
	 			else {
	 				//Ĭ����������ַ��������Խ�����Ե�ʱ�������ַ���
	 				System.out.println("�û�����");
	 				Scanner scanner = new Scanner(System.in);
	 				userID = scanner.nextLine(); 
	 				System.out.println("���룺");
	 				Scanner scanner2 = new Scanner(System.in);
	 				psw1 = scanner2.nextLine();
	 				//*�������������
	 				String sql2 = "select * from usb3 where zh ="+"'"+userID+"'"+"and mm="+"'"+psw1+"'";
	 				//ÿ���½�һ�����󣬾����½�һ������connection
	 				DBHelper dbHelper = new DBHelper();
	 				//�����ݿ��в�ѯ�������������ڷ��ص�¼�ɹ�
	 				ResultSet rsResultSet = dbHelper.DB(sql2);
	 				if(rsResultSet.next()==true){
	 					System.out.println("��¼�ɹ�");
	 					dbHelper.downConn();
	 				}
	 				else{
	 					System.out.println("��¼ʧ�ܣ����������û����������Ƿ���ȷ");
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
		        //����������
		         String driver = "com.mysql.cj.jdbc.Driver";
		         //URLָ��Ҫ���ʵ����ݿ���mydata
		         String url = "jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
	       //MySQL����ʱ���û���
		         String user = "root";
			         //MySQL����ʱ������
			         String password = "zzl123";
		        //������ѯ�����
		        
		             //������������
			             Class.forName(driver);
			            //1.getConnection()����������MySQL���ݿ⣡��
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

