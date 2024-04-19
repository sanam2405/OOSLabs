package introspect.Assignment31;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6969);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                clientSocket.setSoTimeout(10000); // client socket closes after 10 seconds of client inactivity

                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                    while (true) {
                        String input = in.readLine();
                        if (input == null || input.trim().equalsIgnoreCase("exit")) {
                            System.out.println("Client wishes to exit. Closing connection...");
                            System.exit(0); // exits the program if input is null or "exit"
                        }
                        int numberReceivedFromClient = Integer.parseInt(input);
                        System.out.println("Integer received from client: " + numberReceivedFromClient);
                        int factorial = calculateFactorial(numberReceivedFromClient);

                        // send factorial to client
                        out.println(factorial);
                    }
                } catch (SocketTimeoutException e) {
                    System.out.println("No input received from client for 10 seconds. Closing connection...");
                } finally {
                    clientSocket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }
}
