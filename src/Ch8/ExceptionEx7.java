package Ch8;
class ExceptionEx7{
	public static void main(String args[]){
	
	System.out.println(1);
	System.out.println(2);
	
	try{
		System.out.println(3);
		System.out.println(0/0);//정수는 0으로나누면 안되서 ArithmeticException 발생
		System.out.println(4); // 예외 발생한뒤로는 출력x
	}	catch(ArithmeticException ae){ 
		if(ae instanceof ArithmeticException) //형변환
			System.out.println("true");
		System.out.println("ArithmeticException");
	}	catch(Exception e) { // 예외 최고조상 다처리가능 마지막에 써야함
		System.out.println("Exception");
	}//try catch 의끝  //Exception 쓸떈 최고조상이 다 예외처리 가능 마지막에쓰기
		System.out.println(6);
}//main메서드끝
}
