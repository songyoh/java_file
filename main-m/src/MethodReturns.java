
public class MethodReturns {

	public static void main(String[] args) { //void : 이 메소드는 값을 반환하지(메소드를 호출한 영역으로 값을 전달하지)않는다.

		int result=adder(4, 5);
		System.out.println("4와 5의 합 : " + result);
		System.out.println("3.5의 제곱 : " + square(3.5));
		}
	public static int adder(int num1, int num2) { //adder 메소드는 int형 데이터를 반환합니다. 라는 뜻
		int addResult=num1+num2;
		return addResult;// addResult에 저장되어 있는 값을 반환한다.
		// int result = adder(4, 5); => int result = 9;
	}
	
	public static double square(double num ) { // square 메소드는 double형 데이터를 반환합니다. 라는 뜻
		return num*num;
	}

}
