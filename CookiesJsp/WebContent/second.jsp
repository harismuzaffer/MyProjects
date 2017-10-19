<html>
<head>
<title>retrieve the cookies</title>
</head>
<body>


<%

Cookie c[]= request.getCookies();
for(Cookie cc: c){
	if(cc.getName().equals("lang"))
		out.println("<font color='red'> Your fav lang is "+cc.getValue());
}

%>


</body>
</html>