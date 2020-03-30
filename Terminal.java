import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Terminal {
    final Socket socket;
    final Scanner in;
    final PrintStream out;

    Terminal(Socket s, Scanner in2, PrintStream out2) {
        socket = s;
        in = in2;
        out = out2;
    }

    public void listen() {System.out.println("in terminal");
var k = new Scanner(System.in);
        while (true) {
            out.print(k.nextLine());
        }
    }
}
