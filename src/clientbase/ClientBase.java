package clientbase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientBase {

    public static void main(String[] args) {
        int i=0;
        while (true) {
            while (i==50000000) {
                System.out.println("Apertura connessione...");

                try {
                    Socket server = new Socket("127.0.0.1", 6666);

                    InputStream dalServer = server.getInputStream();

                    BufferedReader br = new BufferedReader(new InputStreamReader(dalServer));

                    String risposta = br.readLine();
                    System.out.println("Risposta del server: "+risposta);

                    br.close();
                    server.close();
                } catch (IOException ex) {
                    Logger.getLogger(ClientBase.class.getName()).log(Level.SEVERE, null, ex);
                }
                i=0;
            }
            i++;
        }
    }
}