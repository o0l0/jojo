package myservlet.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.sun.rowset.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybean.date.FenYea;

	public class lookServletfz extends HttpServlet {
		
		
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.printf("***************");
		Connection con;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.printf("^^^^^^^^^^^^");
			
		}catch(Exception e){System.out.printf("加载驱动出错");}
		try{
			String uri="jdbc:mysql://127.0.0.1:3306/wdnmd?useSSL=false&serverTimezone=UTC";
			//String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
			String name="root";
			String pwd="zzl123";
			con=DriverManager.getConnection(uri,name,pwd);
			st=con.createStatement();
			rs=st.executeQuery("select * from userc");
			if(rs.next())
			{
				System.out.printf("有数据");
			}else System.out.printf("没有数据");
			CachedRowSetImpl rowset=null;
			rowset=new CachedRowSetImpl();
			rowset.populate(rs);
			FenYea fya=new FenYea();
			HttpSession session=request.getSession(true);
			session.setAttribute("fya", fya);
			fya.setRowset(rowset);
			con.close();
			System.out.printf(")))))))))))))))");
		}catch(Exception e1){System.out.print(e1);}
		response.sendRedirect("admin/cksp.jsp");
		//request.getRequestDispatcher("admin/Zengjia.jsp").forward(request, response);
	}

}
