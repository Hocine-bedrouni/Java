package org.nation;

import java.util.Scanner;

public class Sommentier {

    public static void main(String[] args) {

        int nb;
        int res = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un chiffre");
        nb = scan.nextInt();
        int i;
        for (i = 0; i <= nb; i++) {
//            System.out.println(i);
            res= res + i;
        }
        System.out.println(res);
    }
}
