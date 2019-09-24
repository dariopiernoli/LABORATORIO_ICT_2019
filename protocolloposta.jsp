<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>ProtocolloPosta_Form</title>
<link href="/css/protocolloposta_form.css" rel="stylesheet" />
</head>
<body>

<form action="/protocolloposte/${azione}" method="post">

<img height="25px;" src="images/Logo-SIsthema.png">
        
        <div id="all">
        
            <h1 id="title"><em><span style="color:red;">Protocollo Posta<img id="img" height="65px;" src="images/protocolloposta.png"></span></em></h1>
           
            
            <p class="asterix"> Campi obbligatori</p>
          
            
            <hr color="black" size="2" />
            
          <div id="form">
             
              <div id="sx">  
              <p class="asterix" style="padding-top: 5px">E/U: <input value="${contact.E/U}"type="text"></p>
                  <p class="asterix" style="padding-top: 5px">Data Protocollo: <input value="${contact.dataprotocollo}" type="text"></p>
                  <p class="asterix" style="padding-top: 5px">ID_Categoria Documento: <input value="${contact.id_categoriadocumento}"type="text"></p>
                  <p  style="padding-top: 5px">ID_Account: <inputvalue="${contact.id_account}" type="text"></p>
                  <p style="padding-top: 5px">Cognome: <input value="${contact.cognome}"type="text"></p>
                  <p style="padding-top: 5px">Recapiti: <input value="${contact.recapiti}" type="text"></p>
                  
                  
              </div>
              
              <div id="dx">
              
              <p class="asterix" style="padding-top: 5px">Numero Protocollo: <input value="${contact.numeroprotocollo}"type="text"></p>
                  <p style="padding-top: 5px">Oggetto: <input value="${contact.oggetto}" type="text"></p>
                  <p class="asterix" style="padding-top: 5px">ID_Tipo Spedizione: <input value="${contact.id_tipospedizione}" type="text"></p>
                  <p style="padding-top: 5px">Nome: <input value="${contact.nome}" type="text"></p>
                  <p style="padding-top: 5px">Denominazione: <input value="${contact.denominazione}" type="text"></p>
                  <p style="padding-top: 5px">Anno Esercizio: <input value="${contact.annoesercizio}" type="text"></p>
                  
              </div>
        
                    
              <div class="clear-float">
              
                  <textarea id="textarea" rows="6" cols="70" placeholder="Aggiungi Informazioni" maxlength="200" style="font-size: 15px"></textarea>
              
              </div>
                
              <div id="UU">
              
              <p id="sx">Ultima Modifica:<input value="${contact.ultimamodifica}" type="text"></p>
              
              <p id="dx">Username:<input value="${contact.username}"type="text"></p>
                  
              </div>
        
               
            </div>
        
            <hr color="black" size="2" />
        
        <button id="Home" class="button" type="submit" value="submit"><a href="http://www.google.com" >Torna Indietro</a></button>
            
            <button id="submit" class="button" type="submit" value="submit"><a href="http://www.google.com" target="_blank">Invia</a></button>
        
       
        
        
        
        
        </div>    
</body>
</html>