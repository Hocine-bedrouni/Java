package org.nation;

import java.util.Arrays;
import java.util.Scanner;

public class Tablo1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] tab = new String[5];
//        System.out.print(tab.length);

        for (int i=0; i<tab.length; i++){
            System.out.println("Entrer des données à insérer dans le tableau");
            tab[i] = scan.nextLine();
        }
        System.out.println("le tableau final contient: " + Arrays.toString(tab));

//        Console.lireC();

    }
}
