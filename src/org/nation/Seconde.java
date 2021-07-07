package org.nation;

import java.util.Scanner;

public class Seconde {

    public static void main(String arg[]){

        int nb;
        int h;
        int m;
        int s;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        nb= scan.nextInt();
        h= nb/3600;
        m= (nb%3600)/60;
        s = nb % 60;
        System.out.println("il y a "+h +" Heures " +m +" minutes "+ s +" secondes" );

    }

}
