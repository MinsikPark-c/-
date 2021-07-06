package 방학2주차;

import java.util.Scanner;

public class g2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int i=1;
		int min=1;
		int max;
		while(i<a && i<b) {
			if(a%i==0 &&b%i==0)
				min=i;
				i++;
		}
		max = a*b/min;
		System.out.println(min);
		System.out.println(max);
	}

}
