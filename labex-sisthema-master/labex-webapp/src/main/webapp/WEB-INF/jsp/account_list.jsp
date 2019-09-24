<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>Nuovo Account Form</title>
    <link href="/css/main.css" rel="stylesheet" />
  </head>
  <body>
    <a href="/accounts/new?azione=insert">Inserisci un nuovo Contatto</a>
  </br></br>
    <table align="center" width="70%" border="1">
      <thead>
        <tr>
          <td>Nome</td>
          <td>Cognome</td>
          <td>Telefono</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="account" items="${accounts}">
          <tr>
            <td><c:out value="${account.nome}"/></td>
            <td><c:out value="${account.cognome}"/></td>
            <td><c:out value="${account.denominazione}"/></td>
            <td><c:out value="${account.piva}"/></td>
            <td><c:out value="${account.cf}"/></td>
            <td><a href="/accounts/get?id=<c:out value="${account.id}"/>&azione=update">Modifica</a></td>
            <td><a href="/accounts/delete?id=<c:out value="${account.id}"/>&azione=delete">Cancella</a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
