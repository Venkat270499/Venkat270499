<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    
    <f:form modelAttribute="cust">
    
    <table align="center">
    <tr><td>Enter CName</td> <td><f:input path="cname"/></td></tr>
    <tr><td>Enter Gender</td> <td><f:input path="gender"/></td></tr>
    <tr><td>Enter City</td> <td><f:input path="city"/></td></tr>
    <tr><td>Enter Age</td> <td><f:input path="age"/></td></tr>
    <tr><td><input type="submit" value="Register"/></td></tr>
    </table>
      
    </f:form>
    
    <p align="center"><a href="/">home</a></p>
    
