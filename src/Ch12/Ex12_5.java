package Ch12;
enum Direction { EAST, SOUTH, WEST, NORTH }

class Ex12_5 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST; // 열거형타입.정수이름 // 열거형타입 변수에 상수 EAST 저장
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);

		System.out.println("d1==d2 ? "+ (d1==d2)); //FALSE
		System.out.println("d1==d3 ? "+ (d1==d3)); //TRUE
		System.out.println("d1.equals(d3) ? "+ d1.equals(d3));
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러 //객체라서 비교연산자불가
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));

		switch(d1) {
			case EAST: // Direction.EAST라고 쓸 수 없다.
				System.out.println("The direction is EAST."); break;
			case SOUTH:
				System.out.println("The direction is SOUTH."); break;
			case WEST:
				System.out.println("The direction is WEST."); break;
			case NORTH:
				System.out.println("The direction is NORTH."); break;
			default:
				System.out.println("Invalid direction."); break;
		}

		Direction[] dArr = Direction.values(); //열거형의 모든상수를배열로반환

		for(Direction d : dArr)  // for(Direction d : Direction.values()) 
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); //Ordinal 순서 값x	
		
	}
}