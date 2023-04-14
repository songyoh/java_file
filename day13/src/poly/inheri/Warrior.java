package poly.inheri;

public class Warrior {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) { //생성자 
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
		System.out.println("=================");
	}
		
		// 파라미터로 모든 부모인 Monster를 선언하면
		// 다향성 원리에 의해 상속받은 모든 몬스터가 대입 가능합니다.
	public void hunt(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		//if(monster.getHp() <= 0) {// 몬스터 생사여부 판단을 워리어가 판단하는 수식(몬스터의 체력HP이 0보다 작거나 같은지)
		//System.out.println("이 " + monster.getName() + "은(는) 이미 죽어서 교전이 불가합니다.");	
		if(monster.isInactive()) { 
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		if(monster.isInactiveAfterNextAttacked(this.atk)) { //user 공격력을 입력받아야 경험치확인이 가
			// 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여//체력을 집어넣어보자
			//monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
			//System.out.println(monster.getName() + "이(가) 죽었습니다.");
			//this.exp += monster.getExp();
			/*monster.setAfterAttackedHp(this.atk);
			showMonsterNowDeadMessage(monster.getName());
			gainMonsterExp(monster.getExp());*/
			callUserAttackMonsterActive(monster);
		}else { // 몬스터가 다음공격에 죽지 않으면 반격해 플레이어 체력 차감
			//monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
			//this.hp -= monster.getAtk();
			//System.out.println(monster.getName() + "이(가) 반격했습니다.");
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
		
	// 그냥 warrior  내부에서 적어도 되지만 코드 흐름을
	// 메서드 호출로만 제어하기 위해 분리.
	public void gainMonsterExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	// 상단 warrior 체력을 차감하는 로직을 메서드로 분리 및 재정의
	// 상대공격력이 1이상인 경우 워리어가 받는 최소 데미지가 1이 되고(1로 고정)
	// 공격력이 0인 몬스터의 공격을 받아도 데미지를 받지는 않으면서 체력이 차지 않도록 로직 고치기
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
		System.out.println("이 " + monsterName + "은(는) 이미 죽어서 교전이 불가합니다.");
	}
	
	public void showMonsterNowDeadMessage(String monsterName) {
		System.out.println(monsterName + "이(가) 죽었습니다.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println(monsterName + "이(가) 반격했습니다."); 
	}
	
	// 플레이어의 공격을 받은 몬스터가 살아있을때 실행하는 3줄의 로직을 1줄로 묶기.
	public void callUserAttackMonsterActive(Monster monster) {
		monster.setAfterAttackedHp(this.atk);
		gainMonsterExp(monster.getExp());// 체력은 깎고, 경험치는 쌓이고
		showMonsterNowDeadMessage(monster.getName());
	}
	
	
	
}
