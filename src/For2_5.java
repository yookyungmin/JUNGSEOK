public class For2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// i = 12345 5번 { } 내용 반복
		for (int i = 1; i<=10; i++) {

			//System.out.println("***********");
			for (int j= 1; j<=i; j++) { // j=i; i = 상수 리터럴
				System.out.print("*");	
			}
			System.out.println(); //줄바꿈	
		}
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
//		**********

	}

}
