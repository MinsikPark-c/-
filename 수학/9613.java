import java.util.*;

public class g9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
            arr[j] = sc.nextInt();
            long sum = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++)
                    sum += gcd(arr[j], arr[k]);
            }
            System.out.println(sum);
        }
    }
    static int gcd (int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
