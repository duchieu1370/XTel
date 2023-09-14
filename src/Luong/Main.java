package Luong;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("start...");
        LuongThread luongThread = new LuongThread();
        luongThread.setName("Hieu");
        luongThread.start();

        LuongRunnable luongRunnable = new LuongRunnable();
        Thread thread = new Thread(luongRunnable);
        thread.start();

        luongThread.join();
        System.out.println("continue...");
        thread.join();
        System.out.println("end...");

//        try {
//            Thread.sleep(5000);
//            luongThread.stop();
//            thread.stop();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
