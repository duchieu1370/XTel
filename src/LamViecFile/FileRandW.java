package LamViecFile;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileRandW {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter fileWriter = null;
        try {
            reader = new FileReader("D:\\Working\\xTel\\OnTap\\index.txt");
            fileWriter = new FileWriter("D:\\Working\\xTel\\OnTap\\index_cp2.txt");
            int check = reader.read();
            System.out.println((char) check);
            while ((check = reader.read()) != -1) {
                System.out.println((char) check);
                fileWriter.write(check);
            }
        } catch (Exception exception) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

}
