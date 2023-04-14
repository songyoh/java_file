package day03;

public class IfExample1 {
	
	public static void main(String[] args) {
		// 0~100까지의 int 난수를 score 변수에 저장해보자.
		// 아래 문장에 Math.random() * 101을 괄호로 감싸는것과 안감싸는것의 차이가 있습니다.
		// 원인이 무엇인지 직접 도출해보자. - 숙제
		int score = (int)(Math.random() * 101);
		System.out.println(score);
		
		// if문을 작성해보겠습니다.
		// if(조건식){
		//     실행문구들.......; - 가독성을 위해 칸추가하여 입력
		// }
		
		if(score >= 60) {  
			System.out.println(score);
			System.out.println("합격을 축하드립니다.");	
		} else {
			System.out.println(score);
			System.out.println("아쉽지만 불합격입니다.");
		}
	}
	
}
