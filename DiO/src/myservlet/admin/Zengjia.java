package myservlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybean.date.DengLu;
import sjkjh.Query;
import sjkjh.upDate;

public class Zengjia extends HttpServlet {

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.print("--------------");
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("gb2312");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		Connection con = null;
		PreparedStatement pst=null;
		ResultSet rs = null;
		try{
		
			String sql="select username name from user where username=?";
			Query query=new Query();
			List<DengLu> list=query.getForlist(DengLu.class,sql,name);
			//list.forEach(System.out::println);
			System.out.print("====="+list.size());
			
			if(list.size()!=0)
			{
				out.print("<script>alert('账号已存在');window.location.href='admin/Zengjia.jsp'</script>");
			}else{
			
				
				String sql2="insert into user(username,userpassword) values(?,?)";
				upDate upDate = new upDate();
				upDate.upDate(sql2,name,pwd);
				
				
				out.print("<script>alert('会员添加成功！！');window.location.href='admin/Zengjia.jsp'</script>");
			}	
		}catch(Exception e2){System.out.print(e2);};
		

		 	
		
	}

}
