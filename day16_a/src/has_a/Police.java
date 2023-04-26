package has_a;

public class Police {
	//멤버변수로 Gun을 가짐
	private Gun gun;
	private String name;
	private int height;
	
	public Police(Gun gun, String name, int height) {
		this.gun = gun;
		this.name = name;
		this.height = height;
	}
	
	public void shoot() {
		gun.shoot(); // 들고있던 총 격발
	}
	
	public void showStatus() {
		System.out.println("소유총기:"+gun);
		System.out.println("이름:"+name);
		System.out.println("키:"+height);
	}
}
