<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Categoria Documento</title>
</head>
<body>
	<form action="<%= request.getContextPath() +"/CategoriaDocumento" %>" method="get">
		Categoria documento: <input type = "text" name = "categoria" maxlength="20" > <br>
		Descrizione: <input type = "text" name = "descrizione" maxlength="900"  > <br>
		<input type="submit" value = "submit">
	</form>

</body>
</html>