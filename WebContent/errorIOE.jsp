<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TODOL</title>
</head>
<body>
	<jsp:include page="cabecalho.jsp" />

	<h3>Exce��o Java: java.io.IOException</h3>

	<p>Ops! Ao tentar gravar a tarefa, foi lan�ada a seguinte exce��o
		Java:</p>

	<p><%=exception.getMessage()%></p>

	<jsp:include page="rodape.jsp" />
</body>
</html>