package Ch11;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthScrollPaneUI;

//ArrayList list를 구현해서 순서o중복o
public class Collection {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); //기본길이 (용량, capacity)가 10인 ArrayList를 생성
		//ArrayList에는 객체만 저장가능
		//autoboxing 의해 기본형이 참조형으로 자동변환
		
//		list1.add(new Integer(5));
		list1.add(5);  // 컴파일러가 autoboxing을 해주기떄문에 단순히씀
		
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		//ArrayList(Collection c)
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //sublist 일부를 뽑아서 새로운 list를만든다 1<=x<4  범위// 4, 2, 0
		/* 위 한줄과 아래두줄 동일
		 * list sub = list1.sublist(1,4);  //sub는 읽기만 가능 [4,2,0]
		 * ArrayList list2 = new ArrayList(sub); //sub와같은 내용의 ArrayList생성
		 */
		print(list1, list2);
		
		//정렬 방법 sort 오름차순
		//Collection은 인터페이스 , Collections는 클래스
		Collections.sort(list1); //list1과 list2를 정렬한다 //오름차순
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2)); //list1이 list2의 모든 요소를 포함하고 있냐? //true
	
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); //인덱스 3번쨰 자리에 A
		print(list1, list2);
		
		list2.set(3, "AA");  //인덱스 3번 AA로 교체

	
		list1.add(0, "1");
		System.out.println("index="+list1.indexOf("1")); //list1에서 문자열 1이 어디에 있는지 알려줌
		System.out.println("index="+list1.indexOf(1)); //list1에서 문자열 1이 어디에 있는지 알려줌
		System.out.println("index="+list1.indexOf(new Integer(1))); //list1에서 문자열 1이 어디에 있는지 알려줌
//		list1.remove(0);//멘앞 0 인덱스에 있던 에 있떤 String 1이 없어짐
		list1.remove(new Integer(1)); //인덱스1 사라짐
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2)); 
		print(list1, list2);  //
		
		
		//list2에서 lis1에 포함된객체들을 삭제한다
		for(int i=list2.size()-1; i>=0; i--) { // list2.size()-1   5-1 인덱스 4부터 삭제
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
			print(list1, list2);
	}
	//ArrayList에 저장된 첫번쨰 객체부터 삭제하는 경우 배열복사발생 ,, 
	/*
	 * for(int i=0; i<list.size(); i++)
	 * list.remove(0);
	 * 
	 * ArrayLis에 저장된 마지막객체부터 삭제하는 경우 배열복사 발생x  빠르다
	 * for(int i=list.size()-1 i>=0 i--)
	 * list.remove(i);
	 */
	
//		for(int i=0; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//		} //반복문을 이용해 list1출력
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" +list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}

}
