package day03;

public class BitOperatorExample {
	
	public static void main(String[] args) {
		byte a = 5; // 00000101
		byte b = 3; // 00000011
		
		// 비트곱(and, &) 두 비트가 1일때 1, 나머지 0, 곱셈
		System.out.println(a & b);
		
		// 비트합(or, |) 두비트 중 하나이상이 1이면 1, 두비트 모두 0이면 0,합
		System.out.println(a | b);
		
		// 배타적 논리합(xor) 두 비트가 다르면1, 같으면 0
		System.out.println(a ^ b);
		
		// 비트 이동 연산자(<<, >>)
		System.out.println(a << 4);// 00000101 -> 01010000
		byte c = 48;   // 00110000
		System.out.println(c >> 3);
		
	}
	
}
