package poly.noinheri;

public class MainClass3 {

	public static void main(String[] args) {
		// Rat도 2마리 만들어서
		Rat rat1 = new Rat();
		Rat rat2 = new Rat();
		
		Warrior w1 = new Warrior("자바몬");
		
		w1.showStatus();
		
		w1.huntRat(rat1);
		w1.huntRat(rat1);
		
		w1.showStatus();

	}

}
