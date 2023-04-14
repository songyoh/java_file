package day05;

public class ForStarQuiz4 {

	public static void main(String[] args) {
		/*
		 * 중첩반복문을 이용해서
		 * 4x + 5y = 60
		 * 이 방정식의 양수 해를 모두 구하는 반복문을 작성해주세요. 
		 */
		 for (int x = 1; x <= 15; x++) { // x는 1부터 15까지의 값을 가질 수 있음
	            for (int y = 1; y <= 12; y++) { // y는 1부터 12까지의 값을 가질 수 있음
	                if ((4 * x) + (5 * y) == 60) { // 4x + 5y = 60인 경우 출력
	                    System.out.println("x: " + x + ", y: " + y);
	                }
	            }
		 }
	}

}
