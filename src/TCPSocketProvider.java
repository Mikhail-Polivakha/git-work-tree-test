import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSocketProvider {

    private ServerSocket serverSocket;

    public TCPSocketProvider() {
        try {
            this.serverSocket = new ServerSocket(8711);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void open() throws IOException {
        final Socket socket = serverSocket.accept();
        final InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        while (inputStream.read(buffer) != -1) {
            System.out.println("I take as my PTSD, I thinks this is my PTSD");
        }
    }
}
