<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SupplierPage</title>
</head>
<body>

<form method ="post" action="addsupplier">
   <center>
   <table width="350">
   
    <tr><td><font color="magenta"><h4>Supplier Name:</h4></font></td><td> <input type="text" name = "sname"></td></tr>
    <tr><td><font color="magenta"><h4>Supplier Address:</h4></font></td><td> <input type="text" name = "saddress"></td></tr> 
  
 
        <tr><td><button type="submit" class="btn btn-success">Submit</button></td>
        <td><button type="reset" class="btn btn-default">Reset</button> </td></tr>   
      
      </table>
      </center>
      </form>



</body>
</html>