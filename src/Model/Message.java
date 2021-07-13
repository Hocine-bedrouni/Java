package Model;

import Tools.TransCoder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Message {

    private Boolean encoded;
    private List<String> msgClear = new ArrayList<>();
    private List<String> msgEncodded = new ArrayList<>();
    private Path msgclearPath = Paths.get(System.getProperty("user.dir"), "clear.txt");
    private Path msgEncodedPath = Paths.get(System.getProperty("user.dir"), "encod.txt");
    private Path keyPath = Paths.get(System.getProperty("user.dir"), "key.txt");
    private String key;
    private TransCoder trans;


    public void message(boolean encoded, Path msgclearPath, Path msgEncodedPath, Path keyPath) throws IOException {

        this.encoded = encoded;
        this.msgclearPath = msgclearPath;
        this.msgEncodedPath = msgEncodedPath;
        this.keyPath = keyPath;
        this.key = Files.readString(keyPath);

        this.trans = new TransCoder(key);
    }

    public void readNwrite() throws IOException {


        if (encoded) {

            try {
                msgEncodded = Files.readAllLines(msgEncodedPath);
//                Files.writeString(adress, lig + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("en cours de décodage");
            for (String ligne : msgEncodded) {
                //System.out.println(ligne);
                String ligneDecrypte = trans.decodage(ligne);
                System.out.println(ligneDecrypte);
                try {
                    Files.writeString(msgclearPath, ligneDecrypte + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Le message décodé se trouve: " + msgclearPath.toString());
        } else {
            try {
                msgClear = Files.readAllLines(msgclearPath);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            for (String ligne : msgClear) {
                System.out.println(ligne);
                String ligneCrypte = trans.codage(ligne);
                try {
                    Files.writeString(msgEncodedPath, (ligneCrypte + System.lineSeparator()), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Le message codé se trouve: " + msgEncodedPath.toString());
        }
    }
}





