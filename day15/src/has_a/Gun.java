package has_a;

public class Gun {
	
	private int bullet; // 총알 개수
	private String modelName; // 총기 모델명
	private String gunNumber; // 총기 번호
	
	public Gun(String modelName, String gunNumber) {
		this.bullet = 5;
		this.modelName = modelName;
		this.gunNumber = gunNumber;
	}
	
	public void shoot() {// 발사 기능
		if(bullet > 0) {
			bullet--;
			System.out.println("총을 쐈습니다.");
		}else {
			System.out.println("총알을 모두 소진하였습니다.");
		}
	}
	
	public void reload() {// 재장전 기능
		this.bullet = 5;
	}
	
}
