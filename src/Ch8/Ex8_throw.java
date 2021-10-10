package Ch8;

public class Ex8_throw {

	public static void main(String[] args) {
//	 throw new Exception(); // Exception을 고의로 발생시킨다. 
	 //빨간줄에러 o // Unhandled exception type Exception 예외처리를 안해서 나오는 에러
	 // Exception과 그 자손은 반드시 예외처리 필수아래와 같이 try catch 필수
		
		try { //E
			throw new Exception(); 
		}catch(Exception e) {
			
		}
		
		
		
//		throw new RuntimeException(); 
    //빨간줄에러 x 컴파일 에러가 없다는 뜻, 런타임에러 java.lang.RuntimeException
    //try catch 예외 처리 안해도 컴파일이된다. (선택)필수 
		
		
//		try { 
//			throw new RuntimeException(); 
//		}catch(Exception e) {
//			
//		}
	}

}
