package Ch11;
import java.util.Map;
import java.util.HashMap;
public class Ex11HashMapKey {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("key1", 50);
		map.put("key2",100);
		map.put("key3",150);
		map.put("key4", 200);

		System.out.println("All key -value pairs");
		for(String key:map.keySet()){
		System.out.println("{"+key+", "+map.get(key)+"}");

		}

	}
}
	//All key-value pairs
	//{key1,50}
	//{key2,100}
	//{key3,150}
	//{key4,200}