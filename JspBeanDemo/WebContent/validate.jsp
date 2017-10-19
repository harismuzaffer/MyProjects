<html>
<head>
<title>Insert title here</title>
</head>
<body bgcolor="yellow">

<jsp:useBean id="b1" class="com.useit.LoginBean"> </jsp:useBean>
<jsp:setProperty property="*" name="b1"/>

<h3>values u have entered::</h3>
<jsp:getProperty property="uname" name="b1"/> <br>
<jsp:getProperty property="pwd" name="b1"/> <br>
<jsp:getProperty property="age" name="b1"/> <br>


</body>
</html>