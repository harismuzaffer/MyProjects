<html>
<head>
<title>vaidate</title>
</head>
<body>


<%

String fname= request.getParameter("fname");
session.setAttribute("fname", fname);

%>
Hello, Dear ${fname} welcome to our website <br> <br>
<a href='logout.jsp'>Logout </a>



</body>
</html>