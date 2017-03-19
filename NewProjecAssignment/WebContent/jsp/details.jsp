<%@page import="java.util.ArrayList"%>
<%@page import="newassignment.UserClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>body{

  background-image:url("bridgelabz.jpg");
  background-repeat: no-repeat;
   background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%

if(session.getAttribute("name")==null)
{
	response.sendRedirect("Login.jsp");
} 
%>

</head>
<body>details are
<% UserClass ul=(UserClass)request.getAttribute("name");


{%>
	<%-- <table border="1">
	<tr><th>first name</th><td> <%out.println(ul.getFirsname());%></td></tr>
	<tr><th>middle name</th><td><%out.println(ul.getMiddlename());%></td></tr>
	<tr><th>last name</th><td><%out.println(ul.getLastname());%></td></tr>
	<tr><th>email</th><td><%out.println(ul.getEmail());%></td></tr>
	</table> --%>
	
	
	<table border="2">
	<tr>
	<th>first name</th>  
	<th>middle name</th> 
	<th>last name</th>   
	<th>email</th>
	</tr>
	<tr>
	<td><%out.println(ul.getFirsname());%></td>  
	<td><%out.println(ul.getMiddlename());%></td>  
	 <td><%out.println(ul.getLastname());%></td>
	<td> <%out.println(ul.getEmail());%></td></tr>
	</table>
	
<% }%>
<form action="logout1" method="get">
<input type="submit" value="logout">
</form>
</body>
</html>