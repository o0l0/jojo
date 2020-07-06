package myservlet.admin;

import java.io.IOException;
import sjkjh.upDate;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class update extends HttpServlet {
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=gb2312");
	PrintWriter out=response.getWriter();
		
	String text=request.getParameter("text");
	String oldmm=request.getParameter("oldmm");
	String newmm=request.getParameter("newmm");
	Connection con;
	PreparedStatement pst;
	try{
	/*	Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e){System.out.print(e);}
	try{
		String uri="jdbc:mysql://127.0.0.1:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String name="root";
		String pwd="zzl123";
		con=DriverManager.getConnection(uri,name,pwd);
		
		String url="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";
		String user="root";
		String pwdd="zzl123";
			con=DriverManager.getConnection(url,user,pwdd);*/
		
		String sql="update user set userpassword=? where username=?";
		upDate upDate = new upDate();
		upDate.upDate(sql,newmm,oldmm);
			
			
			
			
			
			
			
	/*		
		pst=con.prepareStatement(sql);
		pst.setString(1,newmm);
		pst.setString(2,text);
		pst.executeUpdate();*/
		System.out.print("wdnmd");
		//out.print("<script>alert('删除成功！！！');window.location.href='../qbhy.jsp'</script>");
		//out.print("<script>alert('更新成功！！！');window.location.href='admin/qbhy.jsp'</script>");
		out.print("<script>alert('更新成功！！！');window.location.href='admin/qbhy.jsp'</script>");

	}catch(Exception e1){System.out.print(e1);}
	
	
	
	}

}
