import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Connection {
    final Socket socket;
    final Scanner in;
    final PrintWriter out;

    Connection(Socket s) throws IOException {
        socket = s;
        in = new Scanner(s.getInputStream());
        out = new PrintWriter(s.getOutputStream());
    }

    public void listen() throws IOException {
        //while (true) {
            //new Scanner(System.in).nextLine();
            out.write("message is this");
            out.flush();
            
        //}
    }

}
