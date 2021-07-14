package 다이나믹프로그래밍;

import java.util.Scanner;

public class g11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int st[]= new int[n];
		for (int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		st[0]=1;
		for (int i=1; i<n; i++) {
			st[i]=1;
			for (int j=0; j<i; j++) {
				if (arr[j]<arr[i] && st[i]<=st[j]) {
					st[i]= st[j]+1;
				}
			}
		}
		int max=0;
		for (int i=0; i<n; i++) {
			if (st[i]>max) max=st[i];
		}
		System.out.println(max);
	}

}
