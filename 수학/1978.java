import java.io.IOException;
import java.util.Scanner;

public class g1978 {
	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = 0, t = 0;

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			k = 0;

			for (int j = 1; j <= num; j++) {
				if (num % j == 0)
					k++;
			}

			if (k == 2)
				t++;
		}
		System.out.print(t);
	}
}
