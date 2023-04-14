package day08;

public class BasketBallPlayerMain {

	public static void main(String[] args) {
		// 농구선수 2명 만들기
		// 하나는 덩크슛에 성공하도록
		// 하나는 실패하게 만들기
		BasketBallPlayer b1 = new BasketBallPlayer("김자바", 192, 30, 30000000);
		
		//b1.name = "김자바";
		//b1.height = 192;
		//b1.age = 30;
		//b1.salary = 30000000;
		
		BasketBallPlayer b2 = new BasketBallPlayer("박농구", 180, 25, 15000000);
		
		//b2.name = "박농구";
		//b2.height = 180;
		//b2.age = 25;
		//b2.salary = 15000000;
		
		b1.showInfo();
		b1.dunkShoot();
		b2.showInfo();	
		b2.dunkShoot();		
		
		//BaseballPlayer 관련 코드들을

		//파이썬튜터에서 돌릴 수 있게 고쳐서 보내고

		//실제로 돌려서 메모리 구조를 재확인하시오
	}

}
