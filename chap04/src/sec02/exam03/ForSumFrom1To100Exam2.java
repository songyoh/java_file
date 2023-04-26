package sec02.exam03;

public class ForSumFrom1To100Exam2 {

	public static void main(String[] args) {
		int sum = 0;//합계변수
		
		int i = 0;//루프 카운터 변수
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~"+(i-1)+"합: "+sum);

	}

}
