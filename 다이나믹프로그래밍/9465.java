import java.util.Scanner;

public class g9465 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int [][] arr;
		int[][] st;
		String str;
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();
			arr=new int[n+1][2];
			st= new int[n+1][2];
			for (int j=0; j<2; j++) {
				for (int k=1; k<n; k++) {
					arr[j][k]= sc.nextInt();
				}
			}
			st[1][0]= arr[1][0];
			st[1][1]= arr[1][1];
			for (int k=2; k<=n; k++) {
				st[k][0]= Math.max(st[k=1][1], st[k-2][1]+arr[k][0]);
				st[k][1]= Math.max(st[k-1][0], st[k-2][0]+arr[1][k]);
			}
			System.out.println(Math.max(st[n][0], st[n][1]));
		}
	}

}// 원리를 알면 풀만함 아직 어려움 나중에 
