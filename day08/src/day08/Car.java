package day08;

public class Car {

	public String modelName; // 차종 //멤버변수로 만들어진 modelName
	public int maxPassengers; // 최대승객수
	public int currentSpeed; //속도
	public String owner; //차주
	public int gas; //연료량
	
	// 상수 선언은 final static으로 선언하면 됩니다.
	public final static int BOOST_SPEED = 10; //한 번 밟으면 10씩 속도가 올라간다는 설정
	public final static int BREAK_SPEED = 10; //한 번 밟으면 10씩 감속하는 설정
	
	// 생성자 들어갈 자리
	public Car(String mN, int mP, int cS, String own, int g) { //메소드
		modelName = mN;     //지역변수로 만들어진 mN
		maxPassengers = mP;
		currentSpeed = cS;
		owner = own;
		gas = g;
	}
	
	// 가속기능
	public void accelerate() { //accelerate 동사형으로 만들기
		currentSpeed += BOOST_SPEED;
	}
	
	// 감속기능
	public void break_() {
		currentSpeed -= BREAK_SPEED;
	}
	
	// 계기판 조회
	public void showStatus() {
		System.out.println("차종 : " + modelName);
		System.out.println("최대승객수 : " + maxPassengers);
		System.out.println("현재속도 : " + currentSpeed);
		System.out.println("차주 : " + owner);
		System.out.println("연료량 : " + gas);
	}
}
