package org.nation;

import java.util.Scanner;

public class Temperature {

    public static void main (String arg[]){

        double fahren;
        double celsius;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer la temperature en Fahrenheit");
        fahren = scan.nextFloat();
        celsius = (fahren-32) * (5.0/9.0);
        System.out.println("La température est de " + celsius +" degrée");


    }


}
