
public class MethodExample {
	int sum(int a, int b) {
		return a + b; 
		//return은 메서드의 결과값을 돌려주는 명령어
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		MethodExample sample = new MethodExample();
		//작성한 클래스를 단독으로 실행시켜 테스트할 때
		int c = sample.sum(a, b);
		
		System.out.println(c);
	}
}
