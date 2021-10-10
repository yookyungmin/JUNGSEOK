import java.util.Arrays;

public class Arrays4_Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //index : 0~45-1 // 0~44
		int[] ball = new int[45]; // 45개의 정수값을 저장하기
		
	    //배열의 각 요소에 1~45에 값을 저장한다.
		for(int i=0; i< ball.length; i++) {
			ball[i] = i+1; // ball[0]에 1이 저장된다
			
			System.out.println(Arrays.toString(ball));
		}
		int tmp = 0; //두값을 바꾸는데 사용할 임시변수
		int j= 0;  // 임의의 값을 얻어서 저장할변수
		
		//배열의 i 번째 요소와 임의의 요소에 저장된 값을 서로바꿔서 값을
		// 0번째부터 5번쨰 요소까지 모두 6개만바꾼다
		for (int i =0; i<6; i++) {
		   j= (int)(Math.random()*45);//0~44 범위
		   tmp = ball[i];
		   ball[i] = ball[j];
		   ball[j] = tmp;
		    System.out.println(Arrays.toString(ball));
		} 
		
		for (int i =0; i<6; i++) // 6개만 출력
		System.out.printf("ball[%d]=%d\n", i, ball[i]);
	} 

}
