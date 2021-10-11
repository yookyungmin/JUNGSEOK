package Ch7;



class MyPointes{ //조상 
	int x;
	int y;
}

//class Circle extends MyPointes{ // 상속 관계
//	int r;
//	
//}
class Circle{ //포함관계
	MyPointes p = new MyPointes(); //참조변수의 초기화
//	 MyPointes p; // null 값
	int r;
//	Circle() {
//	  p = new MyPointes(); // 위에서 MyPointes p; 참조변수만 선언했을때 따로 생성자에서 초기화
//	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		
//		System.out.println("c.x= " +c.x);
//		System.out.println("c.y= " +c.y);
//		System.out.println("c.r= " +c.r); // 상속관계시
		
		c.p.x =1;
		c.p.y =2;
		c.r =3;
		
		System.out.println("c.p.x="+c.p.x);
		System.out.println("c.p.x="+c.p.y);
		System.out.println("c.r="+c.r); // 포함관계시
	}

}
