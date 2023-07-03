package Luong;

public class LuongThread extends  Thread{
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        LuongThread luongThread = new LuongThread();
        luongThread.start();
    }
}
