package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		int pasta = 0;
		int juice = 0;
		double result = 0;
		int tmp = 0;
		
		for (int i = 0; i < 5; i++) {
			
			num[i] = sc.nextInt();
			
		}
		
		pasta = Arrays.stream(num).max().getAsInt();
		

		for(int i = 0 ; i < 4 ; i++) {

		 	pasta = (i < 3 && num[i] <= pasta ? num[i] : pasta); 
			
			juice = (i==3 && num[3] <= num[4])? num[3] : num[4];

		}
		
		result = (pasta + juice) + ((pasta + juice) * 0.1);
	
		System.out.println(result);

	}
}
