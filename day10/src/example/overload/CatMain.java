package example.overload;

public class CatMain {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		System.out.println(c1.name);
		System.out.println(c1.kind);
		System.out.println("================");
		
		Cat c2 = new Cat("노랑", "치즈");
		System.out.println(c2.name);
		System.out.println(c2.kind);
		System.out.println("================");
		
		c2.call();
		c2.call("노랑");
		
	}

}
