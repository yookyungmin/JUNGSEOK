public class For_2_2 {

	public static void main(String[] args) {
		int sum = 0;  // 합계를 저장하기 위한 변수
		int sum2 = 0;
		
		for   (int i=1; i<=5; i++) {  // {}안의 문장을 10번반복 // i=i+2, i+=2(2씩증가), i*=3(3배씩증가) i--=(1씩감소
//			sum +=1;
//			sum +=2;
//			sum +=3;
//			sum +=4;
//			sum +=5;
				
			sum +=i; // sum = sum+i
			sum2 +=2;		
			
             System.out.printf("i부터 %d 까지의 합: %2d%n", i, sum );
             
             System.out.printf("i부터 %d 까지의 합: %3d\n", i, sum2);
            
	}
		
//		   System.out.println(i);

}
}
 