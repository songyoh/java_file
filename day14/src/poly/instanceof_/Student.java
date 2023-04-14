package poly.instanceof_;

public class Student extends Human {

	// void 파라미터[human() 라는뜻 아무것도 (호출)에 요청하지 않은 것] 로 요청받지 않는 생성자만 정의해주세요.
	public Student(String name, int age) {
		//this.name = name; private은 같은 파일인 경우에만 입력가능
		//this.age = age;	같은파일이 아니므로 입력 불가	
		super(name, age); // super로 입력 가능
	}
		
}
