package Luong.ThoiGian;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Time {
    public static void main(String[] args) {
        Task task = new Task();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 5);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date dateSchedule = calendar.getTime();
        long period = 24 * 60 * 60 * 1000;

        Timer timer = new Timer();
        timer.schedule(task, dateSchedule, period);
    }

}
