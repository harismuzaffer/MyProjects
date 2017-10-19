<%@page import="com.call.FunUtil"%>
<html>
<head>
<title>Fun</title>
</head>
<body>

converting string "hello all guys" to upper:::::
<%= FunUtil.makeItUpper("hello all guys") %>
<%= request.getHeader("USER-AGENT") %>


</body>
</html>