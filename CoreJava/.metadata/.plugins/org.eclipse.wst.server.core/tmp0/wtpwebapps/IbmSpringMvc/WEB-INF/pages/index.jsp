<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h3> welcome</h3> ${user}
<a href="listCountries">listCountries</a>

<form action="getCountry" method="post">

	<input type="text" name="cid">
	<input type="submit" value="submit">

</form>


<form action="insertCountry" method="post">

	CountryId<input type="text" name="ctry.countryId">
	CountryName<input type="text" name="ctry.countryName">
	RegionId<input type="text" name="ctry.regionId">
	<input type="submit" value="insert">

</form>

</body>
</html>