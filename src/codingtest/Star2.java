package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Star2 {
	private static class Point {
		public final long x, y;
		
		private Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}
		
	
	private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
		// ������ ���Ͽ� �� �κ��� ǥ���ϱ� -> ��� ���� ���� ������ ���Ͽ� ����
	double x = (double) (b1 * c2 - c1 * b2) / (a1 * b2 - b1 * a1);
	double y = (double) (c1 * a2 - a1 * c2) / (a1 * b2 - b1 * a1);
	
	if( x % 1 != 0 || y % 1 != 0) return null;
	
		return new Point((long) x, (long) y);
	}
	
	
	private Point min(List<Point> points) {
		long x = Long.MAX_VALUE;
		long y = Long.MAX_VALUE;
		
		for(Point a : points) {
			if(a.x < x) x = a.x;
			if(a.y < y) y = a.y;
		}
		return new Point(x,y);
	}
	
	private Point max(List<Point> points) {
		long x = Long.MIN_VALUE;
		long y = Long.MIN_VALUE;
		
		for(Point a : points) {
			if(a.x > x) x = a.x;
			if(a.y > y) y = a.y;
		}
		return new Point(x,y);
	}
	
	public String[] solution(int[][] line) {
		// �ּҰ� �ִ� ������ ��ǥ�� ũ�⸦ ���ϱ� x�� ����, y�� ���� �ִ밪 - �ּڰ�,
		List<Point> points = new ArrayList<>();
		
		for(int i = 0 ; i < line.length ; i++) {
			for(int j = i + 1 ; j < line.length ; j++) {
				Point pt = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
				
				if(pt != null) {
					points.add(pt);
				}
			}
		}
		
		Point minP = min(points);
		
		Point maxP = max(points);
		
		
		int lengX = (int) (maxP.x - minP.x + 1);
		int lengY = (int) (maxP.y - minP.y + 1);
		
		
		char[][] arr = new char[lengY][lengX];
		
		for(char[] row : arr) {
			Arrays.fill(row, '.');
		}
		
		
		for(Point p : points) {
			int x = (int)(p.x - minP.x);
			int y = (int)(maxP.y - p.y);
			
			arr[y][x] = '*';
		}
		
		String [] result = new String[arr.length];
		
		for(int i = 0 ; i < result.length ; i++) {
			result[i] = new String(arr[i]);
		}
		
		return result;
			// �ִ� �ּڰ����� ��ǥ��� ũ�⸦ ���ϱ�
	}
	

	
}
