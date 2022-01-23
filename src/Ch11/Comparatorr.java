package Ch11;

import java.util.Arrays;
import java.util.*;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
//compare() comparTo() 두 객체의 비교결과를 반환하도록 작성
public class Comparatorr {

	public static void main(String[] args) {
	
			String[] strArr = {"cat","DOG","lion","tiger"}; // 스트링배열
			
			Arrays.sort(strArr); //String의 comparable구현에 의한 정렬
			System.out.println("strArr="+Arrays.toString(strArr));
		
			
			Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //정렬기준 대소문자 구분안함
			System.out.println("strArr="+Arrays.toString(strArr));
			
			Arrays.sort(strArr, new Descending()); //역순정렬 내림차순
								//new Descending() 정렬기준
			System.out.println("strArr="+Arrays.toString(strArr));
	}


}

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1; //-1을 곱해서 기본 정렬 방식의 역으로 변경한다.
										//또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다
			//c1.CompareTo(c2) 기본정렬기준
		}
			return -1;
	}
}
