<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
   <title>Yahoo! From JSP</title>
</head>
<%
   Date date = new Date();
%>
<body>
   MY First JSP<br>
   My name is ${name}<br>
   My password is ${password}
   
   <div>
      Current date is <%= date %>
   </div>
</body>
</html>