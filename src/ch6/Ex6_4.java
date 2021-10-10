package ch6;

public class Ex6_4 {

	public static void main(String[] args) {
		// 
		MyMath mm = new MyMath();// MyMath객체생성
		long result = mm.max(5, 3);
		long result1 = mm.add(5L, 3L); //add 메서드 호출
		long result2 = mm.subtract(5L, 3L); // 빼기
		long result3 = mm.multiply(5L, 3L); //곱하기 
		double result4 = mm.divide(5L, 3L); // 몫구하기  
		//MyMath 객체사용(객체의메서드호출)
		
		System.out.println("max(5L, 3L)="+result);
		System.out.println("add(5L, 3L)="+result1);
		System.out.println("subtract(5L, 3L)="+result2);
		System.out.println("multiply(5L, 3L)="+result3);
		System.out.println("divide(5L, 3L)="+result4);
	}
}
		
    class MyMath{
	long add(long a, long b) { 
		long result = a+b;
		return result;
		//return a+b; // 위의 두줄을 이와같이 한줄로 간단히 가능
	} // MyMath 클래스 작성
	
	   long max(long a, long b) {
		   long result = 0;
		   if (a>b) {
			   result =a;
		   }
		   else {
			   result = b;
		   }
		   return result;
	   }
	
////	      long max(long a, long b) { // 위에 간소화한것
////	    	  long result =0;
////	    	  result = a>b ? a:b; //삼항연산자  a가 b보다 크면 a 
////	    	  
////	    	  return result;  // 간소화 result a>b ? a:b; // 
	                          /// 간소화되면 지우기 >>long result =0;/ result =
//	    	  }
	

	    
          long subtract(long a, long b) {return a-b;}
		  long multiply(long a, long b) {return a*b;}
		  double divide(double a, double b) {
			  return a/b;

}
          }
    


    