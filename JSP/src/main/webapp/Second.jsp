<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage ="error.jsp" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testing error_handling</title>
</head>
<body>
<%!
int a=20;
int b=10;
%>
<%
int add=a/b;
%>
<h1>ans is--<%=add %></h1>
</body>
</html>