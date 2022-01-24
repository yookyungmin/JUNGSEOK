package Ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//treeset범위검색에유용
public class Ex11_TreeSet {
	public static void main(String[] args) {
		Set  set = new TreeSet(new Testcomp()); //범위검색, 정렬이 되서나옴
//		Set set = new HashSet()//정렬필요
		
		
		for(int i =0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1; //1~45
			
			set.add(num);
		}
		System.out.println(set);  //Treeset 정렬해서 나옴
 }
}

class Test{} //비교기준이 없음

class Testcomp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
	
}
