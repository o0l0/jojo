package cheshi;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Zhs {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//Dyy c =new Dyy();
	
		 
	
		
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
		            String sql = "select * from usb";
		             //3.ResultSet�࣬������Ż�ȡ�Ľ��������
		             ResultSet rs = ((java.sql.Statement) statement).executeQuery(sql);
		             System.out.println("-----------------");
		            System.out.println("ִ�н��������ʾ:");  
		             System.out.println("-----------------");  
		             System.out.println("����" + "\t" + "ְ��");  
	             System.out.println("-----------------");  
		              
		             String job = null;
		             String id = null;
		             while(rs.next()){
	                 //��ȡstuname��������
		                 job = rs.getString("zh");
		                 //��ȡstuid��������
		                 id = rs.getString("mm");
		
	                 //������
		                 System.out.println(id + "\t" + job);
		             }
		             rs.close();
		             con.close();
		         } catch(ClassNotFoundException e) {   
		             //���ݿ��������쳣����
		             System.out.println("Sorry,can`t find the Driver!");   
	             e.printStackTrace();   
		             } catch(SQLException e) {
	             //���ݿ�����ʧ���쳣����
		             e.printStackTrace();  
		            }catch (Exception e) {
		             // TODO: handle exception
		            e.printStackTrace();
		                    }finally{
		                        System.out.println("���ݿ����ݳɹ���ȡ����");
		                     }
		                }
		             
		             }
