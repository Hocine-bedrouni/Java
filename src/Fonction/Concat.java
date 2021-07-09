package Fonction;

import java.util.Scanner;

public class Concat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez une phrase");
        String str1 = scan.nextLine();
        System.out.println("Entrez une 2ème phrase");
        String str2 = scan.nextLine();
        System.out.println(concate(str1, str2));
    }

    public static String concate(String str1, String str2) {

        String str3 = (str1+" "+str2);

        return str3;
    }
}




