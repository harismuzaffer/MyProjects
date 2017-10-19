<html>
<head>
<title>result</title>
</head>
<body>

<%

String rollno= (String)session.getAttribute("rollno");
Integer m1= (Integer)session.getAttribute("m1");
Integer m2= (Integer)session.getAttribute("m2");
Integer m3= (Integer)session.getAttribute("m3");
int total= m1+m2+m3;

int avg= total/3;
String f= null;

if(avg>=80)
	f="distinction";
else if(avg>=60 && avg<80)
	f="first grade";
else if(avg>=40 && avg<60)
	f="pass";
else
	f="failed!!!!!";
out.println("result of "+rollno+" is "+f);

%>


</body>
</html>