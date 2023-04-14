package poly.noinheri;

public class MainClass4 {

	public static void main(String[] args) {
		// huntpig, huntghost를 정의해서 MainClass4에서 둘 다 사냥해보기
		Pig pig = new Pig();
		Ghost ghost = new Ghost();
		
		Magician m1 = new Magician("옹몬");
		
		m1.showStatus();
		
		m1.huntPig(pig);
		
		m1.huntGhost(ghost);
		
		m1.showStatus();
	}

}
