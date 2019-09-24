<html lang="en">
<head>
<meta charset="UTF-8">
<title>CategoriaDocumento_Form</title>
<link href="/css/categoriadocumento_form.css" rel="stylesheet" />
</head>
<body>

<form action="/categoriadocumenti/${azione}" method="post">


<img height="25px;" src="images/Logo-SIsthema.png">
        
        <div id="all">
        
            <h1 id="title"><em><span style="color:red;">Categoria Documento<img id="img" height="50px;" src="images/categoriadocumento.png"></span></em></h1>
        
            <p class="asterix"> Campi Obbligatori</p>
            
            <hr color="black" size="2" />
            
            
            
            <div id="form">
                
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
               
                <p id="catdoc" class="asterix">Categoria Documento:  <input value="${contact.categoriadocumento}" type="text"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        
        <p id="left">Descrizione:  <input value="${contact.descrizione}" type="text"></p>
        
            </div>
        
            <hr color="black" size="2" />
        
        <button id="Home" class="button" type="submit" value="submit"><a href="./LABORATORIO_ICT_2019/home.html">Torna Alla Home</a></button>
            
            <button id="submit" class="button" type="submit" value="submit"><a href="http://www.google.com">Invia</a></button>
        
        </div>    
    
</body>
</html>