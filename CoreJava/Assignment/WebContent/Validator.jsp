<html>
<head>
<title>validator</title>
</head>
<body>

welcome mr/ms to validation... using jstl... ur full name is <br>

${param.fn} ${param.mn} ${param.ln} <hr>
and finally using servlet approach <br>

<% 

String fn= request.getParameter("fn");
String mn= request.getParameter("mn");
String ln= request.getParameter("ln");
out.print(fn+" "+mn+" "+ln);

%>


</body>
</html>