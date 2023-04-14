package day08;

public class Cat { 
	//파이썬 튜터 작성시 public 'static' class Cat {으로 'static' 추가하여 실행
	
	public String name;  // 고양이 이름
	public int age; // 고양이 나이
	public String kind; // 고양이 품종
	public String color; //고양이 털색깔
	
	public Cat(String n, int a, String k, String c) {
		name = n;
		age = a;
		kind = k;
		color = c;
	}
	
	// 설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않습니다.
	public void showCatInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(kind);
		System.out.println(color);
	}
	
}
