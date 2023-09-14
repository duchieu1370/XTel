package Luong.XuLyDaLuong.BaiTapDaLuong;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        SharedData sharedData = new SharedData();

        ThreadTen t1 = new ThreadTen(sharedData);
        ThreadQue t2 = new ThreadQue(sharedData);

        t2.start();
        t1.start();
    }
}
