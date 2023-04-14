
public class Ex2_5_constant {
	public static void main(String[] args) {
		final int MAX_SPEED = 10;
		final int MAX_VALUE; //정수형 상수MAX_VALUE 선언
		MAX_VALUE = 100;    // OK. 상수에 처음으로 값 저장
		//MAX_VALUE = 200; 에러. 상수에 저장된 값을 변경할 수 없음.
	}
}
