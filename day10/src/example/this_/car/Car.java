package example.this_.car;

public class Car {

	public String model;
	public int speed;
	
	public Car(String m) {//생성자
		this.model = m; // 인스턴스(자기자신)에 붙을 수 있는 대명사 // 멤버변수를 지칭할때
		this.speed = 0; // 멤버변수를 지칭할때
	}
	
	public void accel() {
		if(this.speed + 10 >= 150) { //최대속도를 150으로 설정한것
			this.speed = 150;
		}else {
			this.speed += 10;
		}
	}
	
	public void showStatus() {
		System.out.println("모델명 : " + model);
		System.out.println("현재속도 : " + speed);
	}
}
