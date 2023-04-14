package day03;

public class TernaryOperatorQuiz {
	
	public static void main(String[] args) {
		/* 
		 * random, 난수 발생 명령어 Math.random()은 호출 위치에
		 * 0보다는 크고 1보다는 작은 난수를 가져다둡니다.
		 * System.out.println(Math.random());
		 */
		//System.out.println((int)(Math.random() * 10)); 
		// 0.9563843397037025의 값을 정수로 바꾸려면??
		// System.out.println((Math.random() * 10));괄호넣는거 잊지말기!
		
		int randomNumber = (int)(Math.random() * 10);
		System.out.println(randomNumber);
		
		// 삼항연산자를 이용해서 난수로 얻은 값이
		// 7보다 크면 "당첨", 7이하면 "낙첨"이라는 문자를 result에 저장하게 하기.
		// 저장된 result는 콘솔창에 결과를 볼 수 있도록 출력하기
		
		String result = (randomNumber > 7 ? "당첨" : "낙첨");// 괄호 안넣어도 상관없음 그러나 괄호를 넣으면 가독성이 올라감.
		
		System.out.println(result);		
		
	}
}
