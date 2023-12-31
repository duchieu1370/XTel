package BaiTapCore;

import java.util.Scanner;

public class TinhTienDien {
    static Scanner sc = new Scanner(System.in);

    public static double tienDien(double k) {
        if (k <= 100) {
            return k * 1000;
        } else if (k <= 150) {
            return 100 * 1000 + (k - 100) * 1500;
        } else {
            return 100 * 1000 + 50 * 1500 + (k - 150) * 2000;
        }
    }

    public static void main(String[] args) {
        System.out.print("Mời bạn nhập số điện trong tháng: ");
        double k = sc.nextDouble();
        if (k < 0) {
            System.out.print("Số điện không thỏa mãn");
        } else {
            System.out.printf("So tien phai tra la %,10.0f dong", tienDien(k));
        }
    }
}
