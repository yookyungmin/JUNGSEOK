package Market;



class Productt{ 
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는  보너스점수
	
	Productt(int price) {
	this.price = price; // this.price 인스턴스 변수 = price; 매개변수
	bonusPoint = (int)(price/10.0); //보너스 점수는 제품 가격의 10%
}
	
}

	class Tvv extends Productt{
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
	class Phonee extends Productt{
		Phonee(){
			super(50); // 폰의 가격 50
	
		}
		public String toString() {
			return "Phonee이다";
		}
	}
	
	
	class Buyerr{ //고객 , 물건을 사는남자
		int money = 1000; // 소유금액
		int bonusPoint = 0; //보너스점수
		
		Productt[] cart = new Productt[10]; //구입한 물건을 담을 배열 
		int i = 0; //
	
	void buy(Productt p) {//Productt의 p 참조변수
	if(money <p.price){
	System.out.println("잔액이 부족하여 물건을 살수 없습니다");	
	return;
	}
	money -= p.price; // 가진 돈에서 구입한 제품의 가격을뺀다.
	bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
	cart[i++] =p; //카트에 저장  int i = 0;
	System.out.println(p+"을 / 를 구입하셨습니다"); // p, p.toString() 같음
	}
	
	void Summary() { //구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum= 0;  //구입한 물품의 가격 합계
		String itemList = " ";	//구입한 물품목록
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum+=cart[i].price;
			itemList += cart[i].toString() +","; //cart[i]
		}
		System.out.println("구입하신 물품의 총 금액은" + sum + "만원입니다");
		System.out.println("구입하신 제품은"+itemList+"입니다");
	}
}  // buyer 클래스

	class PolyArgumentTest{
		public static void main(String[] args) {
		Buyerr b = new Buyerr();

//		Productt p = new Tvv();
//		b.buy(p); //아래한줄과 같다
		b.buy(new Tvv()); // buy(Product p) // 한줄로 쓰면 참조변수가 없어서 메인에서는 Tvv사용할수 없다 buy메소드에선 사용가능
		b.buy(new Computerr()); // buy(Product p)
		b.buy(new Phonee());
		b.Summary();

	System.out.println("현재남은 돈은 " + b.money + "만원입니다 " );
	System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
	}

}