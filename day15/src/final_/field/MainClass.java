package final_.field;

public class MainClass {

	public static void main(String[] args) {
		Person kim = new Person("김자바");
		//kim.nationality = "일본"; // final이라 변경 불가
		//kim.name = "오송이";// final이라 변경 불가
		kim.age = 100;
		System.out.println("국적 : " + kim.nationality);//public이므로 조회가능
		System.out.println("이름 : " + kim.name);//public이므로 조회가능
		System.out.println("나이 : " + kim.age);//public이므로 조회가능

	}

}
