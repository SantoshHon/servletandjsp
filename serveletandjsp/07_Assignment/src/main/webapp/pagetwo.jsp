<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("txtName");
session.setAttribute("username", name);
%>
<h3>page Two</h3>
<form action="display.jsp">
		Enter Address <input type="text" name="txtAddress"> 
		<br>
		<input type="submit" value="Ok"> 
		
</form>
</body>
</html>