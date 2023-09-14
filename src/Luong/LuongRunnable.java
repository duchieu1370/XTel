package Luong;

public class LuongRunnable implements  Runnable{
    LuongThread t1;

    public LuongRunnable() {
    }

    public LuongRunnable(LuongThread t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        System.out.println("t2 is running...");
        try {
            System.out.println("join t1 into t2");
            t1.join();
            System.out.println("t1 finish");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 15; i++) {
            try {
                System.out.println("thread2 > " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
