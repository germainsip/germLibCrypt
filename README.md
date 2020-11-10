![logo](peter6prod.png)

# germLibCrypt
librairie déstinée au stagiaires pour simplifier le cryptage

- Pour l'utiliser récupérez les deux jar [ici](https://github.com/germainsip/germLibCrypt/releases/tag/1.0)
- Ajoutez le jar dans les dépendances du projet **ProjectStructure->Librairies**
- Pour la javadoc ajoutez le jar javadoc à la librairie que vous venez d'ajouter.


## Utilisation

Après avoir inclus la librairie à votre projet utilisez la classe static Manabox et ses méthode:

```java
String test1 = ManaBox.encrypt("c'est trop bien ça marche !!!");
System.out.println(test1);
System.out.println(ManaBox.decrypt(test1));
```        
