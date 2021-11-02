package Ch8;
class ExceptionEx3{
	public static void main(String args[]) {
	int number = 100;
	int result = 0;
	
	for(int i = 0; i< 10; i++){
	try{
		result = number/(int)(Math.random()*10);
		//0~9사이의 임의이 정수로 나눈 결과를 출력하는 일을 10번 반복
		System.out.println(result);
		}
	catch(ArithmeticException e) {
		System.out.println("0"); // Aritmetic 예외가 발행하면 실행되는 코드
		} // try - catch 의끝

} //for의 끝
	}
}
	