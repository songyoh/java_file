import java.util.Scanner;

public class Quiz_AB2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//한국 생년을 태국 불교년도로 바꿔보자
		
		int year = scan.nextInt();
		
		System.out.println(year - 543);
		
		scan.close();
	}
}
