package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90)
			System.out.println("점수가 90보다 작습니다.");// 중괄호 없는 if문은 14번라인까지만 실행됨
			System.out.println("등급은 B입니다.");// if문과는 상관없는 실행문

	}

}
