package 브루트포스;

import java.util.Scanner;

public class g10972 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[]= new int [n];
		boolean check = true;
		for (int i=0; i<n; i++) {
			array[i]= input.nextInt();
		}
		int tmp;
		for (int i=n-1; i>0; i--) {
				if (array[i-1]<array[i]) {
					for (int j= n-1; j>=i; j--) {
						if (array[j] > array[i-1] ) {
				tmp= array[j];
				array[j]= array[i-1];
				array[i-1]= tmp;
				int k =n-1;
				while (i<k) {
					tmp= array[i];
					array[i]=array[k];
					array[k]=tmp;
					i++;
					k--;
				}
				check=false;
				break;
				}
			}
				}
		}
		if (check) {
			System.out.println(-1);
		}
		else {
			for (int i=0; i<n; i++) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
