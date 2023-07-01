package ReNhanhVaLap;

import java.util.Scanner;

public class NhanhSwitch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-------Xac dinh so ngay trong thang-----");
        System.out.print("Nhap thang :");
        int thang = Integer.parseInt(sc.nextLine());
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 ngay");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 ngay");
                break;
            case 2:
                System.out.print("Nhap nam: ");
                int nam = Integer.parseInt(sc.nextLine());
                if ( nam % 4 == 0) {
                    System.out.println("29 ngay");
                }
                else {
                    System.out.println("28 ngay");
                }
                break;
            default:
                System.out.println("Thang khong hop le nha ban ");
        }

    }
}
