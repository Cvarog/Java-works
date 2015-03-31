package tasks;

import java.io.*;
/**
 * Created by Admin on 18.03.2015.
 */
public class FileWork {



    public static void main(String[] args) {
        File f = new File("111.txt");
        System.out.println(f.canRead());
        System.out.println(f.length());
        BufferedReader br = null;
        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader(f));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

}



