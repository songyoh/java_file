package example.modi.member.pac1;

public class A {

	// 멤버변수 선언
	public int a;
	int b; // pac1 내부에서만 사용가능
	private int c; // class A 내부에서만 사용가능
	
	// 메서드 선언
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	//생성자 선언
	public A() {
		a = 1;
		b = 1;
		c = 1;
		
		method1();
		method2();
		method3();
	}
	
		
}
