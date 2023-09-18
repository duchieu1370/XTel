package LamViecFile.WorkWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class DocGhi {
    public static void main(String[] args) {

        //Tạo thư mục
        File d = new File("D:\\Working\\xTel\\File");
        if (!d.exists()) {
            d.mkdir();
            //Tạo mới và viết nội dung vào file
            try {
                Formatter f = new Formatter("D:\\Working\\xTel\\File\\new.txt");
                f.format("Day la file \r\n", null);
                f.format("%s %s ", "Toi la", "Duc Hieu\r\n");
                f.format("%s %s ", "Day la", "Real Madrid");

                f.close();

            } catch (FileNotFoundException e) {
                System.out.println("Error");
            }

            //Đọc nội dung file
            try {
                File x = new File("D:\\Working\\xTel\\File\\new.txt");
                Scanner sc = new Scanner(x);
                String content = "";
                while (sc.hasNextLine()) {
                    content += sc.nextLine() + "\r\n";
                }
                System.out.println(content);

                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error");
            }
        } else {
            System.out.print("File đã có sẵn");
        }
    }
}
