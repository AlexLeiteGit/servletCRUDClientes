<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/servletCRUDClientes/novoCliente" method="post">

Nome: <input type="text" name="nome" />
Sobrenome: <input type="text" name="sobrenome" />
Idade: <input type="text" name="idade" />
Celular: <input type="tel" name="celular" />

<input type="submit" />

</form>
</body>
</html>