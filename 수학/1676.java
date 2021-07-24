import java.util.Scanner;

public class g1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int n5=0;
		int k=5;
		while (n>=k) {
			n5 += n/k;
			k =k*5;
		}
		System.out.println(n5);
	}

}
