package Luong;

public class LuongRunnable implements  Runnable{
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        LuongRunnable luongRunnable = new LuongRunnable();
        Thread thread = new Thread(luongRunnable);
        thread.start();
    }


}
