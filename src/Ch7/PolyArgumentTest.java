package Ch7;
class Productt{ 
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는  보너스점수
	
	Productt(int price) {
	this.price = price; // this.price 인스턴스 변수 = price; 매개변수
	bonusPoint = (int)(price/10.0); //보너스 점수는 제품 가격의 10%
}
}

	class Tvv extends	Productt{
	Tvv(){
	//조상 클래스의 생성자 Product(int price)를 호출한다.
	super(100); // TV가격을 100만원으로 한다.
	}
	//Object클래스의 toString() 을 오버라이딩 한다.
	public String toString() { return "TV";}
}
	class Computerr extends Productt{
	Computerr() {
	super(200); //컴퓨터 가격
	}
	public String toString() {return "Computer";} // 출력값에서 나오는 문장
}
	class Buyerr{ //고객 , 물건을 사는남자
		int money = 1000; // 소유금액
		int bonusPoint = 0; //보너스점수
	
	void buy(Productt p) {
	if(money <p.price){
	System.out.println("잔액이 부족하여 물건을 살수 없습니다");	
	return;
	}
	money -= p.price; // 가진 돈에서 구입한 제품의 가격을뺀다.
	bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
	System.out.println(p+"을 / 를 구입하셨습니다");
	}
}

	class PolyArgumentTest{
		public static void main(String[] args) {
		Buyerr b = new Buyerr();

		b.buy(new Tvv());
		b.buy(new Computerr());

	System.out.println("현재남은 돈은 " + b.money + "만원입니다 " );
	System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
	}

}