package Ch12;
import java.util.ArrayList;

//Eatable 인터페이스
// Fruit이 Eatable 구현
//Apple, Grape 가Fruit 상속

//Toy


//static 멤버 타입 변수 사용불가
//class Box<T> {
//	static T item; //에러
//	static int compare(T t1, T t2) {} //에러


/*
 * 배열 생성할떄 타입 변수 사용불가 타입 변수로 배열 선언은가능
 * class Box<T> {
 *  T[] itemArr; //ok T타입의 배열을 위한 참조변수
 *  
 *  T[] toArray() {
 *  	T[] tmpArr = new T [itemArr.length] ;; // 에러 제네릭 배열 생성불가
 *   new T 안됨 객체생성, 배열생성xx 
 * 
 * 
 */


class Fruit implements Eatable{  //구현
	
	public String toString() {return "Fruit";}
}

class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Melon extends Fruit {public String toString() {return "Melonnn";}}
class Toy {public String toString() {return "Toy";}}

interface Eatable{}

class FruitBoxEx2{
	
	public static void main(String[] args) {
	
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<>(); //jdk 1.7부터 생략가능
//		FruitBox<Grape> grapeBox = new FruitBoxM<Apple>(); //에러 타입 불일치
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); //에러 Fruit의박스에 자손이아님
		Box<Toy> toyBox2 = new Box<>(); //ok 
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		fruitBox.add(new Melon());
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); //grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox="+fruitBox);
		System.out.println("appleBox="+appleBox);
		System.out.println("grapeBox="+grapeBox);
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{} //Fruit타입의 자손이면서 Eatable구현한 클래스만 지정가능
		//Fruit이 이미 Eatable을 구현했기에 Eatable은 지워도됨

class Box<T>{
	ArrayList<T> list = new ArrayList<T>(); //item 저장할list
	
	void add(T item) {list.add(item);} //박스에 item추가  //Void add(Fruit item)
	T get(int i) {return list.get(i);}//박스에서 item 꺼낼때
	int size() {return list.size();} //
	public String toString() {return list.toString();}
	
}



//class Fruit2		       	{ public String toString() { return "Fruit";}}
//class Apple2 extends Fruit2	{ public String toString() { return "Apple";}}
//class Grape2 extends Fruit2	{ public String toString() { return "Grape";}}
//
//class Juice {
//	String name;
//
//	Juice(String name)       { this.name = name + "Juice"; }
//	public String toString() { return name;                }
//}
//
//class Juicer {
//	static Juice makeJuice(FruitBox2<? extends Fruit2> box)//와이들카드
//	{
//		String tmp = "";
//
//		for(Fruit2 f : box.getList()) // 향상된 for문
//			tmp += f + " ";
//		return new Juice(tmp);
//	}
//}
//
//class Ex12_4 {
//	public static void main(String[] args) {
//		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>(); // 참조변수에 대입된 지네릭 타입, 생성자에 대입된 지네릭타임 일치
//		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
//		
//		//Fruit2와 그자손들 Apple, grape
////		FruitBox2<? extends Fruit2> appleBox = new FruitBox2<Apple2>();
////		appleBox = new FruitBox2<Fruit2>();
////		appleBox = new FruitBox2<Apple2>();
////		appleBox = new FruitBox2<Grape2>();
//		
//
//		fruitBox.add(new Apple2());
//		fruitBox.add(new Grape2());
//		appleBox.add(new Apple2());
//		appleBox.add(new Apple2());
//
//		System.out.println(Juicer.makeJuice(fruitBox));
//		System.out.println(Juicer.makeJuice(appleBox));
//	}  // main
//}
//
//class FruitBox2<T extends Fruit2> extends Box2<T> {}
//
//class Box2<T> {
//	ArrayList<T> list = new ArrayList<T>();
//	void add(T item) { list.add(item);      }
//	T get(int i)     { return list.get(i);  }
//	ArrayList<T> getList() { return list;   }
//	int size()       { return list.size();  }
//	public String toString() { return list.toString();}
//}