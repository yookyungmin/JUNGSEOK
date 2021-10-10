package ch6;

class Ex6_3 {
	public static void main(String args[]) {
		System.out.println("Card.width=" + Card.width); /*CV는 객체생성없이 사용 가능 */
		System.out.println("Card.height=" + Card.height);
		
		Card c1 = new Card();    
		c1.kind = "Heart";
		c1.number = 7;     //객체1  iv
		
		Card c2 = new Card();
		c2.kind = "Spade"; // 인스턴스변수값을
		c2.number = 4;     // 생성한다   /객체 2
		
		 
		System.out.println ("c1은 " + c1.kind +", "+c1.number+ "이며, 크기는 ("+ c1.width + ", "+c1.height+") ");
		
		System.out.println ("c2은 " + c2.kind +", "+c2.number + "이며, 크기는 ("+ c2.width + ", "+c2.height +") ");
		System.out.println ("c1의 width와 height를 각각 50, 80으로 변경합니다");
		
		Card.width  = 50;  // 클래스의 변수값을   cv는 앞에 참조변수를 써도 되지만 클래스이름을 붙여준다
		Card.height = 80;  //변경한다     //cv // c1꺼만 바꼈는데 c2도 바뀜 그래서 헷갈리지 않게 card로 넣어줌
		
		System.out.println ("c1은 " + c1.kind +", "+c1.number+ "이며, 크기는 ("+ c1.width + ","+c1.height +") ");
		
		System.out.println ("c1은 " + c2.kind +", "+c2.number+ "이며, 크기는 ("+ c2.width + ", "+c2.height +") ");
		
		
	}
}

	class Card {
		String kind;
		int number;
		static int width = 100;
		static int height = 250;  //cv
}
	
	

