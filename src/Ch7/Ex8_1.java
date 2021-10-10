package Ch7;
//오버라이징
class Pointed extends Object {
	int x;  //좌표 위치
	int y;
	
	
	
	public String toString() { // object 클래스의 tostring()을 오버라이딩
		return "x:"+x+",y:" +y; 
		
	}
 }




public class Ex8_1 {   //OverrideTest

	public static void main(String[] args) {
	    Pointed p = new Pointed(); // 객체생성
	    p.x = 3;
	    p.y = 5;
	    System.out.println(p);
	    System.out.println(p.toString()); //간략하게 위와 동일
	    
	    
//	    System.out.println("p.x = "+p.x);
//	    System.out.println("p.y = "+p.y);  //간단하게 
	    
	    
     
		
		
	}

}
