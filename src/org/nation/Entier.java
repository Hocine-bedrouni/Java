package org.nation;

import java.util.Scanner;

public class Entier {

    public static void main(String[] args) {

        int nb;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un chiffre");
        nb = scan.nextInt();
        for (int i = 1; i<=nb; i++){
            System.out.println(i);
        }
    }
}
