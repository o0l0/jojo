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
public class deletefzsp extends HttpServlet {
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=gb2312");
	PrintWriter out=response.getWriter();
		
	String id=request.getParameter("id");
	try{
		upDate upDate = new upDate();
		String sql="delete from goods where good_id=?";
		upDate.upDate(sql,id);
		//out.print("<script>alert('ɾ���ɹ�������');window.location.href='../qbhy.jsp'</script>");
		out.print("<script>alert('ɾ���ɹ�������');window.location.href='admin/goods.jsp'</script>");
	}catch(Exception e1){System.out.print(e1);}
	
	
	
	}

}
