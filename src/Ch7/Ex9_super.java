package Ch7;
 
//super = 조상멤버와 자신 멤버 구별할때 사용, 인스턴스메서드 내에만 존재, 객체 자신을 가리키는 참조변수
public class Ex9_super {
	
	public static void main(String[] args) {
		Child c= new Child(); //객체생성 
		c.method();

	}

}

class Parent{
	int x = 10; /*super.x*/  // 조상멤버는 super
	
} //  (3)

class Child extends Parent{ 
	int x = 20;	//this.x (1) // 자기 멤버 this
void method() { //(2)
	System.out.println("x="+x);
	System.out.println("this.x="+this.x);
	System.out.println("super.x="+super.x);
	
}
}

