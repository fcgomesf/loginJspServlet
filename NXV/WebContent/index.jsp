<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ServDeixa" method="post">

		Usuário: <input type="text" name="login" placeholder="nome de usuario"><br>
		Senha: <input type="password" name="senha" placeholder="passuorde"><br>
		<button type="submit">Confirmar</button>
		<% if (request.getAttribute("erro") != null) {	%>
		<% request.getAttribute("erro"); %>
		<% } %>
	</form>
</body>
</html>

