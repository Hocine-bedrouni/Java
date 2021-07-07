package org.nation;

import java.util.Scanner;

public class Parite {


    public static void main(String args[]) {

        int nb;

        Scanner scan = new Scanner(System.in);
        System.out.println("entrez un chiffre");
        nb = scan.nextInt();
        if (nb % 2 == 0){
            System.out.println("c'est un chiffre pair");
        }else {
            System.out.println("c'est un chiffre impair");
        }
        }
    }


