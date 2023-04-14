package example.modi.cls.pack2;

import example.modi.cls.pack1.B; //example.modi.cls.pack1(클래스경로).B(패키지)
//import example.modi.cls.pack1.A; // 억지로 적어도 인식 안됨

public class C {

	// 클래스 B는 public 클래스이므로 패키지가 달라도 생성 가능
	// 패키지가 다른 경우, 무조건 import 구문이 선언되어야 사용 가능
	B b = new B();
	
	// 클래스 A는 default 접근제한자를 적용받아 패키지가 다르면 호출 불가능
	//A a = new A();
}
