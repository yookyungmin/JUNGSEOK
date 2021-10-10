import java.util.Arrays;
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
//		int[] score; //1.배열 socre를 선언(참조변수)
//		score = new int[5]; // 2. 배열의 생성(int 저장공간x5
		
//		int[] score = new int[5]; // 배열 선언과 생성을 동시에
		
//		      score[3]=100; // score[3] 100 저장
		
//		
//		  score[0]=50; // 배열의초기화
//	      score[1]=60;		      	
//	      score[2]=70;
//	      score[3]=80;
//	      score[4]=90;
		   
		int[] score = {50, 60, 70, 89, 90}; //배열 생성 초기화 동시에  
		// 선언생성동시에문 가려줘야 에러안남 위랑 동일 배열의 초기화 / 배열의 각요소에 청므으로 값을 저장하는것
        				
				System.out.println("score[0]="+score[0]);
				System.out.println("score[1]="+score[1]);
				System.out.println("score[2]="+score[2]);
				System.out.println("score[3]="+score[3]);
				System.out.println("score[4]="+score[4]);
				System.out.println(score[3]);
				
				int value = score[3];
				System.out.println("value="+ value);
				
				
				
		
		

	}

}
