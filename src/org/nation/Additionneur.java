package org.nation;

import java.util.Scanner;

public class Additionneur {


    public static void additionneur (){

        int ch1;
        int ch2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Taper le premier chiffre");
        ch1 = scan.nextInt();
        System.out.println("Taper le deuxième chiffre");
        ch2 = scan.nextInt();
        System.out.println("le total est de : " + (ch1 + ch2));

    }

}