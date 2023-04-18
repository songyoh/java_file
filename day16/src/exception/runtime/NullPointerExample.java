package exception.runtime;

public class NullPointerExample {

	public static void main(String[] args) { //예외가 발생한 케이스
		
		String str = null;
		//str = "Hello";
		
		// toLowerCase는 모든 문자열을 소문자로 만들어줍니다.
		System.out.println("실행됩니다.");
		System.out.println(str.toLowerCase());
		System.out.println("예외 특) 발생한 지점에서 멈춤");

	}

}
