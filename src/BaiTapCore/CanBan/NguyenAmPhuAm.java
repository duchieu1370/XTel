package BaiTapCore.CanBan;

import java.util.Scanner;

public class NguyenAmPhuAm {
    public static void main(String[] arg) {
        boolean kiemTra = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ky tu ban muon kiem tra nguyen am , phu am : ");
        char a = sc.next().charAt(0);
        switch (a) {
            case 'u':
            case 'e':
            case 'o':
            case 'a':
            case 'i':
            case 'U':
            case 'E':
            case 'O':
            case 'A':
            case 'I':
                kiemTra = true;
        }
        if (kiemTra == true){
            System.out.println(a + " la nguyen am");
        } else {
            if ( (a >= 'a' && a <='z' )|| (a >= 'A' && a <= 'Z')){
                System.out.println(a + " la phu am");
            } else {
                System.out.println("Khong nam trong bang chu cai");
            }
        }
    }
}
