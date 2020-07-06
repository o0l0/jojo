package myservlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybean.date.DengLu;

public class htdl extends HttpServlet {

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out=response.getWriter();
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
		PreparedStatement st = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e2){
			System.out.print("加载驱动失败！！！");	
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
			st=con.prepareStatement("select * from usera where adminname=? and password=?");
			st.setString(1,name);
			st.setString(2, password);
			rs=st.executeQuery();
			System.out.print("----");
			if(rs.next())
			{
				System.out.print("111----");
				response.sendRedirect("admin/index.jsp");
			}
				else
				out.print("<script>alert('没有权限！！');window.location.href='admin/index.html'</script>");
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
