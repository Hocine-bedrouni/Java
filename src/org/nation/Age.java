package org.nation;

import java.util.Calendar;
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cetanne = Calendar.getInstance().get(Calendar.YEAR);
//        System.out.println("cette année = " + cetanne);
        int diff;
        int annenais;
        String a;
        System.out.println("Entrez votre année de naissance");
        annenais = scan.nextInt();
        diff = cetanne - annenais;
        if (diff< 18 ){
            a = "mineur";
        }else
            a = "majeur";
        System.out.println("tu as "+diff +" ans et tu es donc "+ a );





    }
}
