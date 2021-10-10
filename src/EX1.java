public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입관의 변환방법
		String str = "3";
		
		
	System.out.println('3'-'0'); //숫자3
	System.out.println(str.charAt(0)-'0'); //3 strcharat = '3'
	System.out.println("3".charAt(0)-'0'+1); //3 1을 더한 이유가 앞에 숫자가 숫자임을 확이나기위해
	System.out.println('3'-'0'+1); //4  문자3-'0' > 3 +1 =4    // 문자+문자 = 숫자
		 
	System.out.println(Integer.parseInt("3")+1); //4 1을 더한 이유가 앞에 숫자가 숫자임을 확이나기위해
	//parsint 문자> 숫자
	System.out.println('3' +1); // // 문자3+ 숫자1=52
	System.out.println("3" +"1"); // // 문자3+문자1 =31
	System.out.println(3 +'0'); // '0'은숫자로 48
	
		
		
		

	}

}
