import GUI.MenuCrypto;
import Model.Message;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        MenuCrypto menucrypt = new MenuCrypto();
        Map tab = menucrypt.Menu();

        String home = System.getProperty("user.dir");


        if ("decode".equals(tab)){
            Path msgClearPath;
            Path msgEncodedPath;
            Path msgKeyPath;
            Message message;
            Map<String,String> choix = MenuCrypto.choixadr(tab);
            //Path msgClearPath = Paths.get(home,"decoded.txt");
            switch (tab) {
                case "decode" -> {
                    msgClearPath = Paths.get(home, "decoded.txt");
                    msgEncodedPath = Paths.get(home, choix.get("encodedFile") + ".txt");
                    msgKeyPath = Paths.get(home, choix.get("keyFile") + ".txt");
                    message = new Message();
                    message.readNwrite();
                }
                case "encode" -> {
                    msgClearPath = Paths.get(home, choix.get("clearFile") + ".txt");
                    msgEncodedPath = Paths.get(home, "encoded.txt");
                    msgKeyPath = Paths.get(home, choix.get("keyFile") + ".txt");
                    message = new Message();
                    message.readNwrite();
                }
            }
        }
    }
}

https://github.com/germainsip/tdJavaCrypt/blob/finc_correction/src/com/afpa/GUI/Menu.java

https://github.com/germainsip/tdJavaCrypt/blob/master/src/com/afpa/tools/Transcoder.java