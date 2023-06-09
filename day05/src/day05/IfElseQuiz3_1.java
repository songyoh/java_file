package day05;

import java.util.Scanner;

public class IfElseQuiz3_1 {
	
	//      *
	//     **
	//    ***
	//   ****
	//  *****
	public static void main(String[] args) {
		
			// 중첩 반복문을 사용해야함
			// 바깥쪽 반복문은 세로 길이를 나타냅니다.
			// 안쪽 반복문은 별의 개수인데 점점 늘어나는 변수를 이용해(반복문에 점점 증가하는 요소가 있음)
			// 줄이 바뀔때마다 별 개수가 늘어나게 처리하라.
		
			// 추가 요구사항 : 사용자에게 스캐너로 층수를 입력받게 고쳐주세요.
			// 추가 요구사항 : for문을 if문으로 바꿔보세요. 
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); 
		scan.close();
		
		int i = 1;
		while(i <= N) { 
			
			int j = 1;
			while(j <= N - i) { 
				System.out.print(" ");
				j++;
			}
			
			int k = 1;
			while(k <= i) { 
				System.out.print("*");	
				k++;
			}
			System.out.println();
			i++;
		}
	}
	
}	


	
			

