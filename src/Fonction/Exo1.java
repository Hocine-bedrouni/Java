package Fonction;

import java.util.Scanner;


public class Exo1 {
    public static void main(String[] args) {


        double resultat = 0;
        Scanner scan = new Scanner(System.in);
        char op;
        double nb1;
        double nb2;


        System.out.println("Enter un 1er chiffre");
        nb1 = scan.nextInt();
        System.out.println("Entrer un operateur");
        op = scan.next().charAt(0);
        System.out.println("Entrer un 2eme chiffre");
        nb2 = scan.nextInt();

        double vari = Calcul(op, nb1, nb2);
//        System.out.println( Calcul(op, nb1, nb2));
        System.out.println(vari);

    }

    public static double Calcul(char operateur, double val1, double val2) {


        double result = 0;

        switch (operateur) {
            case '+' -> result = val1 + val2;
//                System.out.println("Ceci est une addition");
//                System.out.println("Le resultat est : "+result);}

            case '-' -> result = val1 - val2;
//                System.out.println("Ceci est une soustraction");
//                System.out.println("Le resultat est : "+result);}

            case '*' -> result = val1 * val2;
//                System.out.println("Ceci est une multiplication");
//                System.out.println("Le resultat est : "+result);}

            case '/' -> {
                if (val2 == 0) {
                    System.out.println(" division par zero impossible");
                } else {
                    result = val1 / val2;
                }
            }
//                System.out.println("Ceci est une division");
//                System.out.println("Le resultat est : "+result);}

                default -> System.out.println("L'opérateur donné est tout pourri");
            };

            return result;
        }
    }


