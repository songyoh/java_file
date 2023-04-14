package sec02.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		B1 b = new B1();
		C1 c = new C1();
		D1 d = new D1();
		E1 e = new E1();
		
		A1 a1 = b;
		A1 a2 = c;
		A1 a3 = d;
		A1 a4 = e;
		
		B1 b1 = d;
		C1 c1 = e;
		
		// 상속 관계에 있지 않기 때문에 컴파일 에러 발생
		//B b3 = e; 
		//C c2 = d;
	
	}
}
