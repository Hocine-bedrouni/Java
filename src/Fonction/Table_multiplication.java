package Fonction;

import java.util.Scanner;

public class Table_multiplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int nb = scan.nextInt();
        table_multi(nb);

    }

    public static void table_multi(int nb){
        for (int i =1; i<=10; i++){
            System.out.println(i+ " x " + nb +" = "+ i*nb);
        }
    }
}
