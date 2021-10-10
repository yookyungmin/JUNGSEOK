public class Mathround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반올림 Math.round 소수점 첫째자리에서 반올림
		
		double pi = 3.141592;
		
	/*	System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000)/1000); // 값= 3  // 3142/1000 1000이 인트라서 소수점사라짐
		System.out.println(Math.round(pi*1000)/1000.0); // 값=3.142   //  그래서 .0을 붙여서 소수를 살려줌
		//
		
		*/
		
		
	/*	// 3.141을 얻으려면 ? 일부러  int 로 값손실을 냄
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000)); //3141
		System.out.println((int)(pi*1000)/1000); // 3
		System.out.println((int)(pi*1000)/1000.0); // 3.141
		
		*/
		 
		
		
		//나머지 연산자
		
		int a = 10;
		int b = 8;
		
		System.out.printf("%d을 %d로 나누면,\n", a, b); // 
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n", a/b, a%b); // 몫1, 나머지 2
		
		System.out.println(10%8);
		System.out.println(10%-8); // - 무시됨
		
		
		
		
		
		
		
 		//double shortPi = Math.round(pi*1000) / 1000.0;
		//System.out.println(shortPi); 
	
	
	
	
	
	}

}
