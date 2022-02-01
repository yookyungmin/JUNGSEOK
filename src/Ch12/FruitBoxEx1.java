package Ch12;
import java.util.ArrayList;
import java.util.Spliterators.AbstractDoubleSpliterator;


//class Fruit { public String toString() {return "Fruit";}}
//
//
//
//public class FruitBoxEx1 {
//
//	public static void main(String[] args) {
//		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Apple> appleBox = new Box<Apple>();
//		Box<Toy> toyBox = new Box<Toy>();  //타입이 무조건 같아야함
//		
//		//Box<Grape> grapeBox = new Box<Grape>(); //에러 타입불일치
//	
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple()); //ok, void add(Fruit item); //Apple이 Product의 자손이라 들어갈수이음
//
//		
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
////		appleBox.add(new Toy());// 에러 Box<Apple>에는 상속관계도 아니기에 Toy를 못담음
//		
//		toyBox.add(new Toy());
////		toyBox.add(new Apple());// 에러 Box<Toy<에는 Apple을 담을수 없다\
//		
//		System.out.println(fruitBox);
//		System.out.println(appleBox);
//		System.out.println(toyBox);
//	}
//	
//	
//
//}
//
//class Box<T> {
//	ArrayList<T> list = new ArrayList<T>();
//	
//	void add(T item) {list.add(item);}
//	T get(int i) {return list.get(i);}
//	int size() {return list.size();}
//	public String toString() {return list.toString();}
//}
