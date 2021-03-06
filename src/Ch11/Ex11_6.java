package Ch11;
import java.util.*;

class Ex11_6 {
	public static void main(String[] args) {
		int[]	   arr   = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13}, {21,22,23}}; // 2차원배열
	

		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D"+Arrays.toString(arr2D)); //arr2D[[I@2a139a55, [I@15db9742]
		System.out.println("arr2D="+Arrays.deepToString(arr2D)); // 2차원배열 deeptostring

		int[] arr2 = Arrays.copyOf(arr, arr.length); // 5개 복사
		int[] arr3 = Arrays.copyOf(arr, 3);// 3개만 복사 인덱스 012
		int[] arr4 = Arrays.copyOf(arr, 7); // 01234 000    
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  // from ~ to // 2<=x<4
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  

		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 =  new int[5];
		Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); //0~5 >  1~6
		System.out.println("arr7="+Arrays.toString(arr7));

		for(int i : arr7) {// 향상된 for 문
//			for(int i=0; x<arr7.length;x++) 
//				int i = arr7[x];
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i); //  
		}

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(Arrays.equals(str2D, str2D2));     // false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true // 다차원은 deep

		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		Arrays.sort(chArr); // 배열을 정렬 , binarySearch(이진검색)하기전엔 반드시 정렬먼저
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
	}
	
	//순차적으로 데이터를 추가삭제// ArrayList(비효율적인메모리사용)가 LinkedList(데이터가많을수록접근성이 떨어짐)보다 빠름  
	//비순차적(중간에)데이터를 추가삭제//LinkedList가 빠름
	//(읽기)접근시간 ArrayList가 빠름
}