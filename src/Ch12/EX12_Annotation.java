package Ch12;

import java.security.PublicKey;

class Parent {
	void parentMethod() {}
}
class Child extends Parent {
 	@Override // 오타 실수를 막아줌
 	@Deprecated // 앞으로 사용을 권하지 않는 필드나 메서드에붙임
 	//오버라이딩상속의 관계에 있는 클래스 간에 하위 클래스가 상위 클래스와 '완전 동일한 메소드'를 덮어쓴다
	void parentMethod() {} // 조상메서드의 이름을 잘못 적었음
}

@FunctionalInterface // 함수형인터페이스는 하나의 추상메서드만 가능 void가 두개라 에러잡힘
interface Testable { // 인터페이스는 추상 메서드를 여러개 가질수있음
	void test(); // 추상메서드
//	void chech(); // 추상메서드
}

class EX12_Annotation{
	@SuppressWarnings("deprecation") // depreaction 에러를 확인했다 / 경고억제
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); //deprecated된 메서드 사용
	}
	
}
