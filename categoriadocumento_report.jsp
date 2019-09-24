<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CategoriaDocumento_Form_Report</title>
    <link href="/css/categoriadocumento_report.css" rel="stylesheet" />
  </head>
  <body>
    <a href="/categoriadocumenti/new?azione=insert">Inserisci un nuovo Contatto</a>
  </br></br>
    <table align="center" width="70%" border="1">
      <thead>
        <tr>
          <td>Categoria Documento</td>
          <td>Descrizione</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="categoria_documento" items="${categoriadocumenti}">
          <tr>
            <td><c:out value="${contact.categoria_documento}"/></td>
            <td><c:out value="${contact.descrizione}"/></td>
            <td><a href="/categoriadocumenti/get?id=<c:out value="${contact.id}"/><&azione="update">Modifica</a></td>
            <td><a href="/categoriadocumenti/delete?id=<c:out value="${contact.id}"/><&azione="delete">Cancella</a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>