package Ch7;

class Mypoint  {
	int x;
	int y;
}

//1))
// class Circle extends Mypoint { // 상속
//       int r;	
//
//}


//2)
//class Circle2{  //  포함 circle 안에 mypoint 포함
//	 Mypoint p = new Mypoint(); //  //처음에 참조변수의 초기화
//	 int r;   
//}

//3) 2랑 같음 코드
class Circle2 {  //  포함
	 Mypoint p; // circle 안에 mypoint 포함 // 참조변수의 초기화
	 int r;
     Circle2(){ //생성자에서
	p = new Mypoint(); // 초기화 그래야 저장공간 생김
  }
}


public class Ex7_2 {  // InheritanceTest{

	public static void main(String[] args) {
//		 Circle c = new Circle(); //객체생성
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x ="+c.x);
//		System.out.println("c.y ="+c.y);
//		System.out.println("c.y ="+c.r);  // 상속  관계
		
		 Circle2 c = new Circle2(); //객체생성 // 포함관계 
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x ="+c.p.x);
		System.out.println("c.p.y ="+c.p.y);
		System.out.println("c.p.r ="+c.r); 

	
	}

}
