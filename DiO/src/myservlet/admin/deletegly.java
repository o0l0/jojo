package myservlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import sjkjh.upDate;
public class deletegly extends HttpServlet {
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
	
	try{    
		String sql="delete from usera where id=?";
		upDate upDate = new upDate();
		upDate.upDate(sql,id);
		
		
	
		out.print("<script>alert('É¾³ý³É¹¦£¡£¡£¡');window.location.href='admin/qbhy.jsp'</script>");
	}catch(Exception e1){System.out.print(e1);}
	
	
	
	}

}
