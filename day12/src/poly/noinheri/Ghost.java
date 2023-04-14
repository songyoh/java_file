package poly.noinheri;

public class Ghost {

	private int hp;
	private int atk;
	private int def;
	
	public Ghost() {
		this.hp = 30;
		this.atk = 10;
		this.def = 5;
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

	public boolean isGhostActive() {// 유지보수가 좀 더 편해진다
		return hp > 0 ? true : false;
	}
	
	// 공격받은뒤에 살아있는지 죽었는지 체크
	public boolean isAttackedGhostActive(int userAtk) { 
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	
}
