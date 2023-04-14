package day07;

public class CatMain {
	
	// 고양이를 조회하는 용도로 사용할 전용 메서드를 작성해 보겠습니다.
	public static void showCatInfo(Cat cat) {
		System.out.println("고양이 이름 : " + cat.name);
		System.out.println("고양이 나이 : " + cat.age);
		System.out.println("고양이 품종 : " + cat.kind);
		System.out.println("고양이 털 색깔 : " + cat.color);
	}

	public static void main(String[] args) {
		// 고양이를 한마리 생성해보겠습니다.
		Cat c1 = new Cat();
		
		c1.name = "먼지";
		c1.kind = "샴";
		c1.color = "회색";
		c1.age = 3;
		
		Cat c2 = new Cat();
		
		c2.name = "봉지";
		c2.kind = "샴";
		c2.color = "흰색";
		c2.age = 2;
		
		Cat c3 = new Cat();
		
		c3.name = "휴지";
		c3.kind = "러시안블루";
		c3.color = "회색";
		c3.age = 2;

		//System.out.println(c1);
		//System.out.println("고양이 이름 : " + c1.name);
		//System.out.println("고양이 나이 : " + c1.age);
		//System.out.println("고양이 품종 : " + c1.kind);
		//System.out.println("고양이 털 색깔 : " + c1.color);
		
		showCatInfo(c1);
		System.out.println("===========");
		showCatInfo(c2);
		System.out.println("===========");
		showCatInfo(c3);
		System.out.println("===========");
		
		// c2, c3를 새롭게 생성
		// 이 고양이들도 showCatInfo로 조회할때 
		// 메모리 구조가 어떻게 전개될지 직접
		// 그려보기까지 해 주세요.
		// c1, c2, c3를 조회하는 각각의 순간을
		// 3장의 메모리 구조 그림 보내기

	}

}
