package org.nation;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    int nbl;
        System.out.println("Entrez le nombre de ligne désirées");
        nbl = scan.nextInt();

        for (int i =0; i<nbl; i++){

                for (int j= 0; j<nbl-i; j++)
                    System.out.print(" ");
                  for (int k =0; k<(i*2+1); k++)
                      System.out.print("*");
            System.out.println("");

        }

    }

}
