<!DOCTYPE html>
<html>
<head>


<style>
body
{
  background-image:url(resources/images/7.jpg);

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
    width: 280%;
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

<center><h1> SignUp</h1></center>
<table>
<div>
  <form action="Login">
  <tr>
    <td><label style="color:white" for="fname">First Name:</label></td>
    <td><input type="text" id="fname" name="ufirstname" placeholder="First name"></td>
   
    </tr>
<tr>
    <td><label style="color:white" for="lname">Last Name:</label></td>
    <td><input type="text" id="lname" name="ulastname" placeholder="Last name"></td>
   
	</tr>	
	
	<tr>
	<td><label style="color:white" for="email">Email:</label></td>
    <td><input type="email" id="email" name="uemail" placeholder="Enter Email"></td>
    
    </tr>
	
	<tr>
    <td><label style="color:white" for="password">Password:</label></td>
    <td><input type="password" id="password" name="upassword" placeholder="Enter Password"></td>

	</tr>
	
	<tr>
    <td><label style="color:white" for="gender">Gender:</label></td>
    <td><select id="gender" name="gender">
     <option value="male">Male</option>
     <option value="female">Female</option></td>
    </select>
    
  	</tr>
    <tr>
   <td><input type="submit" value="Register" style="margin-left: 100%";></td>
   
    </tr>
  </form>
  </table>
</div>

</body>
</html>
