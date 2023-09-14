package Luong.XuLyDaLuong;

public class SharedData {
    public int rad = 0;
    public int x = 0;
    //nhiều luồng thao tác vào 1 hàm thì để synchronized ở hàm
//    public synchronized void add(int plus){
//        x += plus;
//        System.out.println("\nday so x: " + x);
//        for (int i = 0; i < x; i++) {
//            System.out.print(" " + i);
//        }
//    }
}
