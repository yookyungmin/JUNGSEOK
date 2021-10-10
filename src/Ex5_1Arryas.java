public class Ex5_1Arryas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// index 범위 : 0~9
//		int[] arr = new int[7]; //길이가 7인int배열 arr생성
	    
		
		
		int[] arr = {10, 20, 30, 40, 50, 60, 80}; // 배열 생성 초기화 동시에
		
		System.out.println("arr.length="+arr.length); // 길이가 몇인지 확인을위한출력
		
		
		for(int i=0; i<arr.length; i++) { //index 범위 주위  //arr.length 위에 길이만 자유롭게 변경가능
			System.out.println("arr["+i+"]="+arr[i]);  // 배열 출력
			
		} 

	}

}
