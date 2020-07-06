package c3p0;

import java.sql.Connection;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {
	//@Test
	public  void getDataSource() throws Exception {
		ComboPooledDataSource ds = new ComboPooledDataSource();	
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC");
		ds.setUser("root");
		ds.setPassword("zzl123");
		ds.setInitialPoolSize(10);
		ds.setMaxPoolSize(20);
		java.sql.Connection con = ds.getConnection();
		System.out.print("最最最最最最"+con);
		
	}
	
	
	
	//private static ComboPooledDataSource ds = new ComboPooledDataSource("itcast");	
	@Test
	public void getDataSource2() throws Exception {
		
		ComboPooledDataSource ds = new ComboPooledDataSource("itcast");
	   Connection con = ds.getConnection();
		System.out.print("最最最最最最"+con);
	
	}
	
	
}
