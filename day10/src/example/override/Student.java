package example.override;

public class Student extends Human {
	
	public String major;
	
	@Override // 오버라이드 된 메소드라 표기(어노테이션이라 불림) // 유지보수측에서 굉장히 중요
	public void 자기소개하기() {// 선언부 부분은 첫줄 내용이 같도록 한다(오버라이딩) // 재정의
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
	}
	

}
