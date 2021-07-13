import Tools.TransCoder;
import org.germain.tool.ManaBox;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadKeyTest {

    @Test
    public void readKeyTest() {
        // La clé cryptée donnée plus haut
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        // La clé décryptée que nous devrions obtenir
        String keyDecrypted = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        // le test d'égalité entre la clé attendue et la sortie de la méthode de la librairie. Si le décryptage ne fonctionne pas nous aurons le message définit ici
        Assert.assertEquals("La librairie de décryptage est mal installée", keyDecrypted, ManaBox.decrypt(keyCrypted));

    }

    @Test
    public void essai() {
    TransCoder trans = new TransCoder("CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c");
    }

    @Test
    public void testcodage(){
        TransCoder trans = new TransCoder("CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c");
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrer une phrase à coder");
//        String str1 = scan.nextLine();
        System.out.println( trans.codage("Salut"));
    }

    @Test
    public void testdecodage(){
        TransCoder trans = new TransCoder("CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c");

        System.out.println( trans.decodage("ANAJAHBLBG"));
    }

//    @Test
//    public void message(Boolean encoded){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Le message est-il codé (true ou false)");
//        if (scan.nextLine() == "true"){
//
//            System.out.println("le message est codé");
//            encoded = true;
//        } else {
//
//            System.out.println("le message est décodé");
//            encoded = false;
//        }
//    }


@Test
    public void readNwrite() throws IOException {

//        String ligne;
//        File pathkey = new File("C:/Users/80010-02-02/Desktop/Afpa-cda/JAVA/java-debut/src/Tools/key.txt");
        String home = System.getProperty("user.dir");
    Path adress = Paths.get(home, "clear.txt");

    List<String> listecriture = new ArrayList();
    for (int i= 0; i < 5; i++){
        listecriture.add(String.format("Hello %d fois", i));}
    for (String lig : listecriture){
        try {
            Files.writeString(adress, lig + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


//        BufferedReader reader = new BufferedReader(new FileReader(pathkey));


List<String> listkey = new ArrayList<>();
        try {
            listkey= Files.readAllLines(adress);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      for (String ligne : listkey){
          System.out.println(ligne);
      }
//
//
// si le mec a appuyé sur 2
//         mess = new message(true,..)
//         si le mec a appuyé sur 1
//         mess = new message(false,..)
//        ABBA c'est genial
//        Message mess = new Message();
//
//
//    }
//
//    @Test
//    public void testdir()
//    {
//        String home = System.getProperty("user.dir");
//        System.out.println(home);
//    }
}}


