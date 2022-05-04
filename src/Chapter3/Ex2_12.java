package Chapter3;

public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)-'0'); // 문자 - 문자 숫자3
		System.out.println('3'-'0'+1); // 4  // 문자3 - 문자0 =숫자3 +1 4
		System.out.println(Integer.parseInt("3")+1);//4 
		System.out.println("3"+1); //1이 문자열"1"로바뀌어서 31
		System.out.println(3+'0'); // '0'= 숫자로 48
		System.out.println((char)(3+'0')); // '0'= 숫자로 48
		
		System.out.println('4'-'0'); //52-48 4 

	}

}
