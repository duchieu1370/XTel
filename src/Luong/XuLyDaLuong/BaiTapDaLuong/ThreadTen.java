package Luong.XuLyDaLuong.BaiTapDaLuong;

import java.util.logging.Logger;

public class ThreadTen extends Thread {
    SharedData sharedData;

    public ThreadTen(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    private static Logger logger = Logger.getLogger(String.valueOf(ThreadTen.class));

    @Override
    public void run() {
        for (int i = 0; i < sharedData.userList.length; i++) {
            synchronized (sharedData) {
                logger.info("Thong tin ten ----");
                System.out.println("Name : " + sharedData.userList[i]);
                sharedData.notifyAll();

                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
