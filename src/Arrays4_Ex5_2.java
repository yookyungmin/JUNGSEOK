public class Arrays4_Ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//총점 평균
		
		
		int sum =0; // 총점을 저장하기 위하 변수
		float average =0f; //평균을 저장하기 위한 변수 
		
		int[] score = {100, 88, 100, 100, 90};
		

//		sum+= score[0];
//		sum+= score[1];
//		sum+= score[2];
//		sum+= score[3];
//		sum+= score[4];
// 위를 for문으로 바꾼것
		for(int i=0; i<score.length; i++) {
			sum += score[i]; // 모든 요소를 반복문으로 더해서 sum에 넣는다
		
		}
		
		average = sum / (float)score.length;  // 계산결과를 float로 얻는다 소수점까지 얻기위해
		
		System.out.println("총점:"+ sum);
		System.out.println("평균:"+ average);

	}

}
