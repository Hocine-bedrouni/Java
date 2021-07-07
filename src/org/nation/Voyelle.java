package org.nation;

import java.util.Scanner;

public class Voyelle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str;
        int nbletre;
        char a;
        int nbvoyel = 0;

        System.out.println("Entrez un mot");
        str= scan.nextLine();
        nbletre= str.length();
//        System.out.println(nbletre);

        for (int i=0; i< nbletre;i++){
                a= str.charAt(i);
                if (a == 'a'|| a == 'A'||a == 'e'||a == 'E'||a == 'i'||a == 'I'||a == 'O'||a == 'o'||a == 'u'||a == 'U'||a == 'y'||a == 'Y'){
                    nbvoyel++;
                }
        }
        System.out.println(nbvoyel);

    }
}
