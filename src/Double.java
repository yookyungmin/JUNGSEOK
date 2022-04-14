
public class Double {

	public static void main(String[] args) {
		
		double d = 0.12345789;
		float f =0.123456f;
		int i =100;
		long l = 10_0000_000_000L;
		
		System.out.printf("%.2f\n",(double)l);  //소수점 둘째짜리
		System.out.printf("%.6f\n",(double)i); //소수점 6자리
		System.out.printf("%f*%f= %f\n",(double)i, f, i*f); //%f는 기본적으로 소수점 6까지 출력
	}

}
