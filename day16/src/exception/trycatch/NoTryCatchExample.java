package exception.trycatch;

import java.util.Scanner;

public class NoTryCatchExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// 숫자 2개를 입력받아
		
		// 어떤 상태든 간에 예외가 발생하지 않게 하려면..
		int prevValue = scan.nextInt(); // 0으로 설정해도 상관없음
		int nextValue = scan.nextInt(); // 0이 들어오면 문제 발생
		// nextValue에 0만 안 들어오면 예외 발생 없음!
		
		if(nextValue !=0) {
			System.out.println(prevValue / nextValue); // 나눗셈을 하여라
		}else {
			System.out.println("0을 나누는 값으로 넣을 수 없습니다.");
		}
		
		
		scan.close();
		
		
	}
}
