package ch6;

 //매개변수가 있는 생성자
class Car{
	String color; // 색상 
	String gearType; //변속기 종류
	int door; // 문의 개수        //IV 들


	
	Car() {} //기본생성자 
	
	Car(String c, String g, int d){ // 매겨변수가 있는 생성자 
		color = c;
		gearType = g;
		door = d;  //iv들
	}
}

public class ch11_2 {

	public static void main(String[] args) { 
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType ="auto";
		c1.door = 4;  // IV들       // Car c = new Car("while", "auto",4); /로 축소가능
		
		Car c2 = new Car("white", "auto", 4); 
		System.out.println("c1의 color = " +c1.color + ", geartype = "+c1.gearType+", door ="+c1.door);
        System.out.println("c2의 color = " +c2.color + ", geartype = "+c2.gearType+", door ="+c2.door);
	}

}
