
public class CondOp {

	public static void main(String[] args) {
		int num1=50, num2=100;
		int big, diff;
		
		big = (num1>num2) ? num1 : num2; // ?기호의 왼편에 false가 등장하면 :기호 오른편의 숫자가 반환
		System.out.println(big);// (false)로 num2 반환
		
		diff = (num1>num2)? num1-num2 : num2-num1; // ?기호의 왼편에 false가 등장하면 :기호 오른편의 숫자가 반환
		System.out.println(diff);// (false)로 num2-num1 반환

	}

}
