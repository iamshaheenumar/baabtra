<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facebook-form</title>
</head>
<body>
	<form name="SignUp" action="submit.jsp" method="post">
		<input  type="text" placeholder="First Name" name="first_name">
		<input  type="text" name="LastName" placeholder="last_name"><br><br>
		<input size="45" type="text" name="mob_num" placeholder="Mobile Number"><br><br>
		<input size="45" type="text" name="email" placeholder="Email"><br><br>
		<input size="45" type="password" name="password" placeholder="Password"><br><br>
		<p><font face="Arial" size="1" color="grey">By clicking Sign Up, You agree to our terms and that you have read our Data Use Policy,Including our Cookie Use </font> </p>
		<input type="submit" value="Submit">
	</form>

</body>
</html>