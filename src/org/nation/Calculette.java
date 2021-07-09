package org.nation;

import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class Calculette {

    public static void calculette() {
        int nb1;
        int nb2;
        char op;
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un 1er nombre");
        nb1 = scan.nextInt();
        System.out.println("Entrez un 2ème nombre");
        nb2 = scan.nextInt();
        System.out.println("Entrez un opérateur");
        op = scan.next().charAt(0);

        switch (op) {
            case '+' -> {result = nb1 + nb2;
                System.out.println("Ceci est une addition");
                System.out.println("Le resultat est : "+result);}
            case '-' -> {result = nb1 - nb2;
                System.out.println("Ceci est une soustraction");
                System.out.println("Le resultat est : "+result);}

            case '*' -> {result = nb1 * nb2;
                System.out.println("Ceci est une multiplication");
                System.out.println("Le resultat est : "+result);}

            case '/' -> {result = nb1 / nb2;
                System.out.println("Ceci est une division");
                System.out.println("Le resultat est : "+result);}

            default ->      System.out.println("L'opérateur donné est tout pourri");
        };
//


//            System.out.println(getNumericValue(result));




    }
}
