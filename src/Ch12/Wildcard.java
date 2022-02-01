package Ch12;


import java.util.ArrayList;

class Fruit2 {public String toString() {return "Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return "Apple";}}
class Grape2 extends Fruit2 {public String toString() {return "Grape";}}

class Juice {
	String name;
	Juice(String name){
		this.name = name + "Juice";
	}
	public String toString() {
		return name;
	}
}
class Juicer {
	static Juice makeJuice(FruitBox2 <? extends Fruit2>box) {
		String tmp = " ";
		for(Fruit2 f: box.getList())
			tmp+= f+ " ";
	}
}

public class Wildcard {

	public static void main(String[] args) {
		FruitBox2<Fruit2> 

	}

}

class FruitBox2<T extends Fruit> extends Box<T>{}
