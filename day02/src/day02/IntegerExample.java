package day02;

public class IntegerExample {

	public static void main(String[] args) {
		
		int maxInt = 2147483647; //최대값 
		// 01111111 111111111 111111111 11111111 비트표현시
		// 00000000	000000000 000000000 00001010 비트표현시
		// 1~~~~~~~ ~~~~~~~~~ ~~~~~~~~~ ~~~~~~~~ 음수로 실행됨
		// 이러한 현상을 오버플로우
		
		System.out.println(maxInt + 10);
		
		int minInt = -2147483648; // magicnumber 2,147,483,648
		// 최저에서 1을 빼면 최대값으로 바뀐다.
		
		System.out.println(minInt - 1);
	}
	
}
