package 방학2주차;

import java.util.Scanner;

public class gk9613 {
	static int gcd(int a, int b) {
		int i=1;
		int min=1;
		while(i<a && i<b) {
			if(a%i==0 &&b%i==0)
				min=i;
				i++;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[][]= new int[n][];
		for (int i=0; i<n; i++) {
			for (int j=1; j<array[i][0]; j++) {
				array[i][j]= input.nextInt();
			}
		}
		int sum=0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<array[i][0]; j++) {
				for  (int k=j; k<array[i][0]; k++) {
					sum += gcd(array[i][j],array[i][k]);
				}
			}
			System.out.println(sum);
			sum =0;
		}
	}

}
// 오류가 나서 아직 진행중
