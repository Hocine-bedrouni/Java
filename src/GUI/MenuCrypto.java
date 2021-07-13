package GUI;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuCrypto {


    public int Menu() {

        String home = System.getProperty("user.dir");
        Path adress = Paths.get(home, "key.txt");

        boolean coder = true;
        boolean continuer = true;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("╔══════════════════════════════════════╗\n" +
                    "║   System d'encodage et de décodage   ║\n" +
                    "║             de messages              ║\n" +
                    "╠══════════════════════════════════════╣\n" +
                    "║       1) Décoder un message          ║\n" +
                    "║       2) Encode un message           ║\n" +
                    "║       3) Quitter                     ║\n" +
                    "╚══════════════════════════════════════╝");

            int chiffre = scan.nextInt();
            switch (chiffre) {
                case 1 -> {
                    coder = true;
                    System.out.println("Nous allons décoder le message");
                }
                case 2 -> {
                    coder = false;
                    System.out.println("Nous allons encoder le message");

                }
                case 3 -> {
                    System.out.println("Merci d'avoir utiliser ce programme");
                    continuer = false;
                }
            }

        } while (continuer);


public Map<String, String> Choixadr (String choix) {
            scan = new Scanner(System.in);


        Map<String, String> adressfichier = new HashMap<>();

            switch (choix) {

            case "codage" -> {
                System.out.println("Taper le nom du fichier a décoder sans extension");
                adressfichier.put("encodedTest", scan.next());
                System.out.println("Taper le nom du fichier contenant la clef sans extension");
                adressfichier.put("listkey", scan.next());
            }
            case decodage -> {
                System.out.println("entrez le nom du fichier à décoder sans extension");
                adressfichier.put("pageVide", scan.next());
                System.out.println("Entrez le nom du fichier contenant la clé de décodage (sans extension)");
                adressfichier.put("listkey", scan.next());
            }

        }

            return adressfichier;   }
    }
}





