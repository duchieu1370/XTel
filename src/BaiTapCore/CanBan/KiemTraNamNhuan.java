package BaiTapCore.CanBan;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nam : ");
        int a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.println("Nam " + a + " la nam nhuan");
        } else {
            System.out.println("Nam " + a + " khong phai la nam nhuan");
        }
    }
}
