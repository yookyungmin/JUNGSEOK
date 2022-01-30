package Ch12;

import java.util.ArrayList;
import java.util.List;


class Tvv{}


public class GenericTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		ArrayList<Tvv> list2 = new ArrayList<Tvv>(); //tv타입객체만사용가능
//		ArrayList<Product> productlist = new ArrayList<Tv>();  //제네릭스 다르게 못함 

//		List<Tv> tvList = new ArrayList<Tv>(); //다형성 ok 
		//ctrl + o 클래스의 멤버목록
		
		

		
		
		
		
		list.add(new Tvv());
//		list.add(new Audio());
		list2.add(new Tvv());
		
		Tvv t = (Tvv)list.get(0); //list의 첫번째 요소를꺼낸다. //list 반환타입이 object라서 Tv형변환 필요
		Tvv t1 = list2.get(0);
	}

}
