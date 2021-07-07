package org.nation;

import java.util.Scanner;

public class intervalle {

    public static void main(String[] args) {

        int nb1;
        int nb2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un 1er chiffre");
        nb1 = scan.nextInt();
        System.out.println("Entrer un 2eme chiffre");
        nb2 = scan.nextInt();
        int res = nb1;
        if (nb1<nb2) {

            for (int i = nb1; i <= nb2; i++) {
                res += i;
            }
        }
        else if (nb1>nb2){

                for (int i = nb1; i > nb2; i--) {
                    nb1--;
                    res += nb1;

                }
        }
        else{
res=2*nb1;
        }
            System.out.println(res);
    }
}
