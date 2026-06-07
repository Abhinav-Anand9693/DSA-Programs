import java.util.Arrays;

public class DSA35{
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 6, 7};
        int b[] = {7, 4, 3, 2, 1};

        int c[] = new int[a.length + b.length];

        // Copy elements of a
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy elements of b
        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];
        }

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
}

