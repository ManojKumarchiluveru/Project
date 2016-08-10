<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>......</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<head>


<style>
body
{
  background-image:url(resources/images/pop.jpg);

   background-repeat:no-repeat;

   background-size:cover;
}
</style>

</head>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=email], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=password], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #003366;
    color: white;
    padding: 12px 15px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=cancel] {
    width: 40%;
    background-color: #003366;
    color: white;
    padding: 12px 15px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #004080;
}
input[type=cancel]:hover {
    background-color: #004080;
}

div {
    border-radius: 5px;
    padding: 20px;
}
</style>
<body>
<table>
<tr>
<td><h1> Login</h1></td>
</tr>
<div>
  <form action="Admin">
  	<tr>
	<td><label style="color:white" for="email">Email:</label></td>
    <td><input type="email" id="email" name="uemail" placeholder="Enter Email"></td>
    
    </tr>
	
	<tr>
    <td><label style="color:white" for="password">Password:</label></td>
    <td><input type="password" id="password" name="upassword" placeholder="Enter Password"></td>

	</tr>
    </select>
    
  	</tr>
    <tr>
    <td><input type="submit" value="Submit" style="margin-left: 10%"; ></td>
    <td><input type="cancel" value="Cancel" style="margin-left: 10%";></td>
    </tr>
  </form>
  </table>
</div>

</body>
</html>
