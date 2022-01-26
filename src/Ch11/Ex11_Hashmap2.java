package Ch11;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;
import java.util.Collections;
import java.util.Collection;
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
				//Map=Map인터페이스 m,, Entry인터페이스,, Map의 내부인터페이스 
				System.out.println("이름 = "+e.getKey()+", 점수 = "+e.getValue()); //
				
			}
			
			set = map.keySet(); //hashMap 저장된 모든 키가 저장된 set을 반환 //키만 가져올
			System.out.println("참가자 명단"+set);
			
			Collection values = map.values();
			it = values.iterator();
			
			int total = 0;
			while (it.hasNext()) {
				Integer i = (Integer)it.next();
				//int i =(int)it.next(); //오토박싱으로 이렇게 써도됨
					total+=i.intValue();
				
			}
			System.out.println("총점" + total);
			System.out.println("평균="+(float)total/set.size());
			System.out.println("최고점수"+Collections.max(values));
			System.out.println("최저점수"+Collections.min(values));
	}

}
