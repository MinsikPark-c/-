import java.util.Scanner;

public class ㅎ1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int []arr= new int[n+1];
		arr[2]=1;
		arr[3]=1;
		for (int i=4; i<=n; i++) {
			if (i%6==0) {
				arr[i]=Math.min(arr[i/3], Math.min(arr[i/2], arr[i-1]))+1;
			}
			else if (i%3==0) {
				arr[i]=Math.min(arr[i/3], arr[i-1])+1;
			}
			else if (i%2==0) {
				arr[i]=Math.min(arr[i/2], arr[i-1])+1;
			}
			else {
				arr[i]=arr[i-1]+1;
			}
			}
		System.out.println(arr[n]);
	}

}
