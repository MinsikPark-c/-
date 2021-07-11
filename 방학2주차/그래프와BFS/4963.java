package 그래프와BFS;

import java.util.Scanner;

public class g4963 {
	static int w;
	static int h;
	static int[][]map;
	static boolean[][] check;
	static int number;
	static int []dx = {0,0,1,-1,-1,1,-1,1};
	static int []dy = {1,-1,0,0,-1,1,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			w=sc.nextInt();
			h=sc.nextInt();
			if (w==0 && h==0) break;
			map = new int[h][w];
			check = new boolean[h][w];
			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					map[i][j]= sc.nextInt();
				}
			}
			number=0;
			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					if(map[i][j]==1 && !check[i][j]) {
						mapping(i,j);
						number++;
					}
				}
			}
			System.out.println(number);
		}
	}
	public static void mapping(int x, int y) {  //이부분 나중에 다시보기
		check[x][y]= true;
		for (int i=0; i<8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && ny>=0 && nx<h && ny<w) {
				if (map[nx][ny]==1 && !check[nx][ny]) {
					mapping(nx, ny);
				}
			}
		}
	}
}
