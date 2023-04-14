package day09;

public class GarbageCollectorTest {
		
	public int objectNum;// 객체 번호

	// 생성자(객체가 힙에서 생성되기 직전에 메서드)
	public GarbageCollectorTest(int number) {
		objectNum = number;	
		System.out.println(objectNum + "번 객체 생성");
	}
		
	// 소멸자(객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	@Override	//유지보수 측면에서 오탈자 여부를 확인하기위해 @Override를 작성해주는게 낫다.
	protected void finalize() throws Throwable { //메소드 오버라이딩
		System.out.println(objectNum + "번 객체가 힙에서 삭제됩니다.");
	}

}
