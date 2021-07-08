package org.nation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        ArrayList<Integer> tab = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un chiffre qui determinera la taille de votre tableau");
        int taille = scan.nextInt();

        for (int i=0; i<taille; i++){
            System.out.println( i+1 +") Entrez un chiffre");
            int val = scan.nextInt();
            tab.add(val);
        }
        for (Integer i : tab) {
            System.out.println(i);
        }
    }

}
