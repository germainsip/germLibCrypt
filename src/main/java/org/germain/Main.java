package org.germain;

import org.germain.tool.ManaBox;



import static org.germain.tool.ManaBox.normalize;

public class Main {
   
    public static void main(String[] args) {
        String originalString = "délire";
        String encryptedString = ManaBox.encrypt(originalString);
        String decryptedString = ManaBox.decrypt(encryptedString);

        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);


        String message = "«Si tu as la chance d'être différent, ne change jamais.» - Taylor Swift";
        String citation1 = "Si le problème a une solution il ne sert à rien de s'inquiéter, mais s'il n'y a pas de solution, s'inquiéter ne changera rien Bouddha\n" +
                "Voir sur https://citations.ouest-france.fr/citation-bouddha/probleme-solution-sert-rien-inquieter-47682.html";
        String citation2 = "Tout problème simple a une solution complexe... qui ne fonctionne pas. Olivier Lockert\n" +
                "Voir sur https://citations.ouest-france.fr/citation-olivier-lockert/probleme-simple-solution-complexe-fonctionne-13756.html";
        String messageN = normalize(message);
        System.out.println(message);
        System.out.println(messageN);
    }
}
