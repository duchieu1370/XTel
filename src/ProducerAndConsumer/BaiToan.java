package ProducerAndConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BaiToan {

    private static final int MESSAGE_QUEUE_SIZE = 5;
    private static final int PRODUCER_DELAY_MS = 1000;
    private static final int CONSUMER_DELAY_MS = 1500;

    private static Queue<String> messageQueue = new LinkedList<>();

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            int messageCounter = 1;

            while (true) {
                synchronized (messageQueue) {
                    if (messageQueue.size() == MESSAGE_QUEUE_SIZE) {//neu hang doi day thi message chờ
                        try {
                            messageQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    String message = "Message " + messageCounter++;
                    messageQueue.add(message);
                    System.out.println("Produced: " + message);

                    messageQueue.notifyAll();//đánh thức dậy làm việc
                }

                try {
                    Thread.sleep(PRODUCER_DELAY_MS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (messageQueue) {
                    if (messageQueue.isEmpty()) {
                        try {
                            messageQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    String message = messageQueue.poll();//poll giong remove, ms trống thì không lỗi
                    System.out.println("Consumed: " + message);

                    messageQueue.notifyAll();
                }

                try {
                    Thread.sleep(CONSUMER_DELAY_MS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
