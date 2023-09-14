package Luong;

import Luong.XuLyDaLuong.SharedData;

import java.util.Random;

public class LuongThread extends  Thread{
    SharedData shareData;

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            synchronized (shareData){
                System.out.println("t1 > i > " + i);
            }
            try {
                System.out.println("thread1 > " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
