package poly2.noinheri;

public class Warrior {

	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("====================");
	}
	
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return;// 이미 죽은 토끼는 아래 로직을 실행할 필요 없음
		}
		// 1. rabbit 체력 3 깎기
		rabbit.setHp(rabbit.getHp() - this.atk); // rabbit의 현재체력을 갖고온뒤(rabbit.getHp()) 워리어의 공격력[this.atk]만큼 빼준걸로 새로// [rabbit.setHp] hp값을 세팅한다.
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
		}else {
		System.out.println("토끼를 공격했습니다.");
		}
	}
	
	//huntRat 개선, RAT 객체 지정해 공격하도록 해보기
	public void huntRat(Rat rat) {
		if(!rat.isRatActive()) {
			System.out.println("이 쥐는 죽은 쥐 입니다. 공격할 수 없습니다.");
			return;
		}
		if(!rat.isAttacktedRatActive(atk)) { // !살아있다면 true -> !:논리 반전연산자가 붙어있으므로 true->false, false->true로 나오게 설정
			rat.setDamagedHp(atk);
			System.out.println("쥐를 죽였습니다.");
			this.exp += 80;
		}else {
			rat.setHp(rat.getHp() - atk);
			this.hp -= rat.getAtk(); // rat의 공격력 만큼 차감하도록
			System.out.println("쥐를 공격하고, 반격받았습니다.");
		}
		
	}
	
}
