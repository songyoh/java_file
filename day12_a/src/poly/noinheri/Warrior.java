package poly.noinheri;

public class Warrior {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 생성자
	// 필드 - 체력 20, 공격력 3, 방어력 1, 경험치 0으로 고정
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	// 캐릭터 상태가 조회 showStatus() 만들기
	// 이 메서드는 멤버변수정보를 콘솔에 실행하게함
	public void showStatus() {
		System.out.println("아이디: " +this.id);
		System.out.println("체력: " +this.hp);
		System.out.println("공격력: " +this.atk);
		System.out.println("방어력: " +this.def);
		System.out.println("획득 경험치: " +this.exp);
		System.out.println("==============");
	}
	
	// 사냥 메서드 
	public void huntRabbit(Rabbit rabbit) {
		// 1. 내가 공격한 토끼 체력 3 깎기
		rabbit.setHp(rabbit.getHp() - this.atk);
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
		}else {
		System.out.println("토끼를 공격했습니다.");
		}
	}
	
	public void huntRat() {
		this.hp -= 1;
		System.out.println("쥐를 사냥했습니다.");
		this.exp += 80;
	}
}
