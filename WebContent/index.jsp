<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CalculServlet" method="POST">
		X : <input type="text" id="x" name="x" /><br />
		Y : <input type="text" id="y" name="y" /><br/>
		<input type="submit" value="Valider" />
	</form>
	<c:if test="${!empty(resultatAddition)}">
	RESULTAT ADDITION : ${resultatAddition}
	<br />
	</c:if>
	<c:if test="${!empty(resultatSoustraction)}">
	RESULTAT SOUSTRACTION : ${resultatSoustraction}
	<br />
	</c:if>
	<c:if test="${!empty(resultatDivision)}">
	RESULTAT DIVISION : ${resultatDivision}
	<br />
	</c:if>
	<c:if test="${!empty(resultatMultiplication)}">
	RESULTAT MULTIPLICATION : ${resultatMultiplication}
	<br />
	</c:if>
</body>
</html>