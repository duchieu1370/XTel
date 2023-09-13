package LamViecFile;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\Working\\xTel\\OnTap\\index.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);
            String result = new String(data,0, length);
            System.out.println(result);
        } catch (Exception exception) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        }
    }
}
