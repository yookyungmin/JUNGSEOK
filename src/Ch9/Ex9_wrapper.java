package Ch9;

public class Ex9_wrapper {

	public static void main(String[] args) {
//		int i = Integer.parseInt("100"); // 문자열을 기본형으로
//		System.out.println("i="+i);
//		System.out.printf("i=%d",i); //print f문

		
		
		System.out.println("i="+ Integer.parseInt("100"));
		
		System.out.println("i="+ Integer.parseInt("100",10)); //10진수 위와 동일
		System.out.println("i="+ Integer.parseInt("100",2)); //2진수
		System.out.println("i="+ Integer.parseInt("100",16)); //16진수 
//		System.out.println("i="+ Integer.parseInt("FF")); NumberFormatException.java:65 발생
	}

}
