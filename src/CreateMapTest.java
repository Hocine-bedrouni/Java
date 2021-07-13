
//
//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class CreateMapTest {
//
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    @Test
//    public void createTest() {
//
//    String KeyG = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
////        TransCoder transcodeTest = new Transcoder(KeyG);
//    String alpha = "abcdefghijklmnopqrstuvwxyz";
//    alpha = alpha.toUpperCase();
//
//
//    HashMap<String, String> tab2 = new HashMap<>();
//    HashMap<String, String> tab1 = new HashMap<>();
//    int i = 0;
//    int premier = 0;
//    int deuxieme = 0;
//
//    for ( i = 0; i < KeyG.length(); i++) {
//
//        if(deuxieme==26){
//            deuxieme=0;
//            premier++;
//            tab1.put(String.valueOf(alpha.charAt(premier))+ (String.valueOf(alpha.charAt(deuxieme))),(String.valueOf(KeyG.charAt(i))));
//            tab2.put((String.valueOf(KeyG.charAt(i))), String.valueOf(alpha.charAt(premier))+ (String.valueOf(alpha.charAt(deuxieme))));
//
//        } else
//        {
//            tab1.put(String.valueOf(alpha.charAt(premier))+ (String.valueOf(alpha.charAt(deuxieme))),(String.valueOf(KeyG.charAt(i))));
//            tab2.put((String.valueOf(KeyG.charAt(i))), String.valueOf(alpha.charAt(premier))+ (String.valueOf(alpha.charAt(deuxieme))));
//
//        }
//        deuxieme++;
//    }
//
//
//
//
//
//
//
//
//
//    System.out.println(tab1);
//    System.out.println(tab2);
//
//
//   }
//
//
////    public CreateMapTest(String encodedTest) {
////        this.encodedTest = encodedTest;
////    }
//
//    @Test
//    public String MenuCrypto() throws IOException {
//
//        String home = System.getProperty("user.dir");
//        Path adress = Paths.get(home, "key.txt");
//
//      HashMap<String, String> adressfichier = new HashMap<>();
//
//        boolean coder= true;
//        boolean continuer = true;
//        Scanner scan = new Scanner(System.in);
//
//        do {
//
//            System.out.println("╔══════════════════════════════════════╗\n" +
//                    "║   System d'encodage et de décodage   ║\n" +
//                    "║             de messages              ║\n" +
//                    "╠══════════════════════════════════════╣\n" +
//                    "║       1) Décoder un message          ║\n" +
//                    "║       2) Encode un message           ║\n" +
//                    "║       3) Quitter                     ║\n" +
//                    "╚══════════════════════════════════════╝");
//            int choix = scan.nextInt();
//
//
//            switch (choix) {
//
//                case 1 -> {
//                    coder = true;
//                    System.out.println("Nous allons décoder le message");
//                    System.out.println("Taper le nom du fichier a décoder sans extension");
//                    adressfichier.put("encodedTest", scan.next());
//
//
//
////                    scan = new Scanner(System.in);
////                    String encodedTest = scan.nextLine();
////                    encodedTest = encodedTest+".txt";
//                    System.out.println("Taper le nom du fichier contenant la clef sans extension");
//                    adressfichier.put("listkey", scan.next());
////                    String fileClef = scan.nextLine();
////                    fileClef = fileClef +".txt";
////                    ArrayList<String> listkey = new ArrayList();
//
//
//                }
//                case 2 -> {
//                    coder = false;
//                    System.out.println("Nous allons encoder le message");
//                    System.out.println("entrez le nom du fichier à décoder sans extension");
//
//                    adressfichier.put("pageVide", scan.next());
//                    System.out.println("Entrez le nom du fichier contenant la clé de décodage (sans extension)");
//                    adressfichier.put("liskey", scan.next());
//
//                }
//                case 3 -> {
//                    continuer = false;
//                }
//            }
//        } while (continuer);
//
//
//    }
//
//
//
//
//
//
//}
