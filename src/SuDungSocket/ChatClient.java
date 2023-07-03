package SuDungSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6688);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        Scanner sc = new Scanner(System.in);
        while (true){
            String str =  sc .nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            if(str.equals("q")){
                break;
            }

            String str2 = dataInputStream.readUTF();
            System.out.println("Server say: " + str2);
        }

        dataOutputStream.close();
        socket.close();

    }
}
