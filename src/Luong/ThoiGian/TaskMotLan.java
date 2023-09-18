package Luong.ThoiGian;

import java.util.Date;
import java.util.Timer;

public class TaskMotLan {
    public static void main(String[] args) {
        Task myTask = new Task();
        Timer timer = new Timer();
        System.out.println("Currnet time: " + new Date());
        timer.schedule(myTask, 5000);

    }
}
