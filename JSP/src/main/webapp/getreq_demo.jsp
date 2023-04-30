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
String name = request.getParameter("uname");
String roll_num = request.getParameter("roll_no");
String city1 = request.getParameter("city");
out.println(name);
out.println(roll_num);
out.println(city1);

%>


</body>
</html>