![logo](peter6prod.png)

# germLibCrypt
librairie déstinée au stagiaires pour simplifier le cryptage

- Pour l'utiliser récupérez les deux jar [ici](https://github.com/germainsip/germLibCrypt/releases/tag/1.0)
- Ajoutez le jar dans les dépendances du projet **ProjectStructure->Librairies**
- Pour la javadoc ajoutez le jar javadoc à la librairie que vous venez d'ajouter.


## Utilisation

Après avoir inclus la librairie à votre projet utilisez la classe static `Manabox` et ses méthodes:

```java
String message = "«Si tu as la chance d'être différent, ne change jamais.» - Taylor Swift";

String originalString = "Tout problème simple a une solution complexe... qui ne fonctionne pas. Olivier Lockert\n" +
                "Voir sur https://citations.ouest-france.fr/citation-olivier-lockert/probleme-simple-solution-complexe-fonctionne-13756.html";

String encryptedString = ManaBox.encrypt(originalString);
String decryptedString = ManaBox.decrypt(encryptedString);

System.out.println("Message d'origine: ");
System.out.println(originalString);
System.out.println("_______________________________________________________");
System.out.println("Message crypté: ");

System.out.println(encryptedString);
System.out.println("_______________________________________________________");
System.out.println("Message décrypté: ");

System.out.println(decryptedString);
```    

Ce qui donne:

```zsh
Message d'origine: 
Tout problème simple a une solution complexe... qui ne fonctionne pas. Olivier Lockert
Voir sur https://citations.ouest-france.fr/citation-olivier-lockert/probleme-simple-solution-complexe-fonctionne-13756.html
_______________________________________________________
Message crypté: 
J831pJkcbENjASVUW/HyE0cQhexypGA/0u7temFm+OqFZk0EkvwszmqflOvK80RJ7GIYXEVzndpFUYYKGyundrCjDNy/3SAo3Op6eKyrnmasywOGyytn2cDCsnNgOIF9zs2NyLo19bnKcA8+791nB43r5jBS0F3kmpouIBTS6zWLbxODZBYHDLmSxaYucnI+4gkzO0lDcdG7kp5Nz2q1KW5ZF8jXtCGS3ESPgOnRxdCWmIKhi7aEkLHxKqCkStZ7gh4Q8FyBZOnRCO6sh3DFuDlR2R5Frjn5VbTAUuGU0Pc=
_______________________________________________________
Message décrypté: 
Tout problème simple a une solution complexe... qui ne fonctionne pas. Olivier Lockert
Voir sur https://citations.ouest-france.fr/citation-olivier-lockert/probleme-simple-solution-complexe-fonctionne-13756.html
```

