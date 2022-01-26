package Ch11;
import java.util.HashMap;
import java.util.Map;

public class ExHashmap{
	public static void main(String[] args) {
	Map<String, Integer> map=new HashMap(); // <키 자료형, 값 자료형>
	map.put("A", 100);
	map.put("B", 101);
	map.put("C", 102);
	map.put("C", 103); // 중복된  key가 들어갈때는 이전 키, 값을 지금의 것으로 업데이트

	System.out.println(map); // 전체출력
	System.out.println(map.get("A"));
	System.out.println(map.get("B"));
	System.out.println(map.get("C"));
/*
*{A=100, B=101, C=103}
100
101
103
*
*/

}

}