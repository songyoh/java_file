package final_.const_;

public class MainClass {

	public static void main(String[] args) {
		// 상수만 모아둔 클래스 특성상 클래스명이 곧 집합을 대표하는 이름이 됩니다.
		System.out.println(CountrySizes.KOREA_SIZE);//CountrySizes는 상수들을 모아주는 그룹핑역할
		System.out.println(CountrySizes.STATES_SIZE);//CountrySizes라는 내부에 나라별 면적을 나타내줌
		System.out.println(CountrySizes.THAILAND_SIZE);
		
		// 이를 잘 사용하는 예시는 자바의 Math 클래스가 있습니다.
		System.out.println(Math.PI);//원주율 값을 실행해준다.

	}

}
