package Ch11;

import java.util.HashMap;
import java.util.Map;

public class Ex11HashMap3{
public static void main(String[] args) {
	Map<String, Integer> map1 = new HashMap();
	Map<String, Integer> map2 = new HashMap();

	//map put
	map1.put("map1-key1", 100);
	map1.put("map1-key2", 200);

	//map2 put
	map2.put("map2-key2", 300);
	map2.put("map2-key3",400);
	
	System.out.println("map1="+map1);
	System.out.println("map2="+map2);  //전체출력

	map2.putAll(map1);// map2에 map1을 합침
	System.out.println("map includes map1:" +map2);

	//map1의 키, 값 변경
	map1.put("map1-key1", 1000);
       	//map2에는 영향없음
	System.out.println("map includes map1:" +map2);

//map1:{map1-key1=100, map1-key2=200}
//map2:{map2-key4=400, map2-key3=300}
//map2 includes map1:{map2-key4=400, map1-key1=100, map1-key2=200, map2-key3=300}
//map2 includes map1:{map2-key4=400, map1-key1=100, map1-key2=200, map2-key3=300}

} 
}