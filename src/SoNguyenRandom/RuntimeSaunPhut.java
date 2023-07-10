package SoNguyenRandom;

import java.util.Random;

public class RuntimeSaunPhut {

    public static void main(String[] args) {
        int thoiGianChayPhut = 1; // Thời gian chạy của chương trình (phút)
        int khoangThoiGianGiay = 10; // Khoảng thời gian giữa các số ngẫu nhiên (giây)

        long startTime = System.currentTimeMillis(); //lay ra thoi gian hien tai
        long endTime = startTime + (thoiGianChayPhut * 60 * 1000);
        Random random = new Random();

        while (System.currentTimeMillis() < endTime) {
            int randomNumber = random.nextInt();
            System.out.println(randomNumber);

            try {
                Thread.sleep(khoangThoiGianGiay * 1000);//tam dung chuong trinh
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
