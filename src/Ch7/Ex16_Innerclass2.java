package Ch7;

class Ex16_Innerclass2 {
	
	class InstanceInner{}
	static class StaticInner{} 
	
	InstanceInner ivInner = new InstanceInner(); //인스턴스멤버끼린 접근가능
	static StaticInner cv = new StaticInner(); // static 멤버끼리는직접 접근가능
	// = new InstanceInner() 사용불가
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner(); //에러 static 멤버는 인스턴스 멤버 접근불가
		StaticInner obj2 = new StaticInner();
	
	}
	void instanceMethod() { //인스턴스메서드에서는 인스턴스 멤버와 Static멤버 모두 접근가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
	}
	void myMethod () {
		class LocalInner{}
		LocalInner ivInner = new LocalInner();
		
	}
  
public static void main(String args[]) {
	
}
}

	 
  

