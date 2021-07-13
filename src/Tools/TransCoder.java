package Tools;

import java.util.HashMap;

public class TransCoder {
    private HashMap<Character, String> decodage = new HashMap<>();
    private HashMap<String, Character> codage = new HashMap<>();

    public HashMap<String, Character> getcodage() {
        return codage;
    }

    public HashMap<Character, String> getDecodage() {
        return decodage;
    }


    public TransCoder(String key) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        alpha = alpha.toUpperCase();


        int i = 0;
        int premier = 0;
        int deuxieme = 0;

        for (i = 0; i < key.length(); i++) {

            if (deuxieme == 26) {
                deuxieme = 0;
                premier++;
                codage.put(String.valueOf(alpha.charAt(premier)) + (String.valueOf(alpha.charAt(deuxieme))), (key.charAt(i)));
                decodage.put((key.charAt(i)), String.valueOf(alpha.charAt(premier)) + (String.valueOf(alpha.charAt(deuxieme))));

            } else {
                codage.put(String.valueOf(alpha.charAt(premier)) + (String.valueOf(alpha.charAt(deuxieme))), (key.charAt(i)));
                decodage.put((key.charAt(i)), String.valueOf(alpha.charAt(premier)) + (String.valueOf(alpha.charAt(deuxieme))));
            }
            deuxieme++;
        }
        System.out.println(codage);
        System.out.println(decodage);
    }

    public String codage(String str) {

//        System.out.println(tab2.get('l'));
//        System.out.println(tab2);
//        System.out.println(tab2.get('a'));
//        System.out.println(tab2.get('e'));

        String res = "";
        for (char ch : str.toCharArray()) {
            res += decodage.get(ch);

            // pour chaque char =>valeur tablo
            // string += tablo.get(char)
        }
         return res;
    }

    public String decodage(String str){

        String res = "";

        for (int i =0; i <=str.length()-2; i+=2){

            res += codage.get(str.substring(i, i+2));

//            System.out.println();
        }
return res;
    }


}










