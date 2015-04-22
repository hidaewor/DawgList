<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Post A Listing</title>
</head>
<body>
   <h1>Post A Listing</h1>
   <form action="postItem">
      <label for="sellerName">Your Name</label>
      <input type="text" name="sellerName"/><br/>
      <label for="sellerEmail">Your Email</label>
      <input type="text" name="sellerEmail"/><br/>
      <label for="itemName">Item Name</label>
      <input type="text" name="itemName"/><br/>
      <label for="category">Item Category</label>
      <input type="text" name="category"/><br/>
      <label for="price">Item Price</label>
      <input type="text" name="price"/><br/>
      <label for="itemCondition">Item Condition</label>
      <input type="text" name="itemCondition"/><br/>
      <label for="description">Item Description</label>
      <input type="text" name="description"/><br/>
      <input type="submit" value="Submit"/><br/>
   </form>
</body>
</html>