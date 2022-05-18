<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String loginId;%>
<%
loginId=request.getParameter("txtlogin");
//out.println("hello "+  loginId);
%>
<h3>Try Again  <%=loginId %></h3>
</body>
</html>