<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String login = request.getParameter("login");
String senha = request.getParameter("senha");

 if(login.equals(senha)){
	 out.print("Login realizado com sucesso!");
	 }else{
	 out.print("Falha ao tentar fazer login. Tente novamente!");	 
	 }
%>
</body>
</html>