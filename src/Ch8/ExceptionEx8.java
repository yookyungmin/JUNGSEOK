package Ch8;
class ExceptionEx8{
	public static void main(String args[]) {
	
	System.out.println(1);
	System.out.println(2);

	try{
	System.out.println(3);
	System.out.println(0/0);// 예외발생
	System.out.println(4); //실행 되지 않는다.
	}
	catch(ArithmeticException ae) {
	ae.printStackTrace();// 예외발생 당시의 호출 스택에 있었던 메서드의 정보와 예외메시지를 화면에 출력한ㄷ.
	System.out.println("예외메시지:"+ ae.getMessage());// 발생한 예외 클래스의 인스턴스 저장된 메시지를 얻을수 있다
	}	
	//try-catch의 끝
	System.out.println(6);
}	//main 메서드의끝
}

