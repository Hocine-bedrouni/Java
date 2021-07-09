package Fonction;

import java.util.Scanner;

public class CompteMot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("entrez une phrase");
        String str = scan.nextLine();
        System.out.println(compte(str));

    }

    public static String compte(String str){
        int exist= 1;
//        String[] str2 = str.split(" ");

        for (int i =0; i <str.length(); i++){
            if (str.charAt(i)== ' '  && (i+1!=str.length())){
                exist++;
            }
        }
        String str2 = "il y a " + exist +" mots dans cette phrase";
return str2;
    }
}
