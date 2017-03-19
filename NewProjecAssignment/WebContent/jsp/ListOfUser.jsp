<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{

  background-image:url("12.jpg");
  background-repeat: no-repeat;
   background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<form action="list" method="get"> 
<pre>
<bold><th><center>enter the name to serch full details :<input type="text" name="firstname" placeholder="enter the name to serch the database"> 
 <input type ="submit" value ="submit"></center>
</pre>
<%

if(session.getAttribute("name")==null)
{
	response.sendRedirect("Login.jsp");
} 
%>
<body>
<table border="2">
<th><font color="red"	>list of users  are</font></th><br>
<%ArrayList al=(ArrayList)request.getAttribute("firstname");

for(Object al1:al)
{%>

&nbsp;<tr><td><font color="purple"	> <% out.println(al1.toString());%></font></td></tr>
<% }%>
</table>


</body>
</html>