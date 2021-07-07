package org.nation;

import java.util.Scanner;

public class ASCII {

    public static void main (String args[]){

        int nb;

        Scanner scan = new Scanner(System.in);

        System.out.println("Taper un chiffre");
        nb = scan.nextInt();
        char code = (char) nb;
        String code2 = Character.toString(code);
        System.out.println(code2);
    }

}
