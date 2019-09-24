<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>Account_Form_Report</title>
    <link href="/css/account_report.css" rel="stylesheet" />
  </head>
  <body>
    <a href="/accounts/new?azione=insert">Inserisci un nuovo Contatto</a>
  </br></br>
    <table align="center" width="70%" border="1">
      <thead>
        <tr>
          <td>Nome</td>
          <td>Denominazione</td>
          <td>CodiceFiscale</td>
          <td>Piva</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="account" items="${accounts}">
          <tr>
            <td><c:out value="${contact.nome}"/></td>
            <td><c:out value="${contact.denominazione}"/></td>
            <td><c:out value="${contact.cf}"/></td>
            <td><c:out value="${contact.piva}"/></td>
            <td><a href="/accounts/get?id=<c:out value="${contact.id}"/>&azione=update">Modifica</a></td>
            <td><a href="/accounts/delete?id=<c:out value="${contact.id}"/>&azione=delete">Cancella</a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
