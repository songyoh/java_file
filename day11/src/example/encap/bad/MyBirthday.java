package example.encap.bad;

public class MyBirthday {

	int year;
	int month; //1~12월 이외의 숫자가 들어오지 않게 하려면.. // 13%12=  
	int day; //1~31일 이외의 숫자가 들어오지 않게 하려면.. 
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
	}
}
