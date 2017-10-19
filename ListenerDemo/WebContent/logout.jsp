<html>
<head>
<title>Insert title here</title>
</head>
<body>

<%

session.removeAttribute("fname");
session.invalidate();
response.sendRedirect("index.html");

%>

</body>
</html>