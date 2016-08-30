
<%@ include file ="Header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGOUT</title>
<style> 
  body
  {
  background-color:#1A5276;
  }
  </style>


<script type="text/javascript" src="https://gc.kis.scr.kaspersky-labs.com/F735D753-CB57-2144-9288-48F787DAC4FC/main.js" charset="UTF-8"></script></head>
<body>
<% 
session.invalidate();
%>
<br><br>
<center><h1>YOU HAVE SUCCESFULLY LOGGED OUT</h1></center>

</body>
</html>
