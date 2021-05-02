import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var fileReader = new FileReader(new File("/etc/group"));
        var bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
    }
}