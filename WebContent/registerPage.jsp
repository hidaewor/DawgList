<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="register">
	<label for="customerUsername">Username:</label>
      <input type="text" name="customerUsername"/><br/>
      <label for="customerEmail">Email:</label>
      <input type="text" name="customerEmail"/><br/>
      <label for="customerPass">Password:</label>
      <input type="password" name="customerPass"/><br/>
      <input type="submit" value="Register"/>
   </form>
</body>
</html>