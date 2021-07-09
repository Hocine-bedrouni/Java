import org.junit.Test;

import java.util.HashMap;

public class CreateMapTest {
@Test
    public void createTest() {

    String KeyG = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
//        TransCoder transcodeTest = new Transcoder(KeyG);
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    alpha = alpha.toUpperCase();

  HashMap<String, String> encode = new HashMap<String, String>();

//        String[][] enc;

    int z = 0;

            for (int i = 0; i < alpha.length(); i++) {
                if( i<KeyG.length()){

//            System.out.println(KeyG.charAt(i));
//                encode.add(String.valueOf(alpha.charAt(z) + (String.valueOf(alpha.charAt(j)))));
                encode.put(String.valueOf(alpha.charAt(z))+ (String.valueOf(alpha.charAt(i))),(String.valueOf(KeyG.charAt(i))));


            }

        }
    System.out.println(encode);
        z++;
        System.out.println(z);
    }}



