package Fonction;

import java.util.Locale;
import java.util.Scanner;

public class CompteLettre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez une phrase");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Entrez une lettre");
        String let = scan.nextLine().toLowerCase();
        System.out.printf("le nombre d'occurence de %s dans %s est de %d",let,str,nblettre(str, let));


    }

    public static int nblettre(String str, String let){
        char ch;
        int exist=0;
        for (int i =0 ; i<str.length(); i++){
            ch = str.charAt(i);
            if (ch == let.charAt(0)){
                exist++;
            }

        }
        return exist;
    }


}
