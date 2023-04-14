package day08;

public class BasketBallPlayer {
	public String name; // 농구선수의 이름
	public int height;// 키
	public int age;// 나이
	public int salary;// 연봉
	
	//showInfo를 만들어보자.
	// 호출시 위 4가지 요소를 콘솔에 찍어줍니다.
	
	public BasketBallPlayer(String nM, int hG, int aG, int sL) { //메소드
		name = nM;
		height = hG;
		age = aG;
		salary = sL;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(salary);
	}
	
	public void dunkShoot() { // 덩크슛하기 기능
		if(height > 190) { 
			System.out.println("덩크슛 성공!");
		}else {
			System.out.println("Miss!");
		}
	}
}
