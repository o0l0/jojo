package myservlet.control;

import java.io.IOException;
import mybean.date.DengLu;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

@SuppressWarnings("serial")
public class DengLuservlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		DengLu DL=null;
		//System.out.print("***");
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
		//System.out.print("++++");
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e2){
			System.out.print("¼ÓÔØÇý¶¯Ê§°Ü£¡£¡£¡");	
		}
		try {
		String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String user="root";
		String pwd="zzl123";
			con=DriverManager.getConnection(url,user,pwd);
		} catch (Exception e3) {
			System.out.print(e3);
		}
		System.out.print("%%%%");
		try	{
			st=con.createStatement();
			System.out.print("----");
			String sql="select * from user where username='"+name+"'and userpassword='"+password+"'";
			rs=st.executeQuery(sql);
			if(rs.next())
				response.sendRedirect("Cg.jsp");
				else
				response.sendRedirect("Sb.jsp");
		} catch (Exception e4) {
		
			System.out.print(e4);
		}
		
		
		 try {
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			 try {
					if(st!=null)
						st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			 try {
					if(con!=null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		 }
			 
		
		
		
	

}
