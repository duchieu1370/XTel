package LamViecFile;

import com.sun.tools.javac.Main;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        //doc du lieu tu 1 file
        //read/write text/binary
        try {
            fileInputStream = new FileInputStream("D:\\Working\\xTel\\OnTap\\index.txt");
            fileOutputStream = new FileOutputStream("D:\\Working\\xTel\\OnTap\\index_cp.txt");
            int check;
            while ((check = fileInputStream.read()) != -1) {
                System.out.println((char)check);
                fileOutputStream.write(check);
            }
        } catch (Exception exception){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
