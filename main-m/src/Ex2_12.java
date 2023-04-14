
public class Ex2_12 {
	public static void main(String[] args) {
		String str = "3"; //문자열 3
		
		System.out.println(str.charAt(0) - '0'); //문자열 3을 숫자 3으로 변환
		//System.out.println("3".charAt(0) - '0');
		System.out.println('3' - '0' + 1);//문자3에서 숫자 3으로 변경
		//System.out.println(3 + 1);
		System.out.println(Integer.parseInt("3") + 1);
		System.out.println("3" + 1);
		System.out.println(3 + '0');//'0'은 숫자로 48

		System.out.println("---------------");
		System.out.println('3' - '0'); //3출력
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3") + 1);
		System.out.println("3" + 1);
		System.out.println((char)(3 + '0'));
	}
}
