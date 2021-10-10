package Ch9;

public class Ex9_wapper3 {
// 오토박싱 &  언박싱 기본형과 참조형간의 자동형변환ㄴㄴ
	public static void main(String[] args) {
		int i = 10;
		
		
		//기 가능)
		Integer intg = (Integer)i; // Integer intg = Integer.valueOf(i);
		Object obj = (Object)i; // object obj = (object)Integer.valueOf(i);
		//기본형을 객체 타입으로
		
		Long lng = 100L; // Long long = new Long(100L); 래퍼클래스 Long 에다 기본형 저장 가능
		// 원래는 객체를 만들어서 저장
		
		int  i2 = intg + 10; // 참조형과 기본형간의 연산가능  intg= 참조형 10 기본형
		long l = intg + lng; //참조형간의 덧셈도가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; //참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		

	}

}
