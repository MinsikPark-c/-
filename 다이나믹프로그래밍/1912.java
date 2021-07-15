import java.util.Scanner;

public class g1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int [] st= new int [n];
		for (int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int max=arr[0];
		st[0]=arr[0];
		for (int i=1; i<n; i++) {
			st[i]= Math.max(st[i-1]+arr[i], arr[i]);
			max= Math.max(st[i], max);
		}
		System.out.println(max);
	}

}
