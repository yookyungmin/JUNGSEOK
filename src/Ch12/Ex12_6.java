package Ch12;

enum Directions { // 열거형 Directions 선언
	EAST(1, ">"), SOUTH(2,"V"), WEST(3, "<"), NORTH(4, "^"); // 상수들은 값을 두개갖는다
	
	private static final Directions[] DIR_ARR = Directions.values();
	private final int value; // 위에 상수들 값이 두개씩 들어가서 두개씩 선언 
	private final String symbol; //> V < ^  IV 인스턴스변수
	
	Directions(int value, String symbol){ // 생성자 접근제어자 private 생략됨
	this.value = value;
	this.symbol = symbol;  // 생성자
}// 열거형 Directions 선언
	
	public int getValue() {return value;}
	public String getSymbol() {return symbol;} // IV 값들 반환
	
	public static Directions of(int dir) { // of라는 메서드를 이용해 위에 상수들중에 하나를 얻어올수잇음
		if(dir<1 || dir>4) { // 0~3범위를 벗어나면 예외발생
				throw new IllegalArgumentException("Invalid value :"+dir);
		}
		return DIR_ARR[dir -1];
	}

// 방향을 회전시키는 메서드. num값만큼 90도씩 시계방향으로 회전한다.
	public Directions rotate(int num) {
		num = num % 4;
		if(num<0) num+=4; // num이 음수일떄는 시계반대 방향으로 회전
		return DIR_ARR[(value-1+num)%4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}
}// enum Direction

public class Ex12_6 {

	public static void main(String[] args) {
		for(Directions d : Directions.values()) //values = 열거형이 가진 모든 상수를 모두반환
			System.out.printf("%s=%d%n",d.name(),d.getValue()); // d.ordinal()로 하면 0123 출력됨
		
		Directions d1= Directions.EAST;
		Directions d2= Directions.of(1);
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(Directions.EAST.rotate(1)); // 동서남북 회전
		System.out.println(Directions.EAST.rotate(2));
		System.out.println(Directions.EAST.rotate(-1));
		System.out.println(Directions.EAST.rotate(-2));

	}

}