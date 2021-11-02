package Ch7;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class BindingTest {

	public static void main(String[] args) {
		
		Parente p = new Childe(); //조상타입 참조변수 p, childe()자손타입 인스턴스
		Childe c = new Childe();  //자손타입 참조변수 c, Childe()자손타입 인스턴스
		//Childe c = new Parente();  // 불가 참조변수 c가 사용할수 있는 멤버는 인스턴스 멤버 parente보다 멤버수가 같거나 적어야함 
		
		System.out.println("p.x = "+ p.x);
		p.method();
		System.out.println("c.x= "+ c.x);
		c.method();

	}

}

class Parente {
	int x = 100;
	void method() {
		System.out.println("Parente method");
	}
}

class Childe extends Parente {
	int x = 200;
	
	void method() {
		System.out.println("childe Method");
	}
}