<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account</title>
</head>
<body>
	<% 
		String erroreCF = (String) request.getAttribute("errorCF");
		if (erroreCF != null)
		{
	%>
	
		<h2><%= erroreCF%></h2>
	
	
	<%
		}
	%>

	
	
	<form action="<%= request.getContextPath() +"/Account" %>" method="get">  <%-- /Account è la servlet di riferimento--%> 
	Nome: <input type ="text" name="nome" > <br>
	Cognome: <input type ="text" name="cognome" > <br>
	Denominazione: <input type ="text" name="denominazione"  > <br>
	Codice Fiscale: <input type ="text" name="cf" > <br>
	P.Iva : <input type ="text" name="piva" > <br>
	<input type ="submit" value="Submit"/> 
	</form>

</body>
</html>