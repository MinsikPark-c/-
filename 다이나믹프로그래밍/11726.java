import java.util.Scanner;

public class g11726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int []d = new int [n+1];
		d[0]=1;
		if (n>0) d[1]=1;
		for (int i=2; i<n+1; i++) {
			d[i]= d[i-2]+d[i-1];
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}

}
