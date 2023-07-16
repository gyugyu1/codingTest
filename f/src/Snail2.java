public class Snail2 {
	private static final int[] dx = { 0, -1, 1 };
	private static final int[] dy = { 1, 0, 0 }; //움직이는 변화량

	public int[] solution(int n) {
		
		int[][] triangle = new int[n][n];
		int v = 1;
		int x = 0;
		int y = 0;
		int d = 0; // 방향

		while (true) {
			triangle[y][x] = v++;
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] !=0) { // 더이상 갈수 없을 경우
				d = (d+1) % 3; // 방향전환
				nx = x + dx[d];
				ny = y + dy[d];
				
				if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] !=0) break; // 방향을 바꿧는데 더이상 갈 수 없는 경우 
			}
			
			x = nx; // 진행할수 있는 방향 위치가 들어있음
			y = ny;

		}
		
		int[] result = new int[v-1];
		int index =0;
		for (int i = 0; i < n ; i++) {
			for (int j = 0 ; j <= i; j++) {
				result[index++] = triangle[i][j];
			}
		}
			return result;
				
	}
}

