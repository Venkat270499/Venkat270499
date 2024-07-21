<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<c:choose>
	<c:when test="${!empty culist}">
	<table align="center">
	<tr>
	<th>ID</th><th>Name</th><th>GENDER</th><th>CITY</th><th>AGE</th>
	</tr>
	<c:forEach var="cu" items="${culist}">
		<tr>
		<td>${cu.custid}</td>
		<td>${cu.cname}</td>
		<td>${cu.gender}</td>
		<td>${cu.city}</td>
		<td>${cu.age}</td>
		<td><a href="edit?no=${cu.custid}">Edit</a></td>
		<td><a href="delete?no=${cu.custid}">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
	
	</c:when>
	<c:otherwise>
		<h1>No Customer Details found</h1>
	</c:otherwise>
</c:choose>
	
	<p align="center"><a href="registeruser" >Register User</a><br></p>
	<p align="center"><a href="/" > Home</a></p>
<h1 style="color:green;text-align:center">${msgAtt} </h1><br>
<h1 style="color:green;text-align:center">${deleteMsg}</h1><br>