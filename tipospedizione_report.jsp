<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>TipoSpedizione_Form_Report</title>
    <link href="/css/tipospedizione_report.css" rel="stylesheet" />
  </head>
  <body>
    <a href="/tipospedizioni/new?azione=insert">Inserisci un nuovo Contatto</a>
  </br></br>
    <table align="center" width="70%" border="1">
      <thead>
        <tr>
          <td>Tipo Spedizione</td>
          <td>Descrizione</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="spedizione" items="${tipospedizioni}">
          <tr>
            <td><c:out value="${contact.spedizione}"/></td>
            <td><c:out value="${contact.descrizione}"/></td>
            <td><a href="/tipospedizioni/get?id=<c:out value="${contact.id}"/><&azione="update">Modifica</a></td>
            <td><a href="/tipospedizioni/delete?id=<c:out value="${contact.id}"/><&azione="delete">Cancella</a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>