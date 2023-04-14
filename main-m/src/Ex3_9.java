
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		//long c = a * b; // -1454759936 결과값이 잘못 나온다.(오버플로우)
		long c = (long) a * b; // long c = 1000000L * 2000000L;
		
		System.out.println(c);

	}

}
