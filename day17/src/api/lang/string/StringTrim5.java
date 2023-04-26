package api.lang.string;

public class StringTrim5 {

	public static void main(String[] args) {
		// trim은 좌측, 우측에서 다른 단어가 나오기 직전까지
		// 공백을 전부 제거합니다.
		String trimBefore = "                공백을 만들어 보았읍니다.               ";
		System.err.println(trimBefore);
		String trimAfter = trimBefore.trim();
		System.out.println(trimAfter);
		

	}

}
