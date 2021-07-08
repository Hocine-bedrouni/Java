package Fonction;

import java.util.Scanner;

public class function_test {

    public static void main(String args[])
    {
        long nL;
        Scanner scan = new Scanner(System.in);
        System.out.println("entrer un nombre entier");
        nL = scan.nextLong();
        System.out.println(fact(nL));
//        Console.lireC();
    }

    public static long fact(long n)
    {
        if (n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}


//    public static void main(String args[])
//    {
//        int tab[]={1,2,3,4,5,6,7,8};
//        int i;
//        System.out.println("avant l'appel de fonction");
//        for (i=0;i<8;i++)
//        {
//            System.out.print(tab[i]);
//            System.out.print('\t');
//        }
//        System.out.println();
//        System.out.println(calculeMoyenne(tab,8));
//        System.out.println("apres l'appel de fonction");
//        for (i=0;i<8;i++)
//        {
//            System.out.print(tab[i]);
//            System.out.print('\t');
//        }
//        System.out.println();
//
//    }
//
//    public static double calculeMoyenne(int tableau[], int nb)
//    {
//        int i;
//        double dMoyenne=0.0;
//        for (i=0;i<nb;i++)
//        {
//            dMoyenne+=tableau[i];
//            tableau[i]++;
//            System.out.println("noé est moche");
//        }
//        return dMoyenne/i;
//    }



//    public static void main (String[] args)
//    {
////        Scanner scan = new Scanner(System.in);
////        System.out.println("Entrer un chiffre");
////        double dPar = scan.nextDouble();
////        double dCarre;
////        dCarre = calculeCarre(dPar) ;
////        System.out.println(dCarre) ;
//        int tab[]={1,2,3,4,5,6,7,8};
//        System.out.println(calculeMoyenne(tab,8));
//
//    }
//    public static double calculeMoyenne(int tableau[], int nb) {
//        int i;
//        double dMoyenne = 0.0;
//        for (i = 0; i < nb; i++) {
//            dMoyenne += tableau[i];
//        }
//        return dMoyenne / i;
//
//
////    public static double calculeCarre(double dd)
////    {
////        double result ;
////        return result = dd*dd ;
//////
////    }
//
//    }

