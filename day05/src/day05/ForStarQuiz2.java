package day05;

import java.util.Scanner;

public class ForStarQuiz2 {
	
	// *****
	// ****
	// ***
	// **
	// *
	public static void main(String[] args) {
		// boj 2440
		// 역으로 5개부터 1개로 줄어드는 별찍기를 하려면
		// 바깥쪽 for문이 5부터 시작해서 1까지 도달하도록 해야 합니다.
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // scan.nextInt();에 입력한 값을 int정수 starTowerfloor별타워에 저장한다.
		scan.close();
		
		for(int i = N; i >= 1; i--) { // N에는 5가 들어와야함
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println(); // 줄바꿈 역할
		
		}
	}	
}
	