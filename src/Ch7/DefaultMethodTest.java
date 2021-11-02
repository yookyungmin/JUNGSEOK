package Ch7;

public class DefaultMethodTest {

	public static void main(String[] args) {
		Childdd c = new Childdd();
		c.method1();
		c.method2();


		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
	}

}

class Childdd extends Parenttt implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Childdd");
	}
}

class Parenttt {
	public void method2() {
		System.out.println("method2() in Parent");
	} 
	
}

interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
		}
	default void method2() {
		System.out.println("method2() in MyInterface");
		}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
	
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method() in MyInterface2");
		
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}