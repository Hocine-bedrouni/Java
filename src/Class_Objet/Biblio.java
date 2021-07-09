package Class_Objet;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblio{


    public static void main(String[] args) {



    ArrayList<String> bib = new ArrayList<>();
    String[] aff = new String[4];
//    String[] temp = new ArrayList<String>().toArray(new String[0]);
    String tmp;
    Scanner scan = new Scanner(System.in);
   for(int i = 1; i<aff.length;i++) {
       // entrez toutes les infos séparées par ce que tu veux
       System.out.println("Entrer le nom et prénom de l'auteur ainsi que son ISBN séparer seulement de virgule");
// rentre les infos avec le scan next
       tmp = scan.nextLine();
        // decoupe la chaine par le séparateur

       String[] temp= tmp.split("," );
       for (int j=0; j<temp.length; j++){
           System.out.println(temp[j]);
           aff[j] = temp[j];
           System.out.println(aff[j]);

       }

//       System.out.println(tmp.toString());
//        Livre machin = new Livre(infos); Livre livre = new Livre(tablo.get(0),tablo.get(1);
//      aff.add(new Livre(bib.get(0), bib.get(1), bib.get(2), Integer.parseInt(bib.get(3)),i));
       //(String nom, String prenom, String categorie, int ISBN, int id)

       System.out.println(temp.toString());

//aff.add(machin);
    }
   //sout aff
//        System.out.println(ArrayList.aff);

}
}

