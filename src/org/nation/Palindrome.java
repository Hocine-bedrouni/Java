package org.nation;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez une prhase sans accent ni caractère spéciaux, Merci");

        String str;
        str = scan.nextLine().toLowerCase().replaceAll("\\s", "");

        int debut = 0;
        int fin = str.length() - 1;


//        int longueur = str.length();
//        System.out.println(longueur);
        boolean palindrome = true;
        while ((debut < fin) && palindrome) {
            if (str.charAt(debut) != str.charAt(fin)) {
                palindrome = false;
            }
            debut++;
            fin--;

        }
        if (palindrome) {
            System.out.println("C'est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }

    }

}

