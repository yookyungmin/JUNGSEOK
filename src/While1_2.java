import java.util.Scanner;


public class While1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num = 0, sum=0;
	      System.out.print("숫자를 입력하세요 .(예:12345)>");
	      
	      Scanner scanner = new Scanner(System.in);
	      String tmp =scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp 에 저장
	      num = Integer.parseInt(tmp); //입력받은 문자열 정수로 변환
	      
	      while(num!=0) {
	    	  
	    	 sum +=num%10; //sum = sum+num%10; , //num 을 10으로 나눈 나머지를 sum에 더함
	    	 System.out.printf("sum=%3d num=%d%n", sum, num); 
	    	 
	    	 num /=10; // num =num /10 ; num을 10으로 나눈 몫    	 
	      }
	      System.out.println("각 자리수의 합:"+ sum);
	      
          

	} 
 
}
