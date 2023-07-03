package Luong;

public class DoUuTienPriority extends  Thread{
    public DoUuTienPriority(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Luồng: %s có độ ưu tiên là %d \n", getName(), getPriority());
        }
    }
}
