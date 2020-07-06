package myservlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Zengjiafz extends HttpServlet {

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("gb2312");
		
		Connection con;
		PreparedStatement ps = null;
		ResultSet rst;
		String fz=request.getParameter("lbei");
		System.out.print(fz);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("驱动加载成功！！");
			e.printStackTrace();
		}			
		String uri="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String name="root";
		String pass="zzl123";
		try {
			con=DriverManager.getConnection(uri,name,pass);
		/*	String sql="select * from show where fzhang=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,fz);
			rs=ps.executeQuery();*/
			
			
			ps=con.prepareStatement("select * from userc where fz=?");
			ps.setString(1,fz);
		    rst=ps.executeQuery();
		    if(rst.next())
			{
			
				out.print("<script>alert('商品已存在');window.location.href='admin/spzs.jsp'</script>");
			}else{
				ps=con.prepareStatement("insert into userc(fz) values(?)");
				ps.setString(1, fz);
				ps.executeUpdate();
				out.print("<script>alert('商品添加成功！！');window.location.href='admin/spzs.jsp'</script>");
				//out.print("<script>alert('恭喜你注册成功！！');window.location.href='0401.html'</script>");
			}	
		}catch(Exception e2){System.out.print(e2);};
		
		
		
		
		
		
		
	}	
		
}
