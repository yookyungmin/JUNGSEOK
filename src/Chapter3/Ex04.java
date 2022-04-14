package Chapter3;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 int a = 1_000_000; // 1백만  1백만 = 10의 6제곱
		
		int b = 2_000_000; // 2백만  2백 = 10의 6제곱
		// 10의 12제곱, int 의 범위는 10의 9제곱
		
		long c = a*b; //a*b = 2,000,000,000, 000 ?
		
		System.out.println(c); // 오버플로우(범위넘어감) 발생  */ // -1454759936 /error 		
		
	
		int a = 1_000_000; // 1백만  1백만 = 10의 6제곱
		int b = 2_000_000; // 2백만  2백 = 10의 6제곱
		// 10의 12제곱, int 의 범위는 10의 9제곱
		
		long c = (long)a*b; //a*b = 2,000,000,000, 000 ? 
		// 형변환 // 연솬결과가 인티저 타입을 넘어갈거같으면 ab 둘중에 큰타입형변환or 처음 변수부터 long 하거나
		
		System.out.println(c); // 
	}

}
