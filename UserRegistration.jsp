
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
  <title>Sign Up!</title>
  
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

 <!--<form method ="post" action="register">
   <center>
   <table width="350">
   <tr><td><font color="magenta"><h4>FirstName:</h4></font></td><td> <input type="text" name = "firstname" placeholder="Enter your firstname here"></td></tr>
    <tr><td><font color="magenta"><h4>MiddleName:</h4></font></td><td> <input type="text" name = "middlename" placeholder="Enter your middlename here"></td></tr>
     <tr><td><font color="magenta"><h4>LastName:</h4></font></td><td> <input type="text" name = "lastname" placeholder="Enter your lastname here"></td></tr>
   <tr><td><font color="magenta"><h4>Email:</h4></font></td><td> <input type="email" name = "email" placeholder="Enter your email id here"></td></tr>
    <tr><td><font color="magenta"><h4>User Name:</h4></font></td><td> <input type="text" name = "username" placeholder="Set your username here"></td></tr>
   <tr><td><font color="magenta"><h4>Password:</h4></font></td><td> <input type="password" name = "password" placeholder="Set your password here"></td></tr>
   <input type = "hidden" value="false" name ="hb">
   <input type = "hidden" value="true" name ="hbb">
 
        <tr><td><button type="submit" class="btn btn-success">Submit</button></td>
        <td><button type="reset" class="btn btn-default">Reset</button> </td></tr>   
      
      </table>
      </center>
      </form>-->
      
      <form:form action="userregistration" commandName="user" method="POST">
<table>
<tr>
<td>FirstName : </td>
<td><form:input path="ufirstname" /><form:errors path="ufirstname" style="color:red"></form:errors></td>
</tr>
<tr>
<td>LastName : </td>
<td><form:input path="ulastname" /><form:errors path="ulastname" style="color:red"></form:errors></td>
</tr>
<tr>

<tr>
<td>Password : </td>
<td><form:password path="upassword"/><form:errors path="upassword" style="color:red"></form:errors></td></tr>
<tr>
<td>EmaiId :</td>
<td><form:input path="uemail"/><form:errors path="uemail" style="color:red"></form:errors></td></tr>

<tr colspan="2">
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="Reset"></td>
</tr>
</table>
</form:form>
      
      
</body>
</html>

      
