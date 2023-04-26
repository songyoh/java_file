package poly.noinheri;

public class MainClass2 {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit();
		Rabbit r2 = new Rabbit();
		
		Warrior w1 = new Warrior("자바몬");
		w1.showStatus();
		
		w1.huntRabbit(r2);
		
		w1.showStatus();

	}

}
