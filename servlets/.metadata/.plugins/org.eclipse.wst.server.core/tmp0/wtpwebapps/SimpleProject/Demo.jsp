<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>
	<h1>Hello World</h1>
	<%!
	public int add(int a,int b){
		return a+b;
	}
	%>
	<%
	int i=2;
	int j=4;
	%>
	
	<h3><%= add(i,j) %></h3>
	
	<% for(int index=0; index<10 ; index++){ %>
		<h3><%= index %></h3>
	<% } %>
	
	<p>The time is: <%= new Date() %> </p>
</body>
</html>