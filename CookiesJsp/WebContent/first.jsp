<html>
<head>
<title>from form to first</title>
</head>
<body>

<%

String s= request.getParameter("fav");
Cookie c= new Cookie("lang", s);
c.setMaxAge(3000000);
response.addCookie(c);
response.sendRedirect("second.jsp");

%>


</body>
</html>