package Ch9;

import java.util.ArrayList; // ctrl shift o import문추가 
//오토박싱 언박싱
public class Ex9_wrapper2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // ArrayList<< 객체만 저장가능
		list.add(100); // jdk 1.5 이전엔 에러 // 아래로 자동으로 바꿔줌  오토박싱
		// 100< 기본형 저장가능
		list.add(new Integer(100)); // list 에는 객체만 추가가능
		 
		// Integer >> intValue(), valueOf() >>int 로 변환 언박싱
		
//		Integer i = list.get(0); // list 에 저장된 첫번째 객체를 꺼낸다.
		//ist.get(0); = new Integer(100)
//		 int i = list.get(0).intValue();  //intValue()로 Integer를 int로변환
		 int i = list.get(0); // 위와 동일한 의미 컴파일러가 자동으로 위와 바꿈 언박싱
		 
		 // 기본형인지 래퍼클래스인지 신경안써도 된다? 왜 컴파일러가 자동으로 변환하는코드를 넣어줌 그것이 오토박싱, 언박싱
         //오토박싱, 언박싱은 자바의 원칙이 바뀌는게 아니라 프로그래머가 쉽게 개발할수 있게 컴파일러 코드를 추가 해주는것
	}

}
