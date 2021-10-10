package Ch7;

//class Car{
//	String color;
//	int door;
//	
//	void drive() { //운전기능
//		
//		System.out.println("drive, brrr~");
//	}
//	void stop() { //멈추는 기능
//		System.out.println("stop~!!");
//	}
//}
//
//class FireEngine extends Car{
//	void water() { //물을 뿌리는 기능
//		System.out.println("water!!");
//	}
//}
 
public class Ex12 {

	public static void main(String[] args) {
		FireEngine f = new FireEngine();
		
		Car c= (Car)f; // ok. 조상인 car타입으로 형변환(생략가능)
		FireEngine f2 = (FireEngine)c; // ok. 자손인 fireengine 타입으로 형변한(생략불가)
//		Ambulance a = (Ambulance)f; //에러 // 상속관계가아 아닌 클래스 간의 형변환 불가
		

	}

}
