package Client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;

public class ClientWriter implements Runnable {

    private BufferedWriter clientOut;
    private Boolean running;

    public ClientWriter(BufferedWriter clientOut) {
        this.clientOut = clientOut;
        this.running = true;
    }


    @Override
    public void run() {
        while (running) {
            String response = this.receive();
            try {
                clientOut.write(response);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String receive() {
        return "";
    }

    public void terminate() {
        running = false;
    }
}

