package 방학2주차;

import java.util.Scanner;

public class g10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
