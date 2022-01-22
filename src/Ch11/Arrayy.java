package Ch11;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Arrayy {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4};
		int[][] arr2D= {{11,12,13}, {21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr,  arr.length); //복사해서 arr2를만듬
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr4, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		
		System.out.println("arr2="+Arrays.toString(arr2));//{5개}
		System.out.println("arr3="+Arrays.toString(arr3));//{3개}
		System.out.println("arr4="+Arrays.toString(arr4));//{5+00}
		
		int[] arr7 = new int[5]; 
		
		Arrays.fill(arr7, 9); //arr={9,9,9,9,} //arr[7]배열을 9로 채워라
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i-> (int)(Math.random()*6)+1);//람다식 랜덤값을 채우기 1~6
		
		for(int i:arr7) {//아래를 간단하게 한게 향상된for문
//		for(int x=0; x<arr7.length; x++) {
//			int i=arr7[x];
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
			//String>char[] tocharArray() <=> String(char[])
		}
		
		String[][] str2D= {{"aaa","bbb"}, {"AAA","BBB"}};
		String[][] str2D2= {{"aaa","bbb"}, {"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));  //false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //true 2차원배열이라 deepequals
		
		
		char[] chArr = {'A', 'D', 'C','B', 'E'};
		
		System.out.println("chAr="+Arrays.toString(chArr));
		System.out.println("index of B="+Arrays.binarySearch(chArr, 'B')); //B의 위치를 말해줌 정렬전이라 음수로나옴
		System.out.println("=After Sorting");
		Arrays.sort(chArr); //정렬
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B="+Arrays.binarySearch(chArr, 'B'));  //1
	}
}
