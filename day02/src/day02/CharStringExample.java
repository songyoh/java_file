package day02;

public class CharStringExample {
	public static void main(String[] args) {
		// 단일 문자를 저장하는 데이터 타입 char(기본형 변수)
		char c1 = 'A';
		char c2 = 66;// 문자는 숫자와 교환 가능, ascii code상 65는A, 66은B,97은 소문자a
		/*
		 * 한글 '가'를 유니코드로 표현할때는 AC00인데
		 * 직접 코드값을 char에 저장할때는 탈출문자 \(역슬래시)u를 왼쪽에 붙입니다.
		 */
		char c3 = '\uAC00';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
			
		// 문자열을 저장할 수 있는 데이터 타입 string(참조형 변수)
		String s1 = "my dream";
		String s2 = "is a developer";
		System.out.println("--------------");
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
	
}
