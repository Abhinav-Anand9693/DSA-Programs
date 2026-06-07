import java.util.*;

public class DSA40 {
    public static void main(String[] args) {

        String text = "abcdefghijk";
        int size = 3;

        List<String> chunks = new ArrayList<>();

        for (int i = 0; i < text.length(); i += size) {
            chunks.add(text.substring(i, Math.min(i + size, text.length())));
        }

        System.out.println(chunks);
    }
}
