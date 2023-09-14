package Luong.XuLyDaLuong.BaiTap1VeThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadSinhSo extends  Thread{
    List<Integer> list = new ArrayList<>();
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rad = random.nextInt(100);
            list.add(rad);
            System.out.println("t1 > " + rad);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
