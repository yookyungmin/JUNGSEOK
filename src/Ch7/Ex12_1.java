package Ch7;

public class Ex12_1 {

	public static void main(String[] args) {
//		Car c = new Car();   //객체생성   4개짜리 객체
//		FireEngine fe = (FireEngine)c;//ClassCastException 형변환에러
//		fe.water(); // 컴파일 ok 객체 Car에는 4개 객체이데 water 가 없어서 에러
		
		//참조변수들이 가리키는 실제 인스턴스가뭔지 확인하고,, 객체생성된 그 멤버수를 초과되면 안됨
		 
		
		

		
		/*Car car = null;  // 참조변수 car  
		FireEngine fe = null;    // 형변환 시 실제 인스터스가 무엇인지  중요
		
		FireEngine fe2 = (FireEngine)car; // 조상 > 자손으로 형변환
		Car Car2 = (Car)fe2;              // 자손 >> 조상으로 형변환
		Car2.drive(); //.NullPointerException 에러발생 발생 // 아무 객체가 없는데 drive라는 것을 호출함*/
		
		
		/* 		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); //fe 가의 water 객체 호출
		car = fe; // car = (Car)fe; 조상<자손 에서 형변환 생략됨
		//car.water() // car타입에서 참조변수로는 water()를 호출할수 없다.
		fe2 = (FireEngine)car; // 자손타입 < 조상타입 형변환 생략불가
		fe2.water(); */

	}

}
class Car{ //조상클래스
	String color;
	int door; 
	
	void drive() { //운전기능
		
		System.out.println("drive, brrr~");
	}
	void stop() { //멈추는 기능
		System.out.println("stop~!!");
	 
		//멤버Car4개
	}
}

class FireEngine extends Car{  //상속  
	void water() { //물을 뿌리는 기능
		System.out.println("water!!"); 
		//FireEngine멤버 5개 / car 4개 + water
	}
}