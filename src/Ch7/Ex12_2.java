
package Ch7;
public class Ex12_2 {

	
	// instanceof 형변환 전  반드시 확인
	void dowork(Car c) { // new Car();, new FireEngine(); , new Ambulance(); 사용 가능
		if(c instanceof FireEngine) { // 형변환이 가능한지 확인
			FireEngine fe = (FireEngine)c; //형변환
			fe.water();	
		}
		else if (c instanceof Ambulance) {
				Ambluance a= (Ambulance)c;
				a.siren();
			}
			
	}
	


	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof Object);  // true   
		System.out.println(fe instanceof Car);// true
		System.out.println(fe instanceof FireEngine);// true
		// FE > CAR > Object (최고조상)
 
		 Object object = (Object)fe;
		 Car car = (Car)fe;
		
		
	}

}
