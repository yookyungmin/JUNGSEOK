package Ch11;

import java.util.HashMap;
import java.util.Map;

public class Ex11Hashmap2{
	
public static void main(String[] args){
	Map<String, Integer> map = new HashMap();
	map.put("key1", 200);
	map.put("key2",100);

	if(!map.containsKey("key")) // 키가 들어있는지 확인, 있으면 덮어쓰지 않는다
	map.put("key2", 300);

	System.out.println(map);
	System.out.println(map.get("key1"));
	System.out.println(map.get("key2"));

}
}

//{key1=100, key2=200}
//100
//200 출력