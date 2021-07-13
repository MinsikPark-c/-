import java.util.Scanner;

public class g15988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int d[]= new int[n];
		for (int i =0; i<n; i++) {
			d[i]= sc.nextInt();
		}
		long k[]= new long [1000001];
		k[1]=1;
		k[2]=2;
		k[3]=4;
		for (int i=4; i<=1000000; i++) {
			k[i]= (k[i-1]+k[i-2]+k[i-3])%1000000009;
				}
		for (int i=0; i<n; i++) {
			System.out.println(k[d[i]]);
		}
	}

}
