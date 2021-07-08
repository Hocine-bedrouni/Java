package org.nation;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Tablo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] tab = {"papa", "maman", "Noe", "Fabien", "Sana", "Behzad", "Trunk", "Gohan", "Anais", "Florent", "Hocine", "Robert", "Lili", "Beber", "Romain", "Alex", "Laura", "Ali", "Sam", "Victor" };

        boolean exist = true;
        int pos = 0;
        System.out.println(Arrays.toString(tab));
        System.out.println("Entrer un prénom du tableau");
        String name = scan.nextLine();
        for (int i = 0; i < tab.length; i++){
            if (tab[i].equals(name) && exist){

           exist = false;
           pos = i;
        }
    }
        for (int i=pos+1; i<tab.length; i++){
            tab[i-1] = tab[i];
        }
        tab[tab.length-1]= null;
        System.out.println(Arrays.toString(tab));
}
}
