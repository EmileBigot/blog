# BLOG

Dit is een simpele blog met een simpel user interface
Om de applicatie te starten: run de main file in de java package
Let op dat alle dependencies geinporteerd zijn op jou pc

Je kan de volgende URL's gebruiken om te testen:
  <> /allusers  -> een lijst met alle geregistreerde gebruikers ophalen
  <> /allposts  -> alle berichten + comments die geplaatst zijn ophalen
  <> /register/:username/:password/:name  -> een gebruiker registreren
  <> /login/:username/:password  -> inloggen met een geregistreerde gebruiker
  <> /postblog/:posttitle/:content  -> een blog posten met de ingelogte gebruiker
  <> /addcomment/:posttitle/:comment  -> een reactie toevoegen aan het bericht
  <> /logout  -> de ingelogte gebruiker uitloggen

:username = de gebruikersnaam van het account
:password = het wachtwoord van het account
:name = de naam van de gebruiker
:posttitle = de titel van het bericht
:content = de inhoud van het bericht
:comment = de inhoud van de reactie op een bericht