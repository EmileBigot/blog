# BLOG

Dit is een simpele blog met een simpel user interface. 
Om de applicatie te starten: run de main file in de java package. 
Let op dat alle dependencies geinporteerd zijn op jou pc!

Je kan de volgende URL's gebruiken om te testen:<br />
  <> /allusers  -> een lijst met alle geregistreerde gebruikers ophalen<br />
  <> /allposts  -> alle berichten + comments die geplaatst zijn ophalen<br />
  <> /register/:username/:password/:name  -> een gebruiker registreren<br />
  <> /login/:username/:password  -> inloggen met een geregistreerde gebruiker<br />
  <> /postblog/:posttitle/:content  -> een blog posten met de ingelogte gebruiker<br />
  <> /addcomment/:posttitle/:comment  -> een reactie toevoegen aan het bericht<br />
  <> /logout  -> de ingelogte gebruiker uitloggen

:username = de gebruikersnaam van het account<br />
:password = het wachtwoord van het account<br />
:name = de naam van de gebruiker<br />
:posttitle = de titel van het bericht<br />
:content = de inhoud van het bericht<br />
:comment = de inhoud van de reactie op een bericht<br />