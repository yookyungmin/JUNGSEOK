package Ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkd {

	public static void main(String[] args) {
		
		//선언
		LinkedList list = new LinkedList(); //기본적으로 object타입을저장
		LinkedList<String> list1 = new LinkedList<String>(); // 문자열 데이터를 저장
//		LinkedList<String> lits2 = new LinkedList<String>(othrerList); //다른 컬렉션을 생성자에 입력
		
		list.add("Data1"); //"Data" 문자열 추가
		list.add(1, "Data2");//1번자리에 "Data2" 문자열 추가
		list.addFirst("Data3");//첫번째 자리에 "Data3" 문자열추가
		list.addLast("Data4"); //마지막 자리에 "Data4"문자열추가
		list.add(5);
		list.add(55);
		list.get(2);
		print(list);
		

		
		System.out.println(list.get(0)); //Data3 출력
		System.out.println(list.get(1)); //Data1 출력
		list.remove(); //0 첫번째값제거
		list.removeFirst(); //첫번쨰값제거
		list.removeLast();
		//list.clear(); 모든값제거
		
//		list.size();
		System.out.println(list.get(2));
		print(list);  //LinkedList[Data2, Data4, 5]
	
		
		//for문을 이용한순회
		for(Object data:list) {  //따로 지네릭스 지정안해줘서 Object
			System.out.println(data);
			
			
			//Iterator를이용한 순회
		System.out.println("==========Iterator 사용");
			Iterator iter = list.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			System.out.println("==========");
			
			//linkedList에 특정값이 저장되어있는지 확인하는 메소드도 제공
			System.out.println(list.contains("Data2")); //있으면 true 리턴
		System.out.println(list.indexOf("Data2"));	 // 저장되어 있는 위치 출력
			
		}
	}

	static void print(LinkedList list) {
		System.out.println("LinkedList" +list);
	
		System.out.println();
}

}
