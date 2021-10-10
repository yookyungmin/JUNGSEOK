package Ch7;
//super() 조상 클래스의 생성자 호출
public class Ex10_super3 {
 
	public static void main(String[] args) { //메인메소드
//        PointX p3 = new PointX(1,2,3); // 자손객체생성
		PointX p3 = new PointX(); // 자손객체생성
        System.out.println("p3.x= "+p3.x);
        System.out.println("p3.y= "+p3.y);
        System.out.println("p3.z= "+p3.z);
        
	}
}

class point extends Object { //조상클래스
	int x,y;
	
	
	point(){} // 기본생성자필수 // 아래 생성자가 있어서 생략가능하지만 자손 클래서에서 오류날수있음 
	point(int x, int y){  
//		super(); // object클래스의 생성자 //생략가능
		//모든생성자는 첫줄에 다른생성자를 호출해야한다,규치직키지위해 컴파일러가 자동추가
		this.x = x;
		this.y = y;  // 생성자 iv 초기화
	}
//	String getLocation() { //오버라이딩
//		
//		return "x :"+x+",y :"+y;
//	}
}

class PointX extends point {//자손
	int z;
	
	PointX(){
	  this(100,200,300); //PointX p3 = new PointX();메인메소드
	}
	
	PointX(int x, int y, int z){  // 모든생성자는 첫줄에 다른생성자를 호출해야한다
	    super(); // point(){}생성자를 호출  
	    // 위에 기본생성자point(){}가 없다면? super(x, y);
//		super(x, y); // 조상의 생성자 point(int x, int y) 호출
		this.x = x;
	    this.y = y;
		this.z = z;
	}
//	String getLoaction(){ //오버라이딩 조상 클래스 메서드를 변경 수정
//		return "x :" +x+",y :"+y+",z :"+z; //오버라이딩
	}