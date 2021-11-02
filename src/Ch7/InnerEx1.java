package Ch7;

class InnerEx1 {
 class InstanceInner{ //인스턴내부 클래스
	 int iv = 100;
//	 static int cv = 100; //에러! static 변수를 선언할수 없다
	 final static int CONST = 100; // FINAL STATIC 은 상수이므로 사용 가능	 
 }
 
 	static class StaticInner{ //tmxoxlr zmffotm
 		int iv= 200;
 		static int CV =200; // static 클래스만 static멤버를 정의 할수 있다, //객채생성없이 사용 가능, 인스턴스 멤버 사용불가
 	}
 	
 	void myMethod() {
 		class LcalInner{ //메서드 안에 있으니 지역클래스
 			//static int cv =300; //에러!static  변수 선언 불가
 			final static int CONST = 300; // final static 은 상수미으로 허용
 			
 		}
 	}
 	
 	
	public static void main(String[] args) {
	 System.out.println(InstanceInner.CONST); //인스턴스 클래스의 CONST변수
	 System.out.println(StaticInner.CV); //스태틱 클래스의 CV변수

	}

}
