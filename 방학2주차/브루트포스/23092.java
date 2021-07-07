package 방학2주차;

import java.util.Arrays;
import java.util.Scanner;

public class g2309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int array[]= new int [9];
		int sum =0;
		boolean check = false;
		for (int i=0; i<9; i++) {
			array[i]= input.nextInt();
			sum +=array[i];
		}
		for (int i=0; i<9;i++) {
			if(check) break;
			for (int j=i+1; j<9; j++) {
				if (array[i]+array[j]==sum-100) {
					array[i]=0;
					array[j]=0;
					check=true;
					break;
				}
			}
		}
		Arrays.sort(array);
		for(int i=2; i<9; i++) {
			System.out.println(array[i]);
		}
	}

}
