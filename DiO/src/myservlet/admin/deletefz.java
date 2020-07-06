package myservlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class deletefz extends HttpServlet {
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=gb2312");
	PrintWriter out=response.getWriter();
		
	String userid=request.getParameter("id");
	int id=Integer.parseInt(userid);
	Connection con;
	PreparedStatement pst;
	try{
		System.out.print("wdnmd11");
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e){System.out.print(e);}
	try{
		String uri="jdbc:mysql://127.0.0.1:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String name="root";
		String pwd="zzl123";
		con=DriverManager.getConnection(uri,name,pwd);
		String sql="delete from userc where id=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1,id);
		pst.executeUpdate();
		con.close();
		pst.close();
		System.out.print("-------+-+-+-+-+------");
		//out.print("<script>alert('删除成功！！！');window.location.href='../qbhy.jsp'</script>");
		out.print("<script>alert('删除成功！！！');window.location.href='admin/cksp.jsp'</script>");
	}catch(Exception e1){System.out.print(e1);}
	
	
	
	}

}
