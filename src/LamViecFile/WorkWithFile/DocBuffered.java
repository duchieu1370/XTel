package LamViecFile.WorkWithFile;

import java.io.*;

public class DocBuffered {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Working\\xTel\\File\\new.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while (dis.available() != 0) {
                System.out.println(dis.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            bis.close();
            dis.close();
        }
    }
}
