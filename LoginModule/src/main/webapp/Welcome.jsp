<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//work for http 1.1 not for old
		response.setHeader("pragma", "no-cache");//http 1.0
		response.setHeader("Expires", "0"); //for proxies
		if(session.getAttribute("uname")==null)
		{
			response.sendRedirect("Login.jsp");
		}
	%>
	
yo...! 
<a href="Video.jsp">Click for Video!</a>
<form action="Logout">
<input type="submit" value="Logout">
</form>
</body>
</html>