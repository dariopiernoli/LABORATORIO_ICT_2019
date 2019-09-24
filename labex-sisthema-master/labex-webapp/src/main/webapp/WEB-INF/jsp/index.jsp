<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/accounts/list" var="accounturl" htmlEscape="true" />

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>labex!</title>
    <link href="/css/main.css" rel="stylesheet" />
  </head>
  <body>
    <h2 class="hello-title">${msg}!</h2>
    <script src="/js/main.js"></script>

    <br />

    <a href="${accounturl}">Vai alla pagina dei contatti</a>
  </body>
</html>
