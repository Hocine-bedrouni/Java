package org.nation;

import javax.xml.transform.Source;
import java.nio.file.FileSystemAlreadyExistsException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

//    public static void main (String args[])
//    {
//        int nX = 8, nY = 13 ;
//        int nZ = 0 ;
//        System.out.println(nX) ;
//        System.out.println(nY) ;
//        System.out.println(++nX) ;
//        System.out.println(nX) ;
//        System.out.println(nY++) ;
//        System.out.println(nY) ;
//        System.out.println(nX) ;
//        System.out.println(nY) ;
//        nZ = ++nX ;
//        System.out.println(nZ) ;
//        nZ = nY++ ;
//        System.out.println(nZ) ;
//    }


    final static double PI=3.1416;

    public static void main(String[] args) {
        double rayon;
        double perimetre;
        double surface;
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrer le rayon: ");
        rayon = scan.nextDouble();
        perimetre = 2 * PI * rayon;
        surface = rayon * rayon * PI;
        System.out.print("Le périmètre vaut: ");
        System.out.println(perimetre);
        System.out.println("La surface fait  : " + surface);
    }

    //    public static void main(String[] args) {
//	// write your code here
//        int n = 0;
//        Scanner sc = new Scanner(System.in);
//        try
//        {
//            n = Integer.parseInt(sc.next());
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.printf("Format incorrect");
//            System.exit(0);
//        }
//        System.out.println(n);
    }




