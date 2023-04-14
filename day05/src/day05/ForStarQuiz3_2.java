
package day05;

public class ForStarQuiz3_2 {
	
	//     *  //5*5의 형태
	//    **
	//   ***
	//  ****
	// *****
	public static void main(String[] args) {
		// 중첩 반복문을 쓰되, if문으로 " "와 "*"을 통제
		for(int i = 1; i <= 5; i++) { // i를 5로 맞추는 이유 : 내가 적는 층수가 그대로 들어가게 하기위해
			for(int j = 1; j <= 5; j++) {
				//i값은 고정이고 5-j로 1~5까지 돌렸을때, 첫텀에 4개가 true로 나오게 설꼐
				if(i <= 5-j) { //i가 5-j보다 작은경우 //층수 - j 했을때 //i값은 고정이고 5-j로 1~5까지 돌렸을때
					System.out.print(" "); //println이 아닌 print로 출력
				}else {
					System.out.print("*"); //println이 아닌 print로 출력
				}
			}
			System.out.println();
		}

	}
	
}
