package Ch7;
class BindingTest3{
	public static void main(String[] args){
	Parentt p = new Childd();
	Childd c = new Childd();

	System.out.println("p.x=" +p.x);
	p.method();
	System.out.println();
	System.out.println("c.x=" +c.x);
	c.method();	
}
}

class Parentt{
	int x = 100;
	void method() {
	System.out.println("Parent Method");
	}
}

class Childd extends Parentt {
	int x =200;
	void method() {
	System.out.println("x =" +x); // this.x와 같다
	System.out.println("super.x="+super.x); //조상 클래스인 Parent 에 선언된 인스턴변수 x
	System.out.println("this.x="+this.x); //Child 클래스 선언된 인스턴스 변수 x
	}

}