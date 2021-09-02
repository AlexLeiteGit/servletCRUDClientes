<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkEntradaServlet}" method="post">
		
		Nome: <input type="text" name="nome" value="${cliente.nome}"/>
		Sobrenome: <input type="text" name="sobrenome" value="${cliente.sobrenome}"/>
		Celular: <input type="tel" name="celular" value="${cliente.celular}"/>
		<input type="hidden" name="id" value="${cliente.id}" />
		<input type="hidden" name="acao" value="AlteraCliente" />			
		
		<input type="submit" />	
	</form>

</body>
</html>