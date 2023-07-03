package SuDungSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6688);
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        Scanner sc = new Scanner(System.in);
        while (true){
            //doc du lieu tu client truyen len
            String str = dataInputStream.readUTF();
            if(str.equals("q")){
                break;
            }

            System.out.println("Client say:" + str);

            //truyen du lieu tu server ve
            String str2 = sc.nextLine();
            dataOutputStream.writeUTF(str2);
            dataOutputStream.flush();
        }

        dataOutputStream.close();
        dataInputStream.close();
        socket.close();
        serverSocket.close();

    }
}
