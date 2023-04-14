package day06;

public class ContinueExample1 {

	public static void main(String[] args) {
		// 짝수만 출력하는 coutinue 예시
		for(int i = 1; i < 11; i++) {// 1~10까지
			// i % 2 != 0은 홀수인 경우
			// i % 2 == 0은 짝수인 경우
			if(i % 2 != 0)
				// 해당 바퀴를 스킵하고 시작지점으로 즉시 이동.
				continue; 
			System.out.println(i);
		}// for문 닫는지점

	}

}
