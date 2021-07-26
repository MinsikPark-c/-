import java.util.Scanner;

public class g1929 {
	public static boolean[] num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		num = new boolean[n+1];
		getNum();
		for (int i =m; i<=n; i++) {
			if(!num[i])
				System.out.println(i);
		}
	}
	public static void getNum() {
		num[1]= true;
		for (int i=2; i<num.length; i++) {
			for (int j=2; i*j<num.length; j++) {
				num[i*j]=true;
			}
		}
	}
}
