package Ch7_pkg2;

import Ch7_pkg1.MyParent; //ctrl shift O

class Mychild extends MyParent{ //Ch7_pkg1.MyParent
	public void printmembers() {
//		System.out.println(prv); //에러 //같은 클래스에서 사용 가능
//		System.out.println(dft); //에러 // 같은 패키지에서 가능
		System.out.println(prt); //ok // 같은 패키지+다른 패키지, 자손 클래스
		System.out.println(pub); //ok
}
}



public class Ex11_modifier2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//      System.out.println(p.prv); //에러 // 같은클래스안에서만 사용가능
// 		System.out.println(p.dft); //에러 //같은패키지 안에서 가느
// 		System.out.println(p.prt); //에러 // 다른 패키지의 다른 클래스라 에러
 		System.out.println(p.pub); //ok  //접근제한없음

	}
}
