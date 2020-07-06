<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ tablib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Usuário</title>
</head>
<body>

	<h1>Cadastrar Novo Usário</h1>
	
	<form action="salvarUsuario" method='post'>
		<table>
			<tr>
				<td>Login</td>
				<td><input type="text" id="login", name="login"></td>
			</tr>
			<tr>
				<td>Senha</td>
				<td><input type="password" id="senha", name="senha"></td>
			</tr>			
			<tr>
				<td></td>
				<td><input type="submit" value="Salvar"></td>
			</tr>
		</table>
	</form>
	
	
	<table>
		<tr>
			<td>Login</td>
			<td>Senha</td>
		</tr>	

				  
	</table>
	

</body>
</html>