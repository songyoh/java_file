package api.lang.string;

public class StringSubstring4 {

	public static void main(String[] args) {
		// 주민번호 양식
		String ssn = "920123-1329526";
		System.out.println(ssn);
		
		/*
		 * -subString() 메서드에 매개값으로 인덱스 1개 지정시
		 *  해당 인덱스부터 마지막 지점까지의 문자를 추출합니다.
		 */
		String last = ssn.substring(7);// 7~끝 지점 까지
		System.out.println(last);
		/*
		 * -subString() 메서드에 매개값으로 인덱스 2개 지정시
		 *  첫 번째 매개값 이상 두 번째 매개값 미만 범위 문자를 추출합니다.
		 */
		String first = ssn.substring(0, 6);//0~5
		System.out.println(first);

	}

}
