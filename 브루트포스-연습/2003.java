import java.util.Scanner;

public class g2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		int c=0;
		long sum=0;
		int left=0, right=0;
		while (true) {
			if (sum >= m) {
				sum -=arr[left++];
			}
			else if(right ==n) {
				break;
			}
			else {
				sum += arr[right++];
			}
			
			if(sum==m) {
				c++;
			}
		}
		System.out.println(c);
	}

}
