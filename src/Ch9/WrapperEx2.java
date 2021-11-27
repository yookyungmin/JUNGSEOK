package Ch9;

class WrapperEx2{
	public static void main(String[] args) {
	
	int i = new Integer("100").intValue();
	int i2= Integer.parseInt("100");//문자열 > 기본형 (숫자)
	Integer i3= Integer.valueOf("100");

	int i4 = Integer.parseInt("100", 2); // 2진수
	int i5 =  Integer.parseInt("100", 8);//8진수
	int i6  = Integer.parseInt("100", 16); //16진수
	int i7 = Integer.parseInt("FF", 16); // 16진수 255
	//int i8 = Integer.parseInt("FF"); // numberFormatException 발생
	
	Integer i9 = Integer.valueOf("100",2); //문자열 > 래퍼클래스
	Integer i10 = Integer.valueOf("100", 8);
	Integer i11 = Integer.valueOf("100", 16);

	System.out.println(i);
}
}