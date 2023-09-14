package Luong;

public class CachTaoLuong {
    public static void main(String[] args) {
        //cách1
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread1 >" + i);
                }
            }
        });
        thread.start();

        //cách2 cú pháp lambda
        new Thread(() -> {
        }).start();
    }
}
