<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>Nuovo Account Form</title>
    <link href="/css/main.css" rel="stylesheet" />
  </head>
  <body>
    <form action="/accounts/${azione}" method="post">
      <h2>Nuovo account</h2>
      <div class="form-group">
        <label>Nome</label>
        <input value="${account.nome}" type="text" name="nome" />
      </div>
      <div class="form-group">
        <label>Cognome</label>
        <input value="${account.cognome}" type="text" name="cognome" />
      </div>
      <div class="form-group">
        <label>Denominazione</label>
        <input value="${account.telefono}" type="text" name="denominazione" />
      </div>
      <div class="form-group">
        <label>Partiva IVA</label>
        <input value="${account.telefono}" type="text" name="piva" />
      </div>
      <div class="form-group">
        <label>Codice Fiscale</label>
        <input value="${account.telefono}" type="text" name="cf" />
      </div>
      <div class="form-group">
        <input value="${account.id}" type="hidden" name="id" />
        <input type="submit" value="Salva" />
      </div>
    </form>
  </body>
</html>
