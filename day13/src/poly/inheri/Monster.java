package poly.inheri;

public class Monster {

	// 모든 몬스터 클래스의 부모로 설계
	private String name; // 온갖 타입을 다 받을 수 있는 다형성 특성상 몬스터 종류 식별용
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 부모쪽 생성자로 초기화할때 어떤 몬스터가 생성될지 사전에 알 수 없으므로
	// 고정값이 아닌 입력자료를 받아 처리해야 하기 때문
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}
	
	public void showMon() {
		System.out.println("아이디 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("=================");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	// 몬스터 사망여부 판단
	public boolean isInactive() { // 비활성화 상태입니까? 라는 뜻
		return this.hp > 0 ? false : true; //체력이 0보다 크면 false가 나오도록 
	}
	
	// 다음 공격에 몬스터가 죽는지 판단
	//public boolean isInactiveAfterNextAttack(Warrior warrior) { // 그 다음 공격시 비활성화 상태입니까?
		//return this.hp -warrior.getAtk() > 0 ? false : true; // 체력이 0보다 크면 false가 나오게..
	//}
	
	public boolean isInactiveAfterNextAttacked(int userAtk) {
		return this.hp - userAtk >= 0 ? true : false; // 체력이 0보다 작거나 0이어야 맞으면 true 아니면 false 
	}
	
	// setter는 거의 대부분인 경우 void 리턴자료형이다
	public void setAfterAttackedHp(int userAtk) { //공격 당한 직후의 hp상태
		//monster.setHp(monster.getHp() - (this.atk - monster.getDef())); 토대로 코드를 만들어보자
		//워리어 클래스에서 계산하는 방식이 맞지 않다 생각되고 몬스터에서 계산해서 전달하도록
		this.hp = this.hp - (userAtk - this.def);  
		
	}
	
	
	
}
