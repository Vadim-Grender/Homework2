import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(buildstring(8, 'a', 'b'));
        CreateFile();

    }

    static String buildstring(int n, char c1, char c2) {
        String s = "";
        for (int i = 0; i < n / 2; i++) {
            s = s + c1 + c2;
        }
        return s;
    }
    public static void CreateFile() throws IOException {
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));
        String text = "TEXT";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < 100; i++) {
            os.write(bytes);
        }
        os.flush();
    }
}





