package poly.inheri;

/*
 * Magician class 생성
 * 이 클래스는 hunt뿐만 아니라 castFireball 이라는 메서드도 가집니다.
 * hunt는 그냥 단순 사냥이므로 warrior쪽과 동일하고
 * castfireball은 화염구를던지는 기술인데, 데미지는 그냥 공격력의 2배 입니다.
 * Magician의 자체 공격력은 2, 체력은 20, 방어력은 0 입니다.
 */

public class Magician {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Magician(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 2;
		this.def = 0;
		this.exp = 0;		
	}
	
	public void showMgic() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("=================");
	}
	
	public void hunt(Monster monster) {
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		if(monster.isInactiveAfterNextAttacked(this.atk)) {
			callUserAttackMonsterActive(monster);
		}else {
			monster.setAfterAttackedHp(this.atk);
			setHpAfterMonsterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}
	}
	
	public void CastFireBall(Monster monster) {
		if(monster.isInactive()) { 
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		if(monster.isInactiveAfterNextAttacked(this.atk)) {
			callUserAttackMonsterActive(monster);
		}else {
			monster.setAfterAttackedHp(this.atk);
			setHpAfterMonsterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}
			
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void gainMonsterExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	public void setHpAfterMonsterAttack(int monsterAtk) {
		if((monsterAtk > 0) && (monsterAtk - this.def) < 1) {
			this.hp -= 1;
		}else if(monsterAtk == 0) {
			return;
		}else {
			this.hp -= (monsterAtk - this.def);
		}
	}
	
	public void showMonsterAlreadyDeadMessage(String monsterName) {
		System.out.println("이 " + monsterName + "은(는) 이미 죽어 교전 불가합니다.");
	}
	
	public void showMonsterNowDeadMessage(String monsterName) {
		System.out.println(monsterName + "이(가) 죽었습니다.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println(monsterName + "이(가) 반격했습니다.");
	}
	
	public void callUserAttackMonsterActive(Monster monster) {
		monster.setAfterAttackedHp(this.atk);
		gainMonsterExp(monster.getExp());
		showMonsterNowDeadMessage(monster.getName());
	}
	
}
