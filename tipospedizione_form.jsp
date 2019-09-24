<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>TipoSpedizione_Form</title>
<link href="/css/tipospedizione_form.css" rel="stylesheet" />
</head>
<body>

<form action="/tipospedizioni/${azione}" method="post">

<img height="25px;" src="images/Logo-SIsthema.png">
        
        <div id="all">
        
            <h1 id="title"><em><span style="color:red;">Tipo Spedizione<img id="img" height="50px;" src="images/tiposped.png"></span></em></h1>
        
            <p class="asterix"> Campi Obbligatori</p>
            
            
            <hr color="black" size="2" />
            
            
            
            <div id="form">
                
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
               
                <p id="catdoc" class="asterix">Tipo Spedizione:  <input value="${contact.spedizione}" type="text"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        
        <p id="left">Descrizione:  <input value="${contact.descrizione}" type="text"></p>
        
            </div>
        
            <hr color="black" size="2" />
        
        <button id="Home" class="button" type="submit" value="submit"><a href="./LABORATORIO_ICT_2019/home.html">Torna Alla Home</a></button>
            
            <button id="submit" class="button" type="submit" value="submit"><a href="http://www.google.com" target="_blank">Invia</a></button>
        
       
        
        
        
        
        </div>  
        </form>
</body>
</html>