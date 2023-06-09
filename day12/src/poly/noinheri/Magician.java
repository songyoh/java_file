package poly.noinheri;

public class Magician {
	
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Magician(String id) {
		this.id = id;
		this.hp = 1000;
		this.atk = 500;
		this.def = 300;
		this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("=================");
	}
	
	// 단독적으로 사냥을 하도록 메서드를 만듭니다.
		public void huntRabbit(Rabbit rabbit) {
			if(rabbit.getHp() <= 0) {
				System.out.println("이미 죽어서 공격할 수 없습니다.");
				return; // 이미 죽은 토끼는 아래 로직을 실행할 필요 없음.
			}
			// 1. 내가 공격한 Rabbit의 체력을 3 깎습니다.
			rabbit.setHp(rabbit.getHp() - this.atk);
			if(rabbit.getHp() <= 0) {
				System.out.println("토끼를 죽였습니다.");
				this.exp += 5;
			}else {
				System.out.println("토끼를 공격했습니다.");
			}
			
		}
		// huntRat을 개선해서, Rat 객체를 지정해 공격하도록 해 주세요.
		public void huntRat(Rat rat) {

			// 죽었는지 안죽었는지 검사
			if(!rat.isRatActive()) { //if(rat.getHp() <= 0) {에서 유지보수측면으로 더 쉽게 바꿈
				System.out.println("이 쥐는 죽은 쥐 입니다. 공격할 수 없습니다.");
				return;
			}
			// 안죽었다면 죽을지 먼저 검사
			// 내 공격을 받고 Rat이 죽었다면 경험치 올리고
			// 반격안받음
			if(!rat.isAttackedRatActive(atk)) {
				rat.setDamagedHp(atk);
				System.out.println("쥐를 죽였습니다."); 
				this.exp += 80;
			}else {
				// 공격받고도 안죽었으면 나도 반격당해서 rat.atk만큼 체력 차감
				// 쥐는 공격을 하므로 체력이 1 깎이도록 해보자.
				this.hp -= rat.getAtk();
				rat.setDamagedHp(atk);
				System.out.println("쥐를 공격하고, 반격받았습니다.");
			}
		}
		
		// pig몬스터, ghost몬스터 만들기 수치는 알아서
		// huntpig, huntghost를 정의해서 MainClass4에서 둘 다 사냥해보기
		// Magician을 유저클래스로 정의, Warrior처럼 동작하도록
		public void huntPig(Pig pig) {
			if(!pig.isPigActive()) { 
				System.out.println("이 몬스터는 죽은 몬스터 입니다. 공격할 수 없습니다.");
				return;
			}
			if(!pig.isAttackedPigActive(atk)) {
				pig.setDamagedHp(atk);
				System.out.println("꿀꿀몬을 죽였습니다."); 
				this.exp += 100;
			}else {
				this.hp -= pig.getAtk();
				pig.setDamagedHp(atk);
				System.out.println("꿀꿀몬을 공격하고, 반격받았습니다.");
			}
		}
		
		public void huntGhost(Ghost ghost) {

			if(!ghost.isGhostActive()) { 
				System.out.println("이 몬스터는 죽은 몬스터 입니다. 공격할 수 없습니다.");
				return;
			}
			if(!ghost.isAttackedGhostActive(atk)) {
				ghost.setDamagedHp(atk);
				System.out.println("유령몬을 죽였습니다."); 
				this.exp += 200;
			}else {
				this.hp -= ghost.getAtk();
				ghost.setDamagedHp(atk);
				System.out.println("유령몬을 공격하고, 반격받았습니다.");
			}
		}
		
		// 파이어볼 스킬로 공격하기
		public void fireball() {
			
		}
}

