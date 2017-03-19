package newassignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ListOFUser extends HttpServlet
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
			{
		
		
		HttpSession session=req.getSession();
		String sessionName=(String) session.getAttribute("name");
		if(sessionName==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
			rd.include(req, resp);
			return;
		}
		
		JdbcHelper jdbcHelper=new JdbcHelper();
	    	PrintWriter out=resp.getWriter();
	    	
		    String name= req.getParameter("firstname");
		    System.out.println(name);
		     UserClass  all=jdbcHelper.listOfUser(name);
			    
	    	 req.setAttribute("name", all);
	    	//System.out.println(""+name);
    	   RequestDispatcher rd=req.getRequestDispatcher("details.jsp");
    	     rd.include(req, resp); 
     	}
}
