package sec02.exam03;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);// 자동차는 4개의 타이어를 가졌고
	Tire frontRightTire = new Tire("앞오른쪽", 2);// 숫자는 남은 수명을 나타냄
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; }// 모든 타이어를 1회 회전시키기 위해
		if(frontRightTire.roll()==false) { stop(); return 2; }// 각 Tire 객체의 roll()메소드를 호출
		if(backLeftTire.roll()==false) { stop(); return 3; }// false를 리턴하는 roll()이 있을경우
		if(backRightTire.roll()==false) { stop(); return 4; }// Stop() 메소드를 호출하고 해당 타이어 번호를 리턴
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]"); // 펑크났을때 실행
	}
}
