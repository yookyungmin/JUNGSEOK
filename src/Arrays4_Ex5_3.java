public class Arrays4_Ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; //배열의 첫번째값을 최대값을 초기화 한다.
		int min = score[0]; //배열으 첫번째값을 최소값을 초기화 한다.
		
		for(int i=1; i<score.length; i++) { // 배열의 두 번째 요소부터 읽기위해서 변수 i의값을 1로초기화,0이 1번
			if(score[i]>max) {
				max=score[i];
			
			} 
			else if(score[i]<min) {
				min=score[i];
			}
			
		
		}//end of for
		
		System.out.println("최대값 ="+max);
		System.out.println("최솟값 ="+min);
		     
	}

}
