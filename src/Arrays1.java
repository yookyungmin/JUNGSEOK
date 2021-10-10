import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열다루기
         int[] arr = {0,1,2,3,4}; // 1차원 배열 arr
         int[][] arr2D = {{11,12}, {21,22}}; //2차원배열 arr2d
         int[] arr3 = {3,4,1,0,2};
        
         System.out.println();
         System.out.println(Arrays.toString(arr3)); // 정렬전
         Arrays.sort(arr3); //배열 arr3을 오름차순으로 정렬
         System.out.println(Arrays.toString(arr3)); //
         
         System.out.println(Arrays.toString(arr));// 출력 [0, 1, 2, 3, 4,] 문자열로
         System.out.println(Arrays.deepToString(arr2D)); // 2차원이상일때 deepToString //출력
          
         
         String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
         String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
         
         System.out.println(str2D==str2D2);; // 참조변수값비교 false 이렇게안됨
         //1차원비교할땐 System.out.println(Arrays.equals()); euqals 사용
         System.out.println(Arrays.deepEquals(str2D, str2D2)); //2차원이라 deep /true
         
//        int[] arr2=Arrays.copyOf(arr,arr.length); //[0, 1, 2, 3, 4] // arr.length = 복사할 요소의 갯수
        //int[] arr2=Arrays.copyOf(arr,3); //[0, 1, 2]
//        int[] arr2=Arrays.copyOf(arr,7); // [0, 1, 2, 3, 4, 0, 0]
          int[] arr2=Arrays.copyOfRange(arr, 2, 4); //[2, 3] 2에서 4까지 4제외 
        System.out.println(Arrays.toString(arr2));
        
        
         
		 

	}


         } 