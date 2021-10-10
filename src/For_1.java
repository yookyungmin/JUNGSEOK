public class For_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		    //{괄호 안의 내용을 20번 반복
		    //quiz1 1~10 사이의 난수를 20개 출력하시오
		    //12345678910 =10개
		    //quiz2 , -5~5 사이의 난수를20개 출력
		    // -5 -4 -3 -2 -1 0 12345 ==10개
		for(int i = 1; i<=20; i++) {
			
			//System.out.println(Math.random());
			//System.out.println(Math.random()*10);  //0.0 <=x<1.0
			//System.out.println((int)(Math.random()*10)); //0<=x<10  0~9
			//System.out.println((int)(Math.random()*10)+1); // 1<=x<11 1~10  quiz1
			//System.out.println((int)(Math.random()*11)); // 0<=x<11 , 0~10  
			//System.out.println((int)(Math.random()*11)-4); // -4  <=x<7 , 0~10  quiz2
			System.out.println((int)(Math.random()*11)-5); // -5<=x<6 , -5~5  quiz2
			
		}

	} 

}
