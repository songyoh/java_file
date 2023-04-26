package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryTest {

	public static void main(String[] args) {
		/*
		 * 1. Lotto복권은 1~45범위의 숫자중 6개를 뽑아 추첨하는 복권입니다. 
		 *    List<Integer> 타입 변수에 구현체를 대입해주시고 해당 변수에 중복 없이 6개의 번호가 들어가도록 해 주세요.
		   2. 1번 과제를 마친 분들은 당첨될때까지 다시 번호를 무작위로 계속 뽑는 코드를 작성해서 몇 번 만에 로또복권이
		      당첨되는지 확인하는 시뮬레이션 코드를 만들어주세요.
		   hint : .equals()로 배열끼리 비교할 때는 배열 내부 요소의 순서와 자료 모두를 비교합니다
           ex) [1, 2, 3] 과 [1, 2, 3]은 true로 비교되지만 [1, 2, 3]과 [1, 3, 2]는 false로 비교됩니다.
		 */
		
		// 로또복권 번호를 적재할 컬렉션 생성 정수 int
		// 제네릭에는 int대신 Integer로 넣어야 함
		List<Integer> lottoWinNumbers = new ArrayList<>();
		
		// Random 클래스 생성해서 난수 발생
		Random rn = new Random();
		
		// 번호 6개가 중복없이 당첨되려면 몇 바퀴를 돌아야 하는지 모르므로 while문 사용
		while(lottoWinNumbers.size()<6) {
			// 1~45 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNumber = rn.nextInt(1,46);
			// 기존에 이미 뽑았던 숫자인지 확인한 후
			if(!lottoWinNumbers.contains(thisTimeGetNumber)) {
				// 없는 번호면 적재
				lottoWinNumbers.add(thisTimeGetNumber);
			}
		}
		// 번호 정렬
		Collections.sort(lottoWinNumbers);
		
		// 당첨 번호 체크
		System.out.println(lottoWinNumbers);
		
	}

}
