<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <H1><center>Result for <%=request.getParameter("a1")%></center></H1>
<%
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
		 
int k=0;
String str = request.getParameter("a1");
if(str.equals("add"))
	k=num1+num2;
if(str.equals("sub"))
	k=num1-num2;
if(str.equals("mul"))
	k=num1*num2;
if(str.equals("div"))
	k=num1/num2;
%>

Result is:<%= k %>


</body>
</html>