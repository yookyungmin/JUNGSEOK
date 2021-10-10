import java.util.Arrays;

public class Arrays4_Ex5_4 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numArr= {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<numArr.length; i++) { //i<10 < 10번바꾼다 // numArr.length 써도 됨, 길이만큼 바꾼다의미
			int n = (int)(Math.random()*10); //0~9중 한값을 임의로 얻는다.
			int tmp=numArr[1];    // i =첫번째 0과 임의의값을 바꾼다
			numArr[1] = numArr[n];
			numArr[n] = tmp;
			System.out.println(Arrays.toString(numArr)); // 과정 확인
		}

		
		//System.out.println(Arrays.toString(numArr)); //결과
	}

}
