<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa criada</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />
	
	<c:if test="${not empty empresa}">
		Empresa
		${empresa}
		cadastrada com sucesso!
	</c:if>	
	
	<c:if test="${empty empresa}">
		Nenhuma empresa cadastrada!
	</c:if>
</body>
</html>