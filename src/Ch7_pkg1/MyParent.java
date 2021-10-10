package Ch7_pkg1;
//접근제어자



//다른 패키지에서 MyParent을 쓸라면 public을 붙여야하고 
//하나의소스파일에 public class는 딱 하나 있어야함
public class MyParent{ //접근제어자가 (public) //public class 이름과 소스파일이름과 일치해야함
	private   int prv; //같은 클래스
	          int dft; //같은 패키지
	protected int prt; //같은 패키지 + 자손 (다른 패키지)
	public    int pub; //접근제한 없음\ 
	
	public void printmembers() {
		System.out.println(prv); //ok
		System.out.println(dft); //ok
		System.out.println(prt); //ok
		System.out.println(pub); //ok
		
	}
	
	}
class Ex11_Modifier { //접근 제어자default

	public static void main(String[] args) {
            MyParent p = new MyParent();
//            System.out.println(p.prv); //에러 // 같은클래스안에서만 사용가능
       		System.out.println(p.dft); //ok 
       		System.out.println(p.prt); //ok
       		System.out.println(p.pub); //ok
             

	}
}


