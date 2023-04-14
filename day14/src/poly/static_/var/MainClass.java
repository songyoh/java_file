package poly.static_.var;

public class MainClass {

	public static void main(String[] args) {
		// 인스턴스 생성 전부터 이미 조회 가능한 팀점수
		System.out.println(Asean.presentationScore);
		Asean.presentationScore = 50;
		
		// 학생 4명 만들어보기
		Asean a1 = new Asean("오송이", 20, 43);
		Asean a2 = new Asean("임축구", 20, 46);
		Asean a3 = new Asean("박농구", 20, 45);
		Asean a4 = new Asean("김자바", 14, 42);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
		
		// 어떤 시점에서건 팀 점수만 조회도 가능
		System.out.println(a1.presentationScore);

	}

}
