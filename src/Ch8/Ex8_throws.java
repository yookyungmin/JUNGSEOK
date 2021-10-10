package Ch8;


public class Ex8_throws {

	public static void main(String[] args) throws Exception {
		method1(); //갈튼 클래스 내의 Static 멤버이므로 객체생성없이 호출가능
	} // maim메서드의 끝

	static void method1() throws Exception{
		method2();
	}// method1의 끝

static void method2() throws Exception {
	throw new Exception();
	
}//method2의 끝
}
 
