<%@page import="java.util.ArrayList"%>
<html>
<head>
<title>Insert</title>
</head>
<body>

<form action="dataEntry.jsp">


Add new item <input type="text" name="item">
<br> <br>
<input type="submit" value="submit">
<input type="reset">
<br> <br>

</form>

<%

ArrayList<String> arr= (ArrayList<String>)session.getAttribute("item");
if(arr==null){
	arr= new ArrayList<String>();
}
if(request.getParameter("item")!="" && request.getParameter("item")!=null){
	arr.add(request.getParameter("item"));
	session.setAttribute("item",arr);
}
if(arr!=null){
	for(String s: arr){
		out.print(s+"<br>");
	}
}

%>


</body>
</html>