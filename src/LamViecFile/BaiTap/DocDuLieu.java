package LamViecFile.BaiTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocDuLieu {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\Working\\xTel\\OnTap\\student.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Student>) objectInputStream.readObject();

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }

    }
}
