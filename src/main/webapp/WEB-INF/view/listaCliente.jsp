<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.javacodex.modelo.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Cliente</title>
</head>
<body>

	Usuario Logado: ${usuarioLogado.login}
	
	<br>
	<br>
	<br>

	<c:if test="${not empty cliente}">
		Cliente ${ cliente } cadastrado com sucesso!
	</c:if>
<br>
<br>
Lista de Clientes: <br/>
<ul>
<c:forEach items="${cliente}" var="cliente">
<li>${cliente.nome} - ${cliente.sobrenome} - ${cliente.idade} - ${cliente.celular} - <fmt:formatDate value="${cliente.dataCadastro}" pattern="dd/MM/yyyy"/></li>
<a href="/servletCRUDClientes/entrada?acao=MostraCliente&id=${cliente.id}">editar</a>
<a href="/servletCRUDClientes/entrada?acao=RemoveCliente&id=${cliente.id}">remover</a></li>
</c:forEach>
</ul>		
</body>
</html>