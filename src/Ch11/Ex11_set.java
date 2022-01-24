package Ch11;

import java.util.Iterator;
import java.util.Set;
import java.util.*;
import java.util.List;
import java.util.Collections;

//hashset ,, set 인터페이스를 구현한가장대표적인 컬렉션
//같은객체를 추가하려고하면 중복으로 간주하고 저장x
//순서 없이 저장, 중복x
public class Ex11_set {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		//순서 없이 저장, 중복x 
		Set set = new HashSet();
		
//		for(int i =0; set.size()<6; i++) {
//			int num=(int)(Math.random()*45)+1; // 1~45 수 난수 저장
//			set.add(num);
//		}//set 의 크기가 6보다 작은 동안 1~45난수저장
//		
//		List list = new LinkedList(set); //LinkedList(Collection c)
//		//set은 정렬(순서유지)을 못하기 때문에 리스트에 저
//		Collections.sort(list); //Collections.sort(list) 오름차순정렬
//		System.out.println(set);
//		
		for(int i =0; i<objArr.length; i++) {
//			set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
			//저장되지 않으면 false로반환
		}
		
		//HashSet에 저장된 요소들을출력한다
		System.out.println(set);  //[1, 1, 2, 3, 4] 중복되는 객체는 저장x
	
	//Hashset에 저장된 요소들을 출력한다 (Iterator)활용
		Iterator it = set.iterator(); //이터레이터 메소드로 이터레이터를 얻어오고 
		
		while(it.hasNext()) {//hashnext 호출해서 읽어올 요소가 있는지 확인
			System.out.println(it.next()); //요소하나 꺼내오기 
			//while문으로 반복하면 읽어올요소가 없을때까지 꺼내옴
		}
	
	}
}
