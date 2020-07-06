package myservlet.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.rowset.CachedRowSetImpl;

import mybean.date.FenYe;
import mybean.date.goodsbean;
import sjkjh.Query;

/**
 * Servlet implementation class lookServletsp
 */
public class lookServletsp extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	Connection con;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.printf("^^^^^^^^^^^^");
			
		}catch(Exception e){System.out.printf("加载驱动出错");}
		try{
			String uri="jdbc:mysql://127.0.0.1:3306/wdnmd?useSSL=false&serverTimezone=UTC";
			String name="root";
			String pwd="zzl123";
			con=DriverManager.getConnection(uri,name,pwd);
			st=con.createStatement();
			rs=st.executeQuery("select * from goods");

		
		CachedRowSetImpl rowset=null;
		
			rowset=new CachedRowSetImpl();
			rowset.populate(rs);
	
		
		FenYe fy=new FenYe();
		HttpSession session=request.getSession(true);
		session.setAttribute("fyy", fy);
		fy.setRowset(rowset);
		
		response.sendRedirect("admin/goods.jsp");
		
		}catch(Exception e1){System.out.printf("加载驱动出错");}
    }
}
		
		
		
		
		
		
		
	


