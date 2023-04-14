package example.super_;

public class Airplane {
	
	public String planeCode; //비행기 편명, 코드
	public int speed;
	public int gas;
	
	// 속도 0, 연료 100으로 고정, 편명만 입력받는 생성자 정의
	public Airplane(String planeCode) { 
		this.gas = 100;
		this.planeCode = planeCode;
		this.speed = 0;
	}
	
	//최대 속도를 900으로 설정. 호출시 연료는 3차감, 속도 100씩 증가
	public void fly() {
		if(this.gas - 3 < 0) {
			System.out.println("연료 부족으로 가속 불가능.");
			return;
		}
		if(this.speed + 100 >= 900) {
			this.speed = 900;
			this.gas -= 3;
			return; // 연료량 0이 되는 순간 그 즉시 종료
		}
		this.speed += 100;
		this.gas -= 3;
	}	
	//계기판을 보는 메서드. 현재 비행기 상태를 콘솔에 찍게 작성.
	public void showStatus() {
		System.out.println("편명 : " + this.planeCode);
		System.out.println("속력 : " + this.speed);
		System.out.println("연료 : " + this.gas);
	}
}
