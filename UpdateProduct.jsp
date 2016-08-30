
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Product!</title>
  
  
 <style>
 body{
 background-image:url('resources/images/bo8.png');
 background-size:cover;
 }
 </style>
  
<script type="text/javascript" src="https://gc.kis.scr.kaspersky-labs.com/F735D753-CB57-2144-9288-48F787DAC4FC/main.js" charset="UTF-8"></script></head>
<body>
<br><br><br><br><br><br><br><br><br>
<center><h2><font color="magenta">Sign Up!</font></h2></center>
      
       <form:form action="updateproduct" method="post" commandName="product" modelAttribute="product" enctype="multipart/form-data">
<table>
<tr>
<td>Product Name : </td>
<td><form:input path="pname" /><form:label path="pname" style="color:red"></form:label></td>
</tr>
<tr>
<td>Product Description : </td>
<td><form:input path="pdescription" /><form:label path="pdescription" style="color:red"></form:label></td>
</tr>
<tr>

<tr>
<td>Product Price : </td>
<td><form:input path="pprice"/><form:label path="pprice" style="color:red"></form:label></td></tr>
<tr>
<td>Product Quantity :</td>
<td><form:input path="pquantity"/><form:label path="pquantity" style="color:red"></form:label></td></tr>
<tr>
<td><form:label path="img">Image Upload:</form:label></td>
 <td><form:input type="file" path="img"  /></td>
                </tr>

<tr colspan="2">
<td><input type="submit" value="Update Product"></td>
</tr>
</table>
</form:form>
      
</body>
</html>
      
