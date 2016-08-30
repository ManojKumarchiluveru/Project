
<center> <h1 style="color:white"> Welcome To Professional Gaming </h1></center>
<%@include file="Header.jsp"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
 body
  {
  background-color:#404040;
  }
</style>
<script type="text/javascript" src="https://gc.kis.scr.kaspersky-labs.com/F735D753-CB57-2144-9288-48F787DAC4FC/main.js" charset="UTF-8"></script></head>
<body bgcolor="#1A5276">
<CENTER>
<CENTER>

<br>
<br>
<form action="<c:url value="j_spring_security_check" />" method="post">

<table>
  <center><h2><font color="white"><u>Enter your credentials below </u></font></h2>
  <br>



<tr>
<td style="color:black">USERNAME:</td>
<td><input type="text" name="j_username"/></td>
</tr>
<br>
<br>
<tr>
<td style="color:black">PASSWORD:</td>
<td><input type="password" name="j_password"/></td>
</tr>
<tr>
<td><input type="submit" value="Login"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form>
</CENTER>


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

