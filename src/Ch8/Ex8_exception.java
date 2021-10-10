package Ch8;


public class Ex8_exception {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0); // ArithmeticException 예외발생 캐치블럭으로
//			System.out.println(4); // 실행되지 않는다.
//		} catch (ArithmeticException ae) {
//			if (ae instanceof ArithmeticException)
//				  System.out.println("true");
//			System.out.println("ArithmeticException");
//		  
//		}catch  (Exception e) { //모든 예외의 최고조상
//			System.out.println("Exception");
//		}  //try-cathc의 끝
//		System.out.println(6);
//		//main메서드의 끝
		
//		1
//		2
//		3
//		true
//		ArithmeticException
//		6

		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]); //배열범위 벗어남 ArrayIndexoutofboundsException
			System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				  System.out.println("true");
			System.out.println("ArithmeticException");
//		} catch (ArrayIndexOutOfBoundsException e)
		} catch (Exception e) //모든 예외의 최고조상 
			{
			System.out.println("ArrayIndexOutOfBoundsException");
		}//try catch의끝
		System.out.println(6);
		//main메서드의 끝
	}

}
