package org.nation;

import GUI.MenuCrypto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_test {

    public static void main(String[] args) {

//        ArrayList<String> maliste = new ArrayList<String>();
//
//        maliste.add("The Fleshtones");
//        maliste.add("Hoodoo Gurus");
//        maliste.add("The Bad Seeds");
//        maliste.add("Wayne Kramer");
//
//        Collections.sort(maliste);  // Tri de la liste
//
//        maliste.forEach( (i)->  System.out.println(i)); //Syntaxe fonction
        MenuCrypto menucrypt = new MenuCrypto();
        String str = menucrypt.Menu();

        String home = System.getProperty("user.dir");


        Path msgClearPath = null;
        Path msgEncodedPath = null;
        Path msgKeyPath = null;
        boolean coder= true;
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
            int choix = scan.nextInt();


            switch (choix) {

                case 1 -> {
                    coder = true;
                    System.out.println("Nous allons décoder le message");
                    System.out.println("Taper le nom du fichier a décoder sans extension");

                    String encodedTest = scan.nextLine();
                    encodedTest += ".txt";
                    Path add = Paths.get(home, encodedTest);
                    System.out.println(encodedTest);
                 System.out.println("Nous allons encoder le message");
                    System.out.println("Taper le nom du fichier contenant la clef sans extension");
                    String fileClef = scan.nextLine();
                    fileClef +=".txt";
                    Path add2 = Paths.get(home, fileClef);
                    ArrayList<String> listkey = new ArrayList();
                    try {
                        listkey = (ArrayList<String>) Files.readAllLines(add);


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (String ligne: listkey) {
                        System.out.println(ligne);
                    }

                }
                case 2 -> {
                    coder = false;
                    System.out.println("Nous allons encoder le message, à plus");
                }
                case 3 -> {
                    System.out.println("Merci pour l'utilisation");
                    continuer = false;
                }

            }

        } while (continuer);



    }
}
