package poly2.noinheri;

public class Rat {
	private int hp;
	private int atk;
	private int def;
	
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

	// 해당 몬스터 사망여부 boolean으로 체크해주는 getter
	public boolean isRatActive() { // 활성화 상태인지
		return hp > 0 ? true : false;
	}
	
	// 공격 후 생사여부 확인
	public boolean isAttacktedRatActive(int userAtk) { // 공격당한 쥐가 활성화 상태인지
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	
	
}
