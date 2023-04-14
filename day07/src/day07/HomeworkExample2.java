package day07;

public class HomeworkExample2 {

	public static void main(String[] args) {
		// 리스트 사용 방식
		// 메뉴 설정
		String[] menu = {"대창덮밥", "돈카츠", "도삭면", 
						"선지해장국", "수제비", "보쌈정식", "초밥", "샐러드"};
		
		// 난수 구하기
		int idx = (int)(Math.random() * menu.length); // menu.lengt-> 유지보수하기 좋다.
		
		System.out.println(menu[idx]);
		
	}

}
