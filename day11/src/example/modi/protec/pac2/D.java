package example.modi.protec.pac2;

// import 패키지가 protec인지 확인!
import example.modi.protec.pac1.A;

public class D extends A {
	public D() {
		//A a = new A();
		//a.s = "hi";
		//a.method();
		
		/*
		 * protected는 패키지가 다를 경우
		 * 두 클래스 사이에 상속관계가 있다면
		 * super 키워드를 이용해 부모쪽 참조를 허용합니다.
		 */
		//부모쪽 객체 호출하고 싶을때 super키워드사용
		super(); // super() 생성자는 무조건 첫 줄에 위치해야함.
		super.s = "hi";
		super.method();
	}

}
