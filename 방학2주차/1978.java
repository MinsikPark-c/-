package 방학2주차;

import java.util.Scanner;

public class g1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int [n];
		for (int i=0; i<n; i++) {
			array[i] = input.nextInt();
		}
		int count=0;
		int num=0;
		for (int i=0; i<n; i++) {
			for (int k=2; k<=array[i]; k++) {
				if (array[i]%k==0) num=k;
			}
			if(array[i]==num) count++;
			num=0;
		}
	
		System.out.println(count);
	}
}
