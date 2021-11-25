package Ch9;

public class WrapperEx1 {

	public static void main(String[] args) {
		Integer i = new Integer(100); // 객체생성
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ?" +(i==2)); // false 등가비교주소비교
		System.out.println("i.equals(i2) ? " +i.equals(i2)); //true 내용비교
		System.out.println("i.compareTo(i2)=" +i.compareTo(i2)); // 숫자열 비교시 단순히 크다(1), 같다(0), 작다(-1) 
		//문자열 비교시 아스키값s
		System.out.println("i.toString()="+i.toString()); //100

	}

}
/*"abcd" 와 "c" 를 비교해줄 경우 첫번째 위치에서 비교가 실패했기 때문에

"a" 와 "c"의 아스키코드 값의 차이값을 리턴해준다.*/