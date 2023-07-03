import java.util.LinkedList;
import java.util.Queue;

public class HangDoiQueue {

        public static void main(String[] args) {
            Queue<String> queue = new LinkedList<>();

            queue.add("A");
            queue.add("B");
            queue.add("C");

            System.out.println("Phần tử đầu tiên: " + queue.peek());

            String element = queue.poll();
            System.out.println("Phần tử lấy ra: " + element);

            System.out.print("Các phần tử còn lại: ");
            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
        }


}
