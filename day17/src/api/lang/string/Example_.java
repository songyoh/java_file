package api.lang.string;

import java.util.Scanner;

public class Example_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("문장을 입력하세요:");
		String sentence = scanner.nextLine();

		System.out.println("찾을 단어를 입력하세요:");
		String word = scanner.nextLine();

		int count = 0; // 단어가 나타난 횟수
		int index = -1; // 단어가 나타난 인덱스
		int lastIndex = 0; // 마지막으로 검색된 인덱스
		while (true) {
		index = sentence.indexOf(word, lastIndex); // 단어를 검색합니다.
		if (index == -1) { // 단어가 더이상 나타나지 않으면 종료합니다.
		break;
		}
		count++; // 단어가 나타난 횟수를 증가시킵니다.
		lastIndex = index + word.length(); // 마지막으로 검색된 인덱스를 변경합니다.
		System.out.printf("'%s'은(는) %d번째 인덱스에 있습니다.\n", word, index);
		}

		   System.out.printf("총 %d번 나타납니다.", count);
		   scanner.close();
	}
}
