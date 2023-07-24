
public class SocialDistance {
	// 맨해튼거리 2
	// p와 p 사이의 맨해튼거리가 2 이상이면 안된다
	
	int[] answer = new int[places.length];
	
	for(int i = 0; i < answer.length; i++) {
		String[] place = places[i];
		char[][] room = new char[place.length][];
		for(int j = 0; j < room.length ; j++) {
			room[j] = place[j].toCharArray();
		}
	}
	
	
	private static final int dx[] = {0,0,-1,1};
	
	private static final int dy[] = {-1, 1, 0, 0};
	
	
	for(int d = 0; d < 4; d++) {
		int nx = x + dx[d];
		int ny = y + dy[d];
		if(ny < 0 || ny >= room.length || nx < 0 || nx > room[ny].length) continue;
	}
			
	private boolean isDistanced(char[][] room) {
		for(int y = 0 ; y < room.length; y++) {
			for(int x=0; x < room[y].length ; x++) {
				if(room[y][x] != 'P') continue;
			}
		}
		// 거리두기 검사
		
		
		
		
		retrun true;
	}
	
	
	private boolean isDistanced(char[][] room, int x, int y) {
		// room[y][x]가 거리두기를 지키는지 검사
		
		return true;
	}
	
	

	
	
}
