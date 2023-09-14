package BaiTapCore.CanBan;

import java.util.Scanner;

public class NhanHaiSo {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b : ");
        double b = sc.nextDouble();
        double c = a * b;
        System.out.printf("Tong 2 so la : %,10.2f" , c);
    }
}
