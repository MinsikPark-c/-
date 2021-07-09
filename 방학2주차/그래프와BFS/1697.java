package 그래프와BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class g1697 {
	static int m;
	static int[] check = new int [100001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		m = input.nextInt();
		if (n==m) {
			System.out.println(0);
		}
		else bfs(n);
		long end = System.currentTimeMillis();
		System.out.println((end-start));
	}
	static void bfs (int a) {
		Queue<Integer> q = new LinkedList<> ();
		q.add(a);
		check[a]=1;
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for (int i=0; i<3; i++) {
				int next;
				if(i==0)  next = tmp -1;
				else if (i==1) next = tmp+1;
				else next = tmp*2;
			if (next == m) {
				System.out.println(check[tmp]);
				return;
			}
			if (next >=0 && check[next]==0) {
				q.add(next);
				check[next]=check[tmp] +1; 
			}
		}
	}
}
}
