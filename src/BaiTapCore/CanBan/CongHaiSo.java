package BaiTapCore.CanBan;

import java.util.Scanner;

public class CongHaiSo {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        int a = sc.nextInt();
        System.out.print("Nhap so b : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.printf("Tong 2 so la : %,10d" , c);
    }
}
