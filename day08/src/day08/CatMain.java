package day08;

public class CatMain {
	
	public static void main(String[] args) { //showCatInfo는 빠지게 되는 것
		//파이썬 튜터 적용시 5번부터 복사
		Cat c1 = new Cat("먼지", 3,"샴","회색");
		
		//c1.name = "먼지";
		//c1.kind = "샴";
		//c1.color = "회색";
		//c1.age = 3;
		
		Cat c2 = new Cat("봉지", 2, "샴", "흰색");
		
		//c2.name = "봉지";
		//c2.kind = "샴";
		//c2.color = "흰색";
		//c2.age = 2;
					
		c1.showCatInfo();
		c2.showCatInfo();
						
	}

}