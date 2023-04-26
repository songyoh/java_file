package collection.map;
//임포트 해줘야 합니다~!
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map<key, value> 참조형 변수만 들어갈 수 없다. 기본형 변수 입력 불가 int 불가->Integer 가능
		Map<String, Integer> map = new HashMap<>();
		
		// Map에 객체를 저장 put(key, value)
		map.put("치킨", 30000);
		map.put("라면", 4000);
		map.put("탕수육", 20000);
		// 중복 key를 넣으면, 가장 마지막에 넣은 하나만 적용됨
		map.put("치킨", 25000);
		
		System.out.println(map);

		// Map에 저장된 key, value 쌍(entry) 개수 측정 size()
		System.out.println(map.size());
		
		// Map에 저장된 value값을 key값으로 얻기 get(key)
		int price = map.get("탕수육");// Integer price = map.get("탕수육")도 가능
		System.out.println("탕수육의 가격: "+price+"원");
		
		// Map에서 key만 전부 추출하기
		// 앞서 배운 Set 형식으로 추출됩니다.
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		// Iterator로 변경해서 저장
		Iterator<String> kIter = kSet.iterator();// Set에서 배운거 복습// 반복문
		System.out.println("==============");
		
		// Iterator를 while문으로 반복시켜, 모든 메뉴의 값을 콘솔에 찍어보세요.
		while(kIter.hasNext()) {// 포인터가 next하기전 엿보고 오는 것 (true/false)가 쟁점
			String menu = kIter.next();// 메뉴가있으면(참) true면 반복문 실행->kIter.next()에 의해 이동->kIter.next()에 실행문이 놔짐->좌변에 대입
			System.out.println(menu+"의 가격은: "+map.get(menu));
		}
		
		// Map 내부에 있는 key값의 유무를 확인 containsKey()
		String food = "치킨";
		
		if(map.containsKey(food)) {
			System.out.println("우리식당은 "+food+" 팝니다.");
		}else {
			System.out.println("우리식당은 "+food+" 안 팝니다.");
		}
		
		// Map내부 데이터 단일데이터 삭제 remove(key)
		// 일치하는 key값의 entry 한 쌍을 삭제
		map.remove("라면");
		System.out.println(map);
		
		// Map 내부 전체 데이터 일괄삭제 clear()
		map.clear();
		System.out.println(map);
		
		if(map.isEmpty()) {
			System.out.println("빈 map입니다.");
		}else {
			System.out.println("map이 유효합니다.");
		}
		
	}

}
