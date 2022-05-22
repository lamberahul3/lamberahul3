<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c" %>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
	<a href="/crmapp/viewleadpage">Create New Lead</a>
	<h1>All Contacts</h1><br><hr><br>
	<table border=3>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last  Name</th>
			<th>E-Mail</th>
			<th>Lead Source</th>
			<th>Mobile</th>
			<th>Billing</th>
		</tr>
		<c:forEach var="contact" items="${contacts}">
			<tr>
				<td>${contact.id}</td>
				<td><a href="getContactById?id=${contact.id}">${contact.firstname}</a></td>
				<td>${contact.lastname}</td>
				<td>${contact.email}</td>
				<td>${contact.leadsource}</td>
				<td>${contact.mobile}</td>
				<td><a href="getIdForBilling?id=${contact.id}">Billing</a></td>
			</tr>
 		</c:forEach>
	</table>
	
</body>
</html>