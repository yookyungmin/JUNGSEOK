package ch6;

class Car {
	String color; // 색상
	String gearType; //변속기 종류 auto자동 manual수동
	int door; //문의 개수

	Car() {} //기본 생성자
	Car(String c, String g, int d){
	color = c;
	gearType = g;
	door = d;
}
}

class CarTest{
	public static void main(String[] args){
	
	Car c1 = new Car(); //기본생성자 있어야 함
	c1.color = "white";
	c1.gearType = "auto";
	c1.door = 4;

	Car c2= new Car("white", "auto", 4); // 기본생성자 없이 가능 클래스에 매개변수가 있는 생성자가 있기때문에

	System.out.println("c1 의 Color=" + c1.color+", gearType= "+c1.gearType+", door = "+c1.door);
	System.out.println("c2 의 Color=" + c2.color+", gearType= "+c2.gearType+", door = "+c2.door);

}
}	
