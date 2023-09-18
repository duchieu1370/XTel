package Luong.XuLyDaLuong.BaiTap2VeDaLuong;

public class CustomThread extends Thread{
    SharedData sharedData;

    public CustomThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

//    @Override
//    public void run() {
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            int rand = random.nextInt(5);
//            sharedData.add(rand);
//        }
//    }
}
