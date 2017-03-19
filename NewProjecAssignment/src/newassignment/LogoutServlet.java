package newassignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		Cookie ck[]=req.getCookies();  
		/*for(int i=0;i<ck.length;i++){  
		 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
		} */ 	
		HttpSession session =req.getSession();
		// session.removeAttribute("name"); // NOTE: not need to remove - it will be remove automatically on invalidate
		session.invalidate();
		HttpSession session2 = req.getSession();
		resp.sendRedirect("welcome.jsp");
	}

	
	
}