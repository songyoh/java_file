package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성
		
		for(int i=1; i<=5; i++) {// car 객체의 run() 메소드 5번 반복실행
			int problemLocation = car.run();
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");// 앞왼쪽 타이어가 펑크났을때 HankookTire로 교체
			car.frontLeftTire = new HankookTire("앞왼쪽", 15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.frontRightTire = new KumhoTire("앞오른쪽", 13);
			break;
		case 3:	
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.backLeftTire = new HankookTire("앞오른쪽", 13);
			break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			car.backRightTire = new KumhoTire("앞오른쪽", 13);
			break;
		}
		System.out.println("=============================");
		}

	}

}
