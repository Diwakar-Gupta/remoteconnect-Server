import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9952);

        while (true) {
            var socket = serverSocket.accept();
            System.out.println("connected");
            new Thread() {
                public void run() {
                    try {
                        new Connection(socket).listen();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

}