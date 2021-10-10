package ch6;

class Car{
	String color; // 색상
	String gearType; // 변속기 종류 - auto자동 manual수동
	int door;

	Car() { //
	this("white", "auto", 4); //Car(String color, String gearType, int door) 호출
	}

	Car(String color) { 
	this(color, "auto", 4);
	}
	/*
	Car(String color, String gearType){
	this(color, gearType, 4);	
	}  //이렇게하면 gearType도변경가능
	*/

	/*
	Car(String c) { 
	this(c, "auto", 4);
	}  //이렇게도 가능
	*/
	
	Car(String color, String gearType, int door) {
	this.color = color;
	this.gearType = gearType;  // 인스턴스 변수 = 지역변수 //this. 없으면 둘다 지역변수 매개변수 이름과 변수의 이름이 동일해서
	this.door = door;
	}
}
	class CarTest2{
	
	public static void main(String[] args) {

	Car c1 = new Car();
	Car c2= new Car("blue");

	System.out.println("c1의 color= " +c1.color+ ", gearType= " +c1.gearType+", door = "+c1.door);
	System.out.println("c2의 color ="+c2.color+", gearType= "+c2.gearType+", door = "+c2.door);
}
}