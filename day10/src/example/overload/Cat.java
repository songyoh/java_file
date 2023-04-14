package example.overload;

public class Cat {
	public String name;
	public String kind;
	
	
	public Cat() { //void 생성자 : 파라미터에 입력된 자료가 없는경우
		name = "이름이 없습니다.";
		kind = "품종이 미확인되었습니다.";
	}
	
	public Cat(String n, String k) { // String, String 생성자
		name = n;
		kind = k;
		System.out.println("지금부터 이 아이의 이름은 " + n + " 입니다.");
	}
	
	public void call() { //void 파라미터 메서드
		System.out.println("야옹아 이리와~");
	}
	
	public void call(String name) {
		System.out.println(name + "아 이리와~");
	}
	
	
}
