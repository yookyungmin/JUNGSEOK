package Ch7;
/// Object << 최상위 최고 상속 모든 클래스 조상
class Mpoint extends Object {
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
class Circle3 extends Object{  //  포함
	 Mpoint p; // circle 안에 mypoint 포함 // 참조변수의 초기화
	 int r;
    
	  Circle3(){ //생성자에서
	p = new Mpoint(); // 초기화 그래야 저장공간 생김
  }
}


public class Ex7_3 {  // InheritanceTest{

	  {
//		 Circle c = new Circle(); //객체생성
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x ="+c.x);
//		System.out.println("c.y ="+c.y);
//		System.out.println("c.y ="+c.r); 
		 Circle3 c = new Circle3(); //객체생성
      System.out.println(c.toString()); //  tostring extends Object 최상위 클래스에서 상속받아 오류 x
      //Ch7.Circle3(클래스명)@2a139a55(객체주소값) 로 출력
      Circle3 c2 = new Circle3(); //객체생성
      System.out.println(c2); //  tostring extends Object 최상위 클래스에서 상속받아 오류 x
            //Ch7.Circle3@15db9742
	
	}

}
