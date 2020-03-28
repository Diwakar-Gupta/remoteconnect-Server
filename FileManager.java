import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class FileManager {

    final Socket socket;
    final Scanner in;
    final PrintStream out;

    public FileManager(Socket socket, Scanner in, PrintStream out) {
        this.in = in;
        this.socket = socket;
        this.out = out;
    }

    public void listen() {
    }

}
