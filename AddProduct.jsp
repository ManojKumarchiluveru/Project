<%@ include file="AHeader.jsp" %>
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
<br><br><br>
<center><h4>Add Product...!</center>
<div align="center">
    <form:form action="addproduct" method="post" commandName="product" modelAttribute="product" enctype="multipart/form-data">
        <table border="0">
            <tr>
             <td><form:label path="pname"> <h4>Product Name:</form:label></td>
              <td><form:input path="pname" /></td>
            </tr>
           
           <tr>
             <td><form:label path="pdescription"> <h4>Product Description:</form:label></td>
              <td><form:input path="pdescription" /></td>
            </tr>
            <tr>
                <td><form:label path="pprice"><h4>Product Price:</form:label></td>
               <td><form:input path="pprice" /></td>
            </tr>
            <tr>
            <td><form:label path="pquantity"><h4>Product Quantity:</form:label></td>
                <td><form:input path="pquantity" /></td>
            </tr><br>     
            <tr>
                 <td><form:label path="img"><h4>Image Upload:</form:label></td>
                 <td><form:input type="file" path="Img"  /></td>
           </tr>  
           <tr>
            <td><form:label path="category">
            <h4>Category :</form:label></td>
            <td><form:select path="category.cname" items="${categoryList}" itemValue="cname" itemLabel="cname" /></td>
            </tr>


        <tr>
        <td><form:label path="supplier">
        <h4>Supplied By:</form:label></td>
        <td><form:select path="supplier.supname" items="${supplierList}" itemValue="supname" itemLabel="supname" /></td>
        </tr>     
   
<tr colspan="2">
<td><input type="submit" value="Add Product"></td>
</tr>
</table>
</form:form>

<br>
<br><br><br>
<br><br><br>

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