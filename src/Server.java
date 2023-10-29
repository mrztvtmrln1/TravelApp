import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(6001);
            Socket socket = server.accept();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
