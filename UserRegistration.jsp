<%@ include file ="Header.jsp" %>
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
<br>
<center><h2><font color="magenta">Sign Up!</font></h2></center>

 
      
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
<td>UserName : </td>
<td><form:input path="uusername" /><form:errors path="uusername" style="color:red"></form:errors></td>
</tr>
<tr>

<tr>
<td>Password : </td>
<td><form:password path="upassword"/><form:errors path="upassword" style="color:red"></form:errors></td></tr>

<tr>
<td>Confirm Password : </td>
<td><form:password path="cpassword"/><form:errors path="cpassword" style="color:red"></form:errors></td></tr>


<tr>
<td>EmaiId :</td>
<td><form:input path="uemail"/><form:errors path="uemail" style="color:red"></form:errors></td></tr>

<tr>
<td>Confirm EmaiId :</td>
<td><form:input path="uemail"/><form:errors path="uemail" style="color:red"></form:errors></td></tr>


<tr colspan="2">
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="Reset"></td>
</tr>
</table>
</form:form>
      
      
 <br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>     
      


<nav class="navbar navbar-inverse">
<ul class="w3-navbar w3-blue">

</ul>
  <div class="footer">
            <div class="footer-center">
                <div style="color: White; height: 25px">
                    <p>
                        <span style="float: left">Copyright © 2016 · All Rights Reserved </span>

                        <span style="float: right">Design & Developed by &nbsp;<a href=""
                            style="color: RED;">ProfessionalGaming </a> </span>
                        <br />
                        <br />
                    </p>
                </div>
            </div>
        </div>
</nav>
</body>
</html>

      
