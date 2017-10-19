<html>
<head>
<title>validator</title>
</head>
<body>

<%

String rollno= request.getParameter("rollno");
String batch= request.getParameter("batch");

session.setAttribute("rollno", rollno);
int m1=87, m2=48, m3=79;

session.setAttribute("m1", m1);
session.setAttribute("m2", m2);
session.setAttribute("m3", m3);

response.sendRedirect("result.jsp");

%>


</body>
</html>