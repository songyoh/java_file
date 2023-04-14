package day03;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		// 앞서 배운 배열과 연동해서 코드를 작성해보자.
		
		//String[] foods = {"음식"을 5가지 기입해 보세요.}
		String [] foods = {"수박", "딸기", "포도", "사과", "자몽"};
		
		// 0 ~ 4범위 난수를 얻도록 하자.
		int idx = (int)(Math.random() * 5);
		
		System.out.println(foods[idx]);
		switch(foods[idx]) {
		//  여러분들이 최애 3개 요리는 case에서 체크해서
		// "XX입니다." 라고 출력하게 해 주시고
		// 나머지 2개가 걸린 경우는 default문을 이용해 "기타과일입니다" 라고 출력해주세요.
		case "수박": 
			System.out.println("수박이 주문되었습니다");		
			break;// break라는 구문을 case의 마지막에 작성해야 코드가 흘러내리지 않습니다.
		case "딸기": 
			System.out.println("딸기가 주문되었습니다");		
			break;// break라는 구문을 case의 마지막에 작성해야 코드가 흘러내리지 않습니다.	
		case "포도": 
			System.out.println("포도가 주문되었습니다");		
			break;// break라는 구문을 case의 마지막에 작성해야 코드가 흘러내리지 않습니다.	
		default :
			System.out.println("기타 과일이 주문되었습니다");
		}
	}
	
}
