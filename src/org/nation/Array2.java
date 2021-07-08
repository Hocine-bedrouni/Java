package org.nation;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        ArrayList<String> tab = new ArrayList<String>();

        tab.add("papa");
        tab.add("maman");
        tab.add("Noe");
        tab.add("Fabien");
        tab.add("Sana");
        tab.add("Behzad");
        tab.add("Trunk");
        tab.add("Gohan");
        tab.add("Anais");
        tab.add("Florent");
        tab.add("Hocine");
        tab.add("Robert");
        tab.add("Lili");
        tab.add("Beber");
        tab.add("Romain");
        tab.add("Alex");
        tab.add("Sam");
        tab.add("Laura");
        tab.add("Victor");
        tab.add("Ali");

        Scanner scan = new Scanner(System.in);

        boolean exist = true;
        int pos = 0;
        int taille= tab.size();

        System.out.println("Entrer un prénom du tableau");
        System.out.println(tab);
        String name = scan.nextLine();
//
        tab.remove(tab.indexOf(name));
        System.out.println(tab);
        }

        }



