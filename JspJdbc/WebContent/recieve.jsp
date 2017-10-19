<%@page import="java.sql.*" %>

<html>
<head>
<title>recieve</title>
</head>
<body>


<%
String roll= request.getParameter("roll");
String name= request.getParameter("name");
String marks= request.getParameter("marks");

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
//PreparedStatement pst= con.prepareStatement("insert into mystd values(?, ?, ?)");
PreparedStatement pst= con.prepareStatement("select *from mystd");
//pst.setInt(1, Integer.parseInt(roll));
//pst.setString(2, name);
//pst.setInt(3, Integer.parseInt(marks));

//System.out.println(pst.executeUpdate());

ResultSet r= pst.executeQuery();
out.println("<ol type='1'>");
while(r.next()){
	out.println("<li>"+r.getInt(1)+"======"+r.getString(2)+"========"+r.getInt(3));
}
out.print("</li> </ol>");

pst.close();
con.close();
//out.print("query submitted");


%>


</body>
</html>