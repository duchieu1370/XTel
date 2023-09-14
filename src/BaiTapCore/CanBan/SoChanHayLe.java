package BaiTapCore.CanBan;

import java.util.Scanner;

public class SoChanHayLe {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so : ");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println("So ban vua nhap la so chan");
        } else {
            System.out.println("So ban vua nhap la so le");
        }
    }
}
