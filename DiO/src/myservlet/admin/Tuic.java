package myservlet.admin;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Tuic extends HttpServlet {

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		session.invalidate();
		response.sendRedirect("admin/index.html");
		
	}

}
