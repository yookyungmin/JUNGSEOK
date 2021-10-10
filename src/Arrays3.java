import java.util.Arrays; //ctrl + shift + o // 자동 import문 추가

public class Arrays3 {

	public static void main(String[] args) {
	  	//배열의 출력 
		
		int[] iArr = {100, 95, 80, 70, 60}; // 길이가 5인 int 배열
       System.out.println(iArr);  //[I@7637f22] i = integer 배열 의미
       
       
       for (int i=0; i<iArr.length; i++) {
    	   System.out.println(iArr[i]);  // 배열 출력  
       
       }
        System.out.println(Arrays.toString(iArr)); // [100, 95, 80, 70, 60]
	}

}
