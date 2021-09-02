<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String nomeCliente = (String) request.getAttribute("cliente");
	System.out.println(nomeCliente);
%>

Cliente <%= nomeCliente %> cadastrado com sucesso!

</body>
</html>