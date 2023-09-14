package BaiTapCore.CanBan;

import java.util.Scanner;

public class CongHaiSoPhuc {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        System.out.print("Nhap so x : ");
        double x = sc.nextDouble();
        System.out.print("Nhap so y : ");
        double y = sc.nextDouble();
        double z = x + y;
        System.out.printf("Tong 2 so la : %,10.2f", z);

    }
}
