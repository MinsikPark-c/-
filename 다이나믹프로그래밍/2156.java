import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class g2156 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int [n];
		for (int i=0; i<n; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		if (n>=1) {
			dp[0]= arr[0];
		}
		if (n>=2) {
			dp[1]= arr[0] + arr[1];
		}
		if (n>=3) {
			dp[2] = Math.max(dp[1], Math.max(dp[0]+arr[2], arr[1]+ arr[2]));
		}
		for (int i=3; i<n; i++) {
			dp[i]= Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		}
		System.out.println(dp[n-1]);
	}

}// 드릅게 어려움 내가 거의 한게 없음 담주에 꼭보기
