<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
<h1>Billing | Create</h1><br><hr>

	<form action="generateBill" method="post">
	<pre>
		First Name 	<input type ="text" name="firstname" value="${contact.firstname}" readonly>
		Last Name 	<input type ="text" name="lastname" value="${contact.lastname}" readonly>
		E-mail		<input type="text" name="email" value="${contact.email}" readonly>
		Mobile 		<input type="text" name="mobile" value="${contact.mobile}" readonly>
		Product		<input type="text" name="product"/>
		Amount 		<input type="text" name"amount"/>
		Mode of Payment: 
		  Cash		<input type="radio" name="mode" value="Cash"> 
	   	  Online	<input type="radio" name="mode" value="Online"> 
		
		<input type="submit" value="Generate"/>
	</pre>
	</form>
</body>
</html>