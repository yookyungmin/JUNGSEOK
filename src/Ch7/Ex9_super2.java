package Ch7;
 
//super = 조상멤버와 자신 멤버 구별할때 사용, 인스턴스메서드 내에만 존재, 객체 자신을 가리키는 참조변수
public class Ex9_super2 {
	
	public static void main(String[] args) {
		Child2 c= new Child2(); //객체생성 
		c.method();

	}

}

class Parent2{int x = 10; } //  (3)/*super.x*,this.x 둘다가능  //  

class Child2 extends Parent2{ 
	
void method() { //(2)
	System.out.println("x="+x);
	System.out.println("this.x="+this.x);
	System.out.println("super.x="+super.x);
	
}
}

