package org.nation;

import java.util.Scanner;

public class Diviseur {

    public static void main (String[] args){

        float ch1;
        float ch2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Taper le premier chiffre");
        ch1 = scan.nextFloat();
        System.out.println("Taper le deuxième chiffre");
        ch2 = scan.nextFloat();
        System.out.println( ch1 +" divisé par " + ch2 +" est égal à " +(ch1 / ch2));

    }

}
