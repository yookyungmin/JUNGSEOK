package Ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Ex11_Hashmap2 {

	public static void main(String[] args) {
			HashMap map = new HashMap();
			map.put("김자바", new Integer(90));
			map.put("김자바", new Integer(100));
			map.put("이자바", new Integer(100));
			map.put("강자바", 80);
			map.put("안자바", new Integer(90));
			
			Set set = map.entrySet(); //출력시 key값과 value의 값이 필요
			Iterator it =set.iterator();
			
			while(it.hasNext()) {
				Map.Entry e = (Map.Entry)it.next();
				System.out.println("이름 = "+e.getKey()+", 점수 = "+e.getValue());
				
			}
			
			set = map.keySet(); //hashMap 저장된 모든 키가 저장된 set을 반환
			System.out.println("참가자 명단"+set);
			Collection values = map.values();
			it = values.iterator();
			
			int total = 0;
			while (it.hasNext()) {
				Integer i = (Integer)it.next():
					total+=i.intValue();
				
			}
			System.out.println("총점" + total);
			System.out.println("평균="+(float)total/Set.size());
			System.out.println("최고점수"+Collections.max(values));
			System.out.println("최저점수"+Collections.min(values));
	}

}
