<html lang="en">
<head>
<meta charset="UTF-8">
<title>Account_Form</title>
<link href="/css/account_form.css" rel="stylesheet" />
</head>
<body>

<form action="/accounts/${azione}" method="post">

<img height="25px;" src="images/Logo-SIsthema.png">
        
        <div id="all">
        
            <h1 id="title"><em><span style="color:red;">Gestione Account<img id="img" height="50px;" src="images/account2.png"></span></em></h1>
        
           <p class="asterix"> Campi Obbligatori</p>
            
            
            <hr color="black" size="2" />
            
          <div id="form">
             
              
                  <p style="padding-top:25px">Nome:<input value="${contact.nome}" type="text"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   Cognome:<input value="${contact.cognome}" type="text" ></p>
              
              <p style="padding-top:25px">Denominazione:<input value="${contact.denominazione}" type="text"></p>
        
              <p class="asterix" style="padding-top:25px">Codice Fiscale:<input value="${contact.cf}" type="text"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  
             <span>Partita Iva:<input value="${contact.piva}" type="text"></span></p>
                  
               
            </div>
        
            <hr color="black" size="2" />
        
        <button id="Home" class="button" type="submit" value="submit"><a href="http://www.google.com" target="_blank">Torna Alla Home</a></button>
            
            <button id="submit" class="button" type="submit" value="submit"><a href="http://www.google.com" target="_blank">Invia</a></button>
        
      
        
        </div>    
    
 </form>   
</body>
</html>