package day06;

/*
 * 1. 메서드 정의(선언)가 이루어져야 추후 호출할 수 있습니다.
 * 2. 메서드의 선언은 메서드 내부에서 할 수 없습니다.
 * 	  클래스 내부이면서 다른 메서드 외부에 작성해야 합니다.
 * 3. 메서드 내부에서는 다른 메서드의 호출만 가능합니다.
 * 4. 호출하는 과정중 다른 메서드 내부 지역으로 이동해서 해당 코드를 실행하고
 *    타 메서드 호출이 끝나면 원래 호출했던 그 위치로 복귀합니다.
 */

public class MethodExample1 {
	
	// 메인 메서드와 함께 존재하는 메서드는 static을 붙여서 생성해야 합니다.
	public static void sayHello() {
		System.out.println("안녕하세요! sayHello 메서드를 호출하셨네요!");
		System.out.println("다음에 또 호출해주세요.");
	}
	
	public static int calcSum(int x) { // static 영역에 저장하겠다
		int sum = 0;
		for(int i = 1; i <= x; i++) { //변수 i에 초기값 1을 할당하고, 조건문으로 i가 x보다 작거나 같을 때까지 반복하도록 합니다. 그리고 i++은 반복문이 실행될 때마다 i를 1씩 증가시키는 증감식입니다.
			//위의 for문은 i가 1부터 x까지 1씩 증가하면서 반복하는 것을 의미
			sum += i;
		}
		return sum;
	}
	
	public static int totalSum(int a, int b) { // static 영역에 저장하겠다
		return a + b;
	}

	public static void main(String[] args) { // static 영역에 저장하겠다
		// 단독 메서드 호출 구문은 아래와 같이 이탤릭체로 표시됩니다.
		sayHello();
		// 리턴구문은 콘솔창에 출력되는것을 보장하지 않습니다.
		// calcSum(10);//55
		System.out.println(calcSum(10));//55 //calSum지역이 사라지면서 x와 sum지역도 사라짐.
		// calcSum(10) 1+2+3+4+5+6+7+8+9+10 1~10까지 더한 값을 나타냄
		
		totalSum(1, 2);

	}

}
