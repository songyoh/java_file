
public class BitOperator {

	public static void main(String[] args) {
		int num1=5;
		int num2=3;
		int num3=-1;
		
		System.out.println(num1 & num2);// 비트단위로 and 연산을 한다
		System.out.println(num1 | num2);// 비트단위로 or 연산을 한다
		System.out.println(num1 ^ num2);// 비트단위로 Xor 연산을 한다
		System.out.println(~num3);// 피연산자의 모든 비트를 반전시켜서 얻은 결과를 반환한다.
		
	}

}
