package SuDungSocket.Chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

public class Client {

    private static final String SERVER_IP = "127.0.0.1"; // Địa chỉ IP của máy chủ
    private static final int SERVER_PORT = 12345; // Cổng kết nối

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String randomString = generateRandomString();
                writer.println(randomString);
                System.out.println("Sent: " + randomString);

                Thread.sleep(1000); // Gửi chuỗi mỗi giây

                // Lưu ý: Để kiểm tra xử lý ngoại lệ, có thể rút dây mạng tại đây

                // Cần thêm xử lý ngoại lệ cho việc mất kết nối với máy chủ trong quá trình gửi
                if (socket.isClosed()) {
                    System.err.println("Lost connection to the server.");
                    break;
                }
            }

            writer.close();
            socket.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String generateRandomString() {
        int leftLimit = 97; // 'a'
        int rightLimit = 122; // 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String randomString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return randomString;
    }

}
