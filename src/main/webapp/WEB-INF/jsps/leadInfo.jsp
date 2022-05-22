<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h2>Lead Info</h2><hr><br>
	
	First Name :  ${lead.firstname}<br/>
	Last Name :   ${lead.lastname}<br/>
	E-mail :      ${lead.email}<br/>
	Lead Source : ${lead.leadsource}<br/>
	Mobile :	  ${lead.mobile}<br/>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${lead.email}"/>
		<input type="submit" value="Send E-mail"/>
	</form>
	<form action="converToContact" method="post">
		<input type="hidden" name="id" value="${lead.id}"/>
		<input type="submit" value="Convert"/>
	</form>
</body>
</html>