package example.override;

public class Programer extends Human {
	
	public String devLang; //개발 언어
	public int jobyear; // 기간
	
	@Override
	public void 코딩하기() {
		System.out.println(devLang + "언어를 이용해 코딩을 합니다.");
	}
	
	@Override
	public void 자기소개하기() {// 선언부 부분은 첫줄 내용이 같도록 한다(오버라이딩) // 재정의
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println(devLang + " " + jobyear + "년차 개발자 입니다.");
	}
}
