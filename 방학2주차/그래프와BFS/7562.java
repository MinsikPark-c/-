package 그래프와BFS;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class g7562 {
	static int n;
	static int [][]map;
	static boolean [][] check;
	static int[] dx = {2,2,1,1,-1,-1,-2,-2};
	static int[] dy = {-1,1,2,-2,2,-2,1,-1};
	static int sx, sy, ex, ey;
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		for (int i=0; i<c; i++) {
			n = input.nextInt();
			map = new int[n][n];
			check = new boolean[n][n];
			sx = input.nextInt();
			sy = input.nextInt();
			ex = input.nextInt();
			ey = input.nextInt();
			Point start = new Point(sx, sy);
			Point end = new Point(ex, ey);
			bfs (start, end, map);
		}
	}
	private static void bfs(Point start, Point end, int[][]map) {
		Queue<Point>queue= new LinkedList<Point>();
		queue.add(start);
		check[sx][sy]= true;
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			if(p.y==ey && p.x==ex) {
				System.out.println(map[p.x][p.y]);
				return;
			}
			for (int i=0; i<8; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(nx>=0 && ny>=0 && nx<n && ny<n) {
					if (!check[nx][ny]) {
						check[nx][ny]= true;
						map[nx][ny]= map[p.x][p.y] + 1;
						queue.add(new Point(nx,ny));
					}
				}
			}
		}
		
	}
}
