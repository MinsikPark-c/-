package 브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class g15654 {
	static int n, m;
	static int []array;
	static int [] arr;
	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		arr= new int [n];
		array = new int [m];
		visit = new boolean[n+1];
		for (int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		sort(0);
	}
	static void sort(int k) {
		if (k==m) {
			for (int i=0; i<m; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
		else {
			for (int i=0; i<n; i++) {
				if(!visit[i]) {
					visit[i]= true;
					array[k]= arr[i];
					sort(k+1);
					visit[i]=false;
				}
			}
		}
	}
}
