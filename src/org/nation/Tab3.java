package org.nation;

import java.util.Arrays;
import java.util.Scanner;

public class Tab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] tab={8,9,6,7,4,3,5,1,2};
        int taille = tab.length;
        int tmp = 0;
        System.out.println(Arrays.toString(tab));
        for (int i = 0; i < tab.length; i++){
            for(int j=1; j< (tab.length-i); j++){
                if (tab[j-1] > tab[j]){
                        tmp = tab[j-1];
                        tab [j-1] =tab[j];
                        tab[j]= tmp;
                }
            }
        }

        System.out.println(Arrays.toString(tab));
    }
}
