
public class NumberRange {

	public static void main(String[] args) {
		int n=24;
		
		if(n>=0 && n<10)
			System.out.println("0이상 10미만의 수");
		else if(n>=10 && n<20)
			System.out.println("10이상 20미만의 수");
		else if(n>=20 && n<30)
			System.out.println("20이상 30미만의 수");
		else
			System.out.println("음수 혹은 30 이상의 수");

	}

}
