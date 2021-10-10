package ch6;

public class Ex6_4_1 {

	public static void main(String[] args) {
		// 
		MyMatho mm = new MyMatho();
		long result = mm.max(5, 3);
		long result1 = mm.add(5L, 3L); //add 메서드 호출
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printgugudan(2); // 2단 입력
		
		System.out.println("max(5L, 3L)="+result);
		System.out.println("add(5L, 3L)="+result1);
		System.out.println("subtract(5L, 3L)="+result2);
		System.out.println("multiply(5L, 3L)="+result3);
		System.out.println("divide(5L, 3L)="+result4);
	}
}
		
    class MyMatho{
    	  void printgugudan(int dan) {
    		  if(!( 2<=dan && dan<=9)) //위에 mm.printgugudan(2) 숫자넣고 구구단 
    			  return; //입력받은 단 이 2~9단이아니면 메서드 종료하고 돌아가기 
    		  for (int i=1; i<=9; i++) {
    			  System.out.printf("%d*%d = %d\n", dan, i, dan*i);
    		  }
    	      // return;  // 생략가능 메
    	  }
    	  
	long add(long a, long b) { 
		long result = a+b;
		return result;
		//return a+b; // 위의 두줄을 이와같이 한줄로 간단히 가능
	}
	
	   long max(long a, long b) { //둘중에 큰값을 반환하는 메서드
		   long result = 0;
		   if (a>b) {
			   result =a; // 조건식일 참일때만 실행
		   }
		   else {
			   result = b; //조건식일 거짓일때 실행 필수
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
    //반환타입이 void가 아닐때 리턴문 옆에 반환값을 써줘야함


    