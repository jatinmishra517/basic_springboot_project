<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="gotoadd" style="display:inline-block; margin-right:10px;">
		<input type="submit" value="source side" ><br>
	</form>
	
	<form action="gotopriority" style="display:inline-block; margin-right:10px;">
		<input type="submit" value="our work"><br>
		
	</form>
	
	
	<form action="gotofetch" style="display:inline-block; margin-right:10px;">
		<input type="submit" value="client side"><br>
		
	</form>
	<br>
	<br>
	<br>
	<br>
	<br>
	<p>enter the sources</p>
	<form action="addSource">
		<input type="text" name="sid"><br>
		<input type="text" name="sname"><br>
		<input type="text" name="svalue"><br>
		<input type="submit" ><br>
		
	</form>
	<br>
	<br>

	
	<p>clear all!!<p>
	<form action="getClear">
		<input type="submit" ><br>
		
	</form>
	
	

</body>
</html>