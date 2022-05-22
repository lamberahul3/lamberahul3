<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Lead</title>
</head>
<body>
<h1>Lead | save Lead</h1><br><hr>

	<form action="savelead" method="post">
	<pre>
		First Name 	<input type ="text" name="firstname"/>
		Last Name 	<input type ="text" name="lastname"/>
		E-mail		<input type="text" name="email"/>
		Lead Source:
				<select name="leadsource">
					<option value="tv commercial">TV Commercial</option>
					<option value="radio">Radio</option>
					<option value="news paper">News Paper</option>
					<option value="online">Online</option> 
				</select>
		Mobile 		<input type="text" name="mobile"/>
		<input type="submit" name="Save"/>
	</pre>
	</form>
</body>
</html>