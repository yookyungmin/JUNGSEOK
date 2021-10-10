public class While1_2_1 {

	public static void main(String[] args) {
		
		int num = 12345, sum =0;
		//10으로 나머지 연산을 하면 마지막 자리를 얻는다. 1234%10 = 4
//		System.out.println(12345%10);
		
		
		//num= 12345, 1234, 123, 12,1 10씩 나눠서
//		for(num=12345; num>0; num= num/10) {
//			
//			System.out.println(num%10);
//			sum+= num %10;
//		}
//		System.out.println("각 자리수의 합:"+ sum);  /// for 문
		
		while(num>0){  // 조건식은 while문에서 절대 생략x
			sum=sum+num %10; // 나머지연산 10해서 누적 // sum+=num%10
			System.out.println("sum="+sum+",num%10=" +num%10);
			
			num=num/ 10; //증감식
		}
		System.out.println("각 자리수의 합:"+ sum);
//		
//		sum=5,num%10=5
//				sum=9,num%10=4
//				sum=12,num%10=3
//				sum=14,num%10=2
//				sum=15,num%10=1
	}

}
 