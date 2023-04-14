package example.override;

public class OverrideExample {

	public static void main(String[] args) {
		// student class의 인스턴스를 생성해주세요.
		
		Student s1 = new Student();
		
		s1.name = "김자바";
		s1.age = 21;
		s1.major = "컴퓨터과학";
		
		s1.자기소개하기(); //Override
		s1.코딩하기();
		
		System.out.println("===========");
		
		Programer p1 = new Programer();
		
		p1.name = "김농구";
		p1.age = 39;
		p1.devLang = "java";
		p1.jobyear = 1;	
		
		p1.자기소개하기();
		p1.코딩하기();
	}

}
