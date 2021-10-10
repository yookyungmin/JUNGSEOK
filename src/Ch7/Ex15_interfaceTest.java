package Ch7;



class A {
	//public void method (B ?){I를 구현하기전에
	//public void method (C ?){I를 구현하기전에 왼쪽걸 바꿨는데 I 구현후엔 I로 고정 후 메인함수에서만 변경
	public void method(I i) {  // B의 메소드를 호출하는 메서드 
		//인터페이스 I을 구현한 클래스만 가능
		i.method();// B의 메소드를 호출하는 i // method(I ?)오른쪽 ? 참조변수 
	}
}

// class B{
//   public void method() {
//	System.out.println("B클래스의 메서드");
//	
//}
//} // 유연x 변경에 불리 겁데기 +알맹이

// 위를 아래로 구분 짓기 가능 
// 두대상 객체간의 연결 대화 소통을 돕는 중간역할을 한다.
//인터페이스의 장점 설계와 구현을 분리시킬수이 ㅆ다.
 
 //B클래스의 선언과 구현을 분리
 interface I {
	 public void method();
 } //C 인터페이스 생성
 
 class B implements I{
	   public void method() {
		   
	   System.out.println("B클래스의 메서드");
		
	}
	}
 
 
 class C implements I{
	   public void method() {
		System.out.println("C클래스의 메서드");
		
	}
	}
 
 




public class Ex15_interfaceTest {

	public static void main(String[] args) {
          A a = new A(); // A클래스 객체생성 
          a.method(new C()); // A가 B를 사용(의존)

	}

}
