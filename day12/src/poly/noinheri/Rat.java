package poly.noinheri;

public class Rat {
	// 필드 : hp, atk, def
	private int hp;
	private int atk;
	private int def;
	
	// 체력 5, 공격력 1, 방어력 0으로 설정
	public Rat() {
		this.hp = 5;
		this.atk = 1;
		this.def = 0;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	// 해당 몬스터 사망 여부를 boolean으로 체크해주는 getter를 만들어보자
	// boolean으로 시작하는 public에는 'is'를 붙여준다
	public boolean isRatActive() {// 유지보수가 좀 더 편해진다
		return hp > 0 ? true : false;
	}
	
	// 공격받은뒤에 살아있는지 죽었는지 체크
	public boolean isAttackedRatActive(int userAtk) { //공격받은 쥐가 활성화 상태여부 확인
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);// 쥐가 죽었는지 안죽었는지는 쥐가 판단 하도록 해서 결과값만 받도록
	}
	
}
