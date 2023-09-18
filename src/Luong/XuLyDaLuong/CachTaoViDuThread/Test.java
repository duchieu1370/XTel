package Luong.XuLyDaLuong.CachTaoViDuThread;

import Luong.XuLyDaLuong.CachTaoViDuThread.LuongRunnable;
import Luong.XuLyDaLuong.CachTaoViDuThread.LuongThread;

public class Test {
    public static void main(String args[]){
        System.out.println("start...");
        LuongThread t1 = new LuongThread();
        Thread t2 = new Thread(new LuongRunnable(t1));

        t1.start();
        t2.start();

        System.out.println("end...");
    }
}
