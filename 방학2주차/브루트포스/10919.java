package 브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class g10819 {
	static int n;
	static int answer;
	static int[] array;
	static int [] arr;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		array = new int [n];
		for (int i=0; i<n; i++) {
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		visited = new boolean[n];
		arr= new int[n];
		answer=0;
		getMax(0);
		System.out.println(answer);
	}
	public static void getMax(int k) {
		if(k==n) {
			int sum=0;
			for (int i=0; i<n-1; i++) {
				sum += Math.abs(arr[i]-arr[i+1]);
			}
			answer = Math.max(answer, sum);
			return;
		}
		for (int i=0; i<n; i++) {
			if(visited[i]) continue;
			visited[i]= true;
			arr[k]=array[i];
			getMax(k+1);
			visited[i]= false;
		}
	}
}
