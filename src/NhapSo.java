import java.util.Scanner;

public class NhapSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rightNumber = 17;

        int soLanNhap = 0;
        boolean thanhCong = false;

        while (soLanNhap < 5) {
            System.out.print("Nhập số bạn cần tìm: ");
            int so = sc.nextInt();
            soLanNhap++;
            if (so == rightNumber) {
                thanhCong = true;
                break;
            } else {
                    System.out.println("Số không đúng. Bạn hãy lần thử lại.");
            }
        }

        if (thanhCong) {
            System.out.println(" Bạn đã nhập đúng số cần nhập.");
        } else {
            System.out.println("Bạn đã nhập sai quá 5 lần. Chương trình kết thúc.");
        }

        sc.close();
    }
}


