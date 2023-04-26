package api.lang.object;

public class ObjectInformation {
	
	/*
	 * toString 오버라이딩 후
	 * Sysout으로 객체변수 조회시
	 * 해당 인스턴스의 클래스 경로와
	 * 주소값대신
	 * toString이 리턴하는 값으로 
	 * 바뀌어 콘솔에 찍힙니다.
	 */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString(); // 기본값은 인스턴스의 소속과 주소값이 나오도록 설계되어있음.
		//return "ObjectInformation 객체 정보는 숨겨져 있습니다.";
		return "정보 은닉";
	}
	
}
