package org.nation;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_test {

    public static void main(String[] args) {

        ArrayList<String> maliste = new ArrayList<String>();

        maliste.add("The Fleshtones");
        maliste.add("Hoodoo Gurus");
        maliste.add("The Bad Seeds");
        maliste.add("Wayne Kramer");

        Collections.sort(maliste);  // Tri de la liste

        maliste.forEach( (i)->  System.out.println(i)); //Syntaxe fonction
    }
}
