package WorkWithFile;

import java.io.File;

public class WorkWFile {
    public static void main(String[] args) {
        File x = new File("D:\\Working\\xTel\\OnTap\\index.txt");

        System.out.println("Tên file: " + x.getName());
        System.out.println("Thư mục: " + x.getPath());

        if (x.exists()) {
            System.out.println("File" + x.getName() + " exists!");
        } else {
            System.out.println("The file does not exist");
        }
    }
}
