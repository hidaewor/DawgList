<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Purchase Successful</title>
</head>
<body>
<h3>You have successfully purchased this item</h3>
A receipt has been placed in your account details
<br/>
<s:url id="url" action="selectItem">
</s:url>
<s:a href="%{url}" >To Homepage</s:a>
</body>
</html>