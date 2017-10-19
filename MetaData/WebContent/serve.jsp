<html>
<head>
<title>serve</title>
</head>
<body>

<b> <u> meta-data^^^ </u></b>

<% 

out.print(request.getHeader("USER-AGENT"));
out.print(request.getLocale());

%>

</body>
</html>