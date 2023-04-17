package abstract_.abs;

public class Store extends PopupStore {

	@Override
	public void orderApple() {
		System.out.println("착즙사과주스는 20,000원 입니다.");
	}

	@Override
	public void orderOrange() {
		System.out.println("착즙오렌지주스는 24,000원 입니다.");
	}

	@Override
	public void orderGrape() {
		System.out.println("착즙포도주스는 15,000원 입니다.");
	}

}
