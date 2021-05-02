import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Arrays;

public class UDPService {

    public void openSocket() throws IOException {
        final DatagramSocket datagramSocket = new DatagramSocket(new InetSocketAddress("localhost", 8772));
        byte[] content = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(content, 1024);
        datagramSocket.receive(datagramPacket);
        System.out.println(Arrays.toString(datagramPacket.getData()));
    }


}
