<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="html" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login">
      <label for="customerEmail">Username:</label>
      <input type="text" name="customerUsername"/><br>
      <label for="customerPass">Password:</label>
      <input type="password" name="customerPass"/>
      <input type="submit" value="Login"/>
   </form>
   
  <!--<a href="<s:url action='goToRegister'/>">Register</a> -->
  <a href = "registerPage.jsp">Register</a>
   
</body>
</html>