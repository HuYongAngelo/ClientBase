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
        Processo p1 = new Processo();
        
        Thread T1 = new Thread(p1);
        
        T1.run();
    }
}
