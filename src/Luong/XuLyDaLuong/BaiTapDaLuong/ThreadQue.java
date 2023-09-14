package Luong.XuLyDaLuong.BaiTapDaLuong;

public class ThreadQue extends Thread{
    SharedData sharedData;

    public ThreadQue(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < sharedData.addressList.length; i++) {
            synchronized (sharedData){
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Address : " + sharedData.addressList[i]);
            }
        }
        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}
