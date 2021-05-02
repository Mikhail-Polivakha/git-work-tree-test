import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketReader {

    private final Logger logger = Logger.getLogger(Socket.class.getSimpleName());

    public String readFromSocket(Socket socket) throws IOException {
        final InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        logger.log(Level.INFO, "Start reading from socket..." + socket.getInetAddress());
        StringBuilder resultStringBuilder = new StringBuilder();
        while (Objects.nonNull(line = bufferedReader.readLine())) {
            resultStringBuilder.append(line);
        }
        return resultStringBuilder.toString();
    }
}