package Ch7;


public class Ex16_innerclass1 {

class InstanceInner {
	int iv = 100;
//	static int cv = 100; // 에러 static 변수를 선언할수 없다
	final static int CONST = 100; //final static 상수이므로 허용
	
}

static class StaticInner { 
	int iv = 200;
	static int cv = 200;
	// static 크래스만 static 멤버를 정의 가능// 객체생성없이 가능, 인스턴스멤버사용불가
}

  void myMethod() {
	  class LocalInner{
		  int iv = 300;
		  //static int cv = 300; //에러 static 변수 선언 못함
		  final static int CONST = 300; // final static은상수이므로 사용가능
	  }
	
	  
	  int i = LocalInner.CONST; 
}




	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); // 에러 지역 내부 클래스는 메서드안에서만 가능
			
		}

	}



 