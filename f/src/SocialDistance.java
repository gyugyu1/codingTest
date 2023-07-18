
public class SocialDistance {
	// 맨해튼거리 2
	// p와 p 사이의 맨해튼거리가 2 이상이면 안된다
	
	int[] answer = new int[places.length];
	
	for(int i =0; i <answer.length ; i++) {
		String[] place = places[i];
		char[][] room = new char[place.length][];
		
		for(int j = 0; j <room.length ; j++) {
			room[j] = place[j].toCharArray();
		}
	}
			
	
}
