package SoNguyenRandom;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RuntimeRandom {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\Working\\xTel\\File\\output.txt");
            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            while (true) {
                System.out.print("Nhập lệnh: ");
                String nhap = sc.nextLine();

                if (nhap.equalsIgnoreCase("stop")) { //so sanh 2 chuoi không phân biệt hoa, thường
                    break;
                }

                int randomNumber = random.nextInt();
                writer.write(randomNumber + "\n");
                writer.flush();//co the gui du lieu truoc khi bo dem day
            }

            writer.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
