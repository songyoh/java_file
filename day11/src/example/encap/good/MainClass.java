package example.encap.good;

public class MainClass {

	public static void main(String[] args) {
		// 은닉에 성공한 좋은 케이스
		MyBirthday mb = new MyBirthday(2025, 16, 99);
		//MyBirthday mb = new MyBirthday(1990, 01, 23); 조회됨

		//접근제한자 private이므로 직접수정 불가
		//mb.day = 1026; 파일이 다르기때문에 허용불가
		//mb.month = 96;
		//mb.year = 9999;
		
		mb.showDateInfo();
		
		//System.out.println(mb.Day()); Day만 불러올 경우 MyBirthday에서 private화 되어있기때문에 실행불가
		System.out.println(mb.getDay()); //값변경없이 조회만 하고싶을때
		//mb.setDay(1);
	}

}
