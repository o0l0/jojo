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

import mybean.date.FenYe;

	public class lookServlet extends HttpServlet {
		
		
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.printf("***************");
		Connection con;
		Statement st;
		ResultSet rs = null;
		String id=request.getParameter("name");
		String ID="'gly'";
		//System.out.print("MMMmmmmmmmMMMMM"+id);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.printf("^^^^^^^^^^^^");
		}catch(Exception e){System.out.printf("加载驱动出错");}
		try{
			String uri="jdbc:mysql://127.0.0.1:3306/wdnmd?useSSL=false&serverTimezone=UTC";
			//String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
			String name="root";
			String pwd="zzl123";
			con=DriverManager.getConnection(uri,name,pwd);
			st=con.createStatement();
			if(id.equals(ID))
			{
				
				rs=st.executeQuery("select * from usera");
				System.out.print("MMMmmmmmmmMMMMM"+id);
				
				String a="gly";
				System.out.print(" 管理圆"+a);
				request.setAttribute("value1", a);
				request.getRequestDispatcher("admin/qbhy.jsp").forward(request, response);
				/*
				request.setAttribute("value2", ID);
				request.getRequestDispatcher("admin/qbhy.jsp").forward(request, response);*/
			
			}
			else
			{
				rs=st.executeQuery("select * from user");
				System.out.print("MMMmmmmmmmMMMMM"+id);
				
				String a="hy";
				System.out.print("管理员"+a);
				request.setAttribute("value1", a);
				request.getRequestDispatcher("admin/qbhy.jsp").forward(request, response);
				
			/*	request.setAttribute("value2", ID);
				request.getRequestDispatcher("admin/qbhy.jsp").forward(request, response);*/
			}
			CachedRowSetImpl rowset=null;
			rowset=new CachedRowSetImpl();
			rowset.populate(rs);
			FenYe fy=new FenYe();
			HttpSession session=request.getSession(true);
			session.setAttribute("fy", fy);
			fy.setRowset(rowset);
			con.close();
		//	System.out.printf(")))))))))))))))");
		}catch(Exception e1){System.out.print(e1);}
		response.sendRedirect("admin/qbhy.jsp");
		//request.getRequestDispatcher("admin/Zengjia.jsp").forward(request, response);
	}

}
