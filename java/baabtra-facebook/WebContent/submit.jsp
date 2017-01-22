<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="mypoject.Logic.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Submit page</h1>
<%
String firstname= request.getParameter("first_name");
String lastname= request.getParameter("last_name");
int mobNum= Integer.parseInt(request.getParameter("mob_num"));
String email= request.getParameter("email");
String password= request.getParameter("password");
insert_data ob=new insert_data();
int status=ob.signUp(firstname,lastname,mobNum,email,password);


%>
<ul>
<li><p><b>First Name:</b><%= request.getParameter("first_name")%></p></li>
<li><p><b>Last  Name:</b><%= request.getParameter("last_name")%></p></li>
<li><p><b>Mobile Number :</b><%= request.getParameter("mob_num")%></p></li>
<li><p><b>Email:</b><%= request.getParameter("email")%></p></li>
</ul>
</body>
</html>