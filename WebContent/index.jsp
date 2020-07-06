<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Principal</title>
</head>
<body>
	<h1>Entrar no Sistema</h1>
	<form action="LoginServlet" method="post">
		Login:<br/>
		<input type="text" id="login" name = "login">
		<br/><br/>
		Senha:<br/>
		<input type="password" id="senha" name = "senha">
		<br/><br/>
		<input type="submit" value="Logar">
	</form>
	


</body>
</html>