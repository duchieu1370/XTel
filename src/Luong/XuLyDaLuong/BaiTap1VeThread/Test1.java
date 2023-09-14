package Luong.XuLyDaLuong.BaiTap1VeThread;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadSinhSo t1 = new ThreadSinhSo();
        ThreadSinhChu t2 = new ThreadSinhChu();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("hien thi ket qua sinh ngau nhien");
        System.out.println("T1: " );
        for (int i = 0; i < t1.list.size(); i++) {
            System.out.print(" " + t1.list.get(i) );
        }
        System.out.println("\nT2: " );
        for (int i = 0; i < t2.list.size(); i++) {
            System.out.print(" " + t2.list.get(i));
        }
    }
}
