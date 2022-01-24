package Ch11;

import java.io.InterruptedIOException;
import java.util.*;
public class Iter {
	

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
//		HashSet list = new HashSet(); //Collection의 자손
		
		//Collection list = new Hahset(); // hashset은 set인터페이스 구현 set은 collection의 자손이라가능
		//Collection c = 으로 해놓으면 Treeset 으로 바뀌어도 참조변수는 안바뀌기떄문에 검토없이 사용가능
		
		list.add(1);
		list.add(2);
		list.add("삼");
		list.add(4);
		list.add(5);
		
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		//Iterator는 1회용이라 다쓰고 나면 다시 얻어와야한다
		it = list.iterator();//새로운 iterator 객체체를 얻는다.
		
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);  //hashset 겟 메서드가 없어 동작x
			System.out.println(obj);
			
		}
		
		for(Object i:list) { 
			System.out.println(i);
		}

	}

}
