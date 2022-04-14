package Ch12;
import java.util.*;

class Fruit2		       	{ public String toString() { return "Fruit";}}
class Apple2 extends Fruit2	{ public String toString() { return "Apple";}}
class Grape2 extends Fruit2	{ public String toString() { return "Grape";}}

class Juice {
	String name;

	Juice(String name)       { this.name = name + "Juicee"; }
	public String toString() { return name;                }
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box)//와일드카드
	{
		String tmp = "";

		for(Fruit2 f : box.getList()) // 향상된 for문
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class Wildcard {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>(); // 참조변수에 대입된 지네릭 타입, 생성자에 대입된 지네릭타임 일치
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
//		//Fruit2와 그자손들 Apple, grape 대입된 객체를 가르킬수있음
//		FruitBox2<? extends Fruit2> appleBox = new FruitBox2<Apple2>();
//		appleBox = new FruitBox2<Fruit2>();
//		appleBox = new FruitBox2<Apple2>();
//		appleBox = new FruitBox2<Grape2>();
		

		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}  // main
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);      }
	T get(int i)     { return list.get(i);  }
	ArrayList<T> getList() { return list;   }
	int size()       { return list.size();  }
	public String toString() { return list.toString();}
}