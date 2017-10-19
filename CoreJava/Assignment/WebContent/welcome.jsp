<html>
<head>
<title>Insert title here</title>
</head>
<body>

<%

HttpSession s= request.getSession();
if((s.getAttribute("uname"))!=null){
	out.print("<html> <body> <a href='yes.jsp'> hey </a> <a href='bye.jsp'> bye </a>");	
}
else
	response.sendRedirect("index.jsp");
	
%>

</body>
</html>