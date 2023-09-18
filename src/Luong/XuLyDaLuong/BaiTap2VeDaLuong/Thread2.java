package Luong.XuLyDaLuong.BaiTap2VeDaLuong;


import Luong.XuLyDaLuong.BaiTap2VeDaLuong.SharedData;

public class Thread2 extends Thread {
    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (sharedData) {

//                if (i == 19) {
//                    stop();
//                }
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int result = sharedData.rad * sharedData.rad;
                System.out.println("T2 > " + result);
                sharedData.notifyAll();

            }

        }
    }
}
