import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    static void Mapper(Socket socket) throws IOException {
        final Scanner in = new Scanner(socket.getInputStream());
        final PrintStream out = new PrintStream(socket.getOutputStream());
        final String type = in.nextLine();
        switch (type) {
            case "pc":
                new Thread() {
                    public void run() {
                        try {
                            new Connection(socket, in, out).listen();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                break;
            case "terminal":
                new Thread() {
                    public void run() {
                        new Terminal(socket, in, out).listen();
                    }
                }.start();
                break;
            case "file":
                new Thread() {
                    public void run() {
                        new FileManager(socket, in, out).listen();
                    }
                }.start();
            default:
        }

    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9952);

        while (true) {
            final Socket socket = serverSocket.accept();
            System.out.println("connected");
            Mapper(socket);
        }
    }

}