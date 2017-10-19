<html>
<head>
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="hh" class="com.useit.LoginBean"> </jsp:useBean>
<jsp:setProperty property="uname" value="NoManipal" name="hh"/>
<jsp:setProperty property="pwd" value="NO" name="hh"/>
<jsp:setProperty property="age" value="19" name="hh"/>

<h3>

<jsp:getProperty property="uname" name="hh"/> <br>
<jsp:getProperty property="pwd" name="hh"/> <br>
<jsp:getProperty property="age" name="hh"/> <br>

</h3>


</body>
</html>