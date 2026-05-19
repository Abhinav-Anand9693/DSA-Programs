import java.util.*;

public class DSA34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] weight = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }

        int sum = 0;  // declare outside loop
        for (int i = 0; i < N; i++) {
            if (weight[i] > T) {
                sum += 2;
            } else {
                sum += 1;
            }
        }

        System.out.print(sum);
    }
}
