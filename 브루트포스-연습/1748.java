import java.util.Scanner;

public class g1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum=0;
		int k=10;
		int t=1;
		for (int i=1; i<=n; i++) {
			if (i==k) {
				t++;
				k= k*10;
			}
			sum+=t;
		}
		System.out.println(sum);
	}

}
