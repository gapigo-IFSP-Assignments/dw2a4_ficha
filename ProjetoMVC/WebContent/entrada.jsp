<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="cabecalho.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INICIO</title>
</head>
<body>
	
	<form action="informacoes" method="post">
		
		<!-- Campo nome -->
		<label for="nome">Nome:</label>
		<input type="text" name="nome" id="nome" title="Preencha o campo Nome" required/><br/>
		
		<!-- Campo matricula -->
		<label for="email">Email:</label>
		<input type="text" name="email" id="email" title="Preencha o campo Email" required><br/>

		<!-- Botão Submit -->
		<input type=submit value="OK" />
	</form>
	
</body>
</html>