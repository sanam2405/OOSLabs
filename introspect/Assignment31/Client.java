package introspect.Assignment31;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 6969);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                System.out.print("Enter an integer: ");
                int numberSentFromClient = Integer.parseInt(reader.readLine());
                System.out.println("Integer sent to the server: " + numberSentFromClient);
                out.println(numberSentFromClient);

                // Receive factorial from server
                String factorial = in.readLine();
                System.out.println("Factorial received from server: " + factorial);

                System.out.print("Do you wish to continue ? (yes/no): ");
                String response = reader.readLine();
                if (response.toLowerCase().trim().equalsIgnoreCase(("no"))) {
                    out.println("exit");
                    break;
                }
            }

            socket.close();
            reader.close();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
