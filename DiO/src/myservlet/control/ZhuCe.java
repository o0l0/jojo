package myservlet.control;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ZhuCe extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("+++");
		
		request.setCharacterEncoding("gb2312");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String Email=request.getParameter("email");
		
		Connection con = null;
		PreparedStatement stm = null;
		ResultSet rs;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e){
			System.out.print("¼ÓÔØÇý¶¯´íÎó£¡£¡");
		}
		System.out.print("---");
		try{
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out=response.getWriter();
			//String url="jdbc:mysql://127.0.0.1:3306/wdnmd?"+"user=root&password=zzl123&characterEncoding=gb2312";
			//con=DriverManager.getConnection(url);
			String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
			String user="root";
			String pwd="zzl123";
				con=DriverManager.getConnection(url,user,pwd);
			System.out.print("666");
			
			stm=con.prepareStatement("select * from user where username=?");
			stm.setString(1,name);
		    rs=stm.executeQuery();
			if(rs.next())
			{
				out.print("<script>alert('ÕËºÅÒÑ´æÔÚ');window.location.href='402.html'</script>");
			}else
			{
			stm=con.prepareStatement("insert into user(username,userpassword,email) values(?,?,?)");
			stm.setString(1,name);
			stm.setString(2, password);
			stm.setString(3, Email);
			stm.executeUpdate();
			out.print("<script>alert('¹§Ï²Äã×¢²á³É¹¦£¡£¡');window.location.href='0401.html'</script>");}
			 // out.print("<script>alert('¹§Ï²Äã×¢²á³É¹¦');window.location.href='0401.html'</script>");
			//response.sendRedirect("0401.html");
		}catch(Exception e1){
			System.out.print(e1);
			
				 try {
						if(stm!=null)
							stm.close();
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

}
