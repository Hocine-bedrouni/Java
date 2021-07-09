package Class_Objet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tableau {


    private static ArrayList <Integer> tab = new ArrayList<>();
    private int taille;


    public void saisie() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau");
        this.taille = scan.nextInt();

        for (int i= 0;i < this.taille; i++) {
            System.out.println("Entrez un nombre");
            tab.add(scan.nextInt());
        };
    }

    public static void tri(){
         Collections.sort(tab);
        }

    public static void afficher(){
            System.out.println(tab);
        }


}


