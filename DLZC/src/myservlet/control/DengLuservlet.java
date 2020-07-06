package myservlet.control;

import java.io.IOException;
import mybean.date.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

public class DengLuservlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		DengLu DL=null;
		HttpSession session=request.getSession(true);
		try{
			DL=(DengLu)session.getAttribute("DL");
			if(DL==null){
				DL=new DengLu();
				session.setAttribute("DL", DL);
			}
			
		}catch(Exception e1)
		{DL=new DengLu();
		session.setAttribute("DL", DL);}
		request.setCharacterEncoding("gb2312");
		String name=request.getParameter("zh");
		String password=request.getParameter("mm");
		DL.setName(name);
		DL.setPassword(password);
		
		Connection con;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jc.jdbc.Driver");
		}catch(Exception e2){
			System.out.print("¼ÓÔØÇý¶¯Ê§°Ü£¡£¡£¡");	
		}
		try {
		String url="jdbc:mysql://127.0.0.1:3306/wdnmd"+"user=root&password=zzl123";
		
			con=DriverManager.getConnection(url);
			st=con.createStatement();
			String sql="select * from user where username='"+name+"'and password='"+password+"'";
			rs=st.executeQuery(sql);
			if(rs.next())
				response.sendRedirect("Cg.jsp");
				else
				response.sendRedirect("Sb.jsp");
		} catch (Exception e3) {
		
		
		}
		
		
		
		
		
		
	}

}
