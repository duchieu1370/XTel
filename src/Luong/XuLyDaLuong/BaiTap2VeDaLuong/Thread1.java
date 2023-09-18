package Luong.XuLyDaLuong.BaiTap2VeDaLuong;

import Luong.XuLyDaLuong.BaiTap2VeDaLuong.SharedData;

import java.util.Random;

public class Thread1 extends Thread {
    SharedData sharedData;

    public Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            synchronized (sharedData) {
                int rad = random.nextInt(10);
                sharedData.rad = rad;
                System.out.println("T1 >" + rad);

                sharedData.notifyAll();
//                if (i == 19) {
//                    stop();
//                }
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
