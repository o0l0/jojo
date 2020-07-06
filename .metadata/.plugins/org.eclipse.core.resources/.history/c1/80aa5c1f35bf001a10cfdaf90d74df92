package cn.itcast.jdbc.utils;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Connection;

public class C3p0Utils {
	@Test
	public void getDataSource() throws Exception {
		ComboPooledDataSource ds = new ComboPooledDataSource();	
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC");
		ds.setUser("root");
		ds.setPassword("zzl123");
		ds.setInitialPoolSize(10);
		java.sql.Connection con = ds.getConnection();
		System.out.print("最最最最最最"+con);
		
	}
}
