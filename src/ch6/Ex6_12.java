package ch6;

public class Ex6_12 { // static blcok test
 
	static int [] arr = new int[10]; // arr = cv // 명시적(간단)   초기화 = 사용 
	
	static { // 클래스 초기화 블럭 - 배열 arr 을 난수로 채운다.
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1; 
			System.out.println("arr["+i+"] : " +arr[i]);
		}
		
	}    // cv 복잡 초기화
	
	
	
	
	public static void main(String[] args) {
		
//		for(int i =0; i<arr.length; i++) 
//		System.out.println("arr["+i+"] : " +arr[i]);
//		
		
		
	}

}
