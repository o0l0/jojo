package cookieServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookie extends HttpServlet {
	
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		System.out.print(name);
		if("w".equals(name)&&"w".equals(password)){
			System.out.print("µÇÂ¼³É¹¦");
			Cookie c=new Cookie("key",name);
			c.setMaxAge(60*60*24);
			response.addCookie(c);
			
			System.out.print(c.getValue());
		}
		else System.out.print("µÇÂ¼Ê§°Ü");
		
	
		
	}

}
