package Ch7;

import java.util.concurrent.CopyOnWriteArrayList;

class AAA{ ///AAA는 BBB의 외부클래스
	int i = 100;
	BBB b = new BBB();
	
	class BBB{ //BBB는 AAA의 내부 클래스 
		
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);  //
			System.out.println(i); // 내부클래스는 객채생성 없이 외부클래스 멤버접근가능		}
	}
}
}


//class CCC{
//	
//	BBB b = new BBB();
//}






public class Ex16_innerclass {

	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();

	}

}


