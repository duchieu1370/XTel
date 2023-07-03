package ThoiGian;

import java.util.Timer;

public class TaskNhieuLan {
    public static void main(String[] args) {
        Task myTask = new Task();
        Timer timer = new Timer();
        timer.schedule(myTask, 0, 2000);
    }
}
