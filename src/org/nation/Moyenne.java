package org.nation;

import java.util.Scanner;

public class Moyenne {

    public static void main(String arg[]) {

        float not1;
        float not2;
        float not3;
        float moyenne;

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrer la 1ère note coefficient 3");
        not1 = scan.nextFloat();
        System.out.println("Entrer la 2ème note coefficient 2");
        not2 = scan.nextFloat();
        System.out.println("Entrer la 3ème note coefficient 1");
        not3 = scan.nextFloat();
        moyenne = ((not1*3) + (not2*2) + not3) /6;
        System.out.println("la moyenne de l'élève est de : " +moyenne);


    }
}
