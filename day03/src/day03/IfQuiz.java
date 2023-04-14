package day03;

public class IfQuiz {

	public static void main(String[] args) {
		
		/*
		 *  정수를 입력했을때 음수라면 "음수입니다", 양수라면 "양수입니다"
		 *  0이라면 "0입니다" 라고 출력하는 구문을 만들기.
		 *  단, 양수인 경우는 짝수와 홀수를 구분해서
		 *  짝수라면, "짝수입니다", 홀수라면 "홀수입니다"
		 *  라고 출력하도록 구분해라.(힌트:나머지(%) 연산자를 사용해 구별할 수 있습니다.)
		 *  (힌트2:if문 내부에 if를 추가로 작성할 수 있습니다.)
		 *  (힌트3 : 짝수는 2의 배수)
		 */
		int number = (int) (Math.random() * 101);
		System.out.println(number);
		
		/*
		if (number > 0) {
            System.out.println("양수입니다.");
        } else if (number < 0) {
            System.out.println("음수입니다.");
        } else if (number > 0 && (number % 2 == 0)) {
        	System.out.println("짝수 양수입니다.");
        } else if (number > 0 && (number % 2 !=0)) {
        	System.out.println("홀수 양수입니다.");
		}	else {
            System.out.println("0입니다.");
        }*/
		
		if(number < 0) {
			System.out.println("음수입니다");
		} else if(number == 0) {
			System.out.println("0입니다");
		} else {
			if(number % 2 == 0) {
				System.out.println("짝수 양수입니다");
			} else if(number % 2 != 0) {
				System.out.println("홀수 양수입니다");
			}
		}	
	}
}
