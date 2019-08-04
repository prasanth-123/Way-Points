<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style> 
textarea {
    width: 100%;
    height: 150px;
}
</style>
</head>
<body>
<form action="save" method="post">
Enter the Command:<br>
<textarea name="EC"></textarea>
<input type="submit" value="Save">
</form>
<form action="submit" method="post">
<input type="submit" value="Submit">
</form>
</body>
</html>