package org.nation;

import java.util.Scanner;

import static org.nation.Additionneur.additionneur;
import static org.nation.Age.age;
import static org.nation.Calculette.calculette;
import static org.nation.Diviseur.diviseur;


public class Menu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("|*****************************************************************|");
        System.out.println("|Veuillez choisir un chiffre pour selectionner la fonction désirée|");
        System.out.println("|*****************************************************************|");
        System.out.println("|1) Fonction Age vous dis si vous etes majeur                     |");
        System.out.println("|2) Fonction Additionneur                                         |");
        System.out.println("|3) Fonction Calculette                                           |");
        System.out.println("|4) Fonction Diviseur                                             |");
        int nb = scan.nextInt();
        switch (nb){

            case 1 -> {
                age();
            }
            case 2 ->{
                additionneur();
            }
            case 3 ->{
                calculette();
            }
            case 43 ->{
                diviseur();
            }

        }
    }
}
