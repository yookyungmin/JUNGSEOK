package Ch7;

import java.security.PublicKey;

public class Ex15_interface {
	

	
//	class B{
//		public void method() {
//			System.out.println("merhodB");
//			
//		}
//	} // 유연x 변경에 불리 겁데기 +알맹이
	
	// 위를 아래로 구분 짓기 가능 
	// 두대상 객체간의 연결 대화 소통을 돕는 중간역할을 한다.
	//인터페이스의 장점 설계와 구현을 분리시킬수이 ㅆ다.
	
	
	
	
	interface I {
		public void method();
		
	 }   //선언부만 떼어네기 겁데기
	
	
	
	class B implements I {
		public void method() {
			System.out.println("methoB");;
		}
	}          // 껍데기 알맹이 따로 분리, 변경에 유리

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
