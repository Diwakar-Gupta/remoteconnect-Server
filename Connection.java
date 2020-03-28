import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Connection {
    final Socket socket;
    final Scanner in;
    final PrintStream out;

    Connection(Socket s, Scanner in2, PrintStream out2) throws IOException {
        socket = s;
        in = in2;
        out = out2;
    }

    public void listen() throws IOException {Long l = Long.MIN_VALUE;
        while (true) {
            //new Scanner(System.in).nextLine();
            out.println(l.toString());l++;
            //out.flush();
            //System.out.println(in.nextLine());
            
        }
    }

}
