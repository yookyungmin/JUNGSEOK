package Ch7;
// Exx8_1의 다르방식
class Pointedd extends Object {
	int x;  //좌표 위치
	int y; 
	
	
	Pointedd(int x, int y){ // 생성자
		this.x = x;
		this.y = y;
	}
	public String toString() { // object 클래스의 tostring()을 오버라이딩
		return "x:"+x+",y:" +y; 
		
	}
 }




public class Ex8_2 {   //OverrideTest

	public static void main(String[] args) {
	    Pointedd p = new Pointedd(1,5);
	    System.out.println(p);
	    
	    System.out.println(p.toString()); //간략하게
	    
//	    Pointedd p = new Pointedd(1,5);   // 간략하게 바꾸기전
//	    p.x = 3;
//	    p.y = 5;
//	    System.out.println("p.x = "+p.x);
//	    System.out.println("p.y = "+p.y);  //간단하게 
	    
	    
     
		
		
	}

}
