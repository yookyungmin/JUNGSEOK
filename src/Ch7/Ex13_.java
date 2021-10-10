package Ch7;
//매개변수의 다 형성  
// 장점, 다형적 매개변수, 하나의 배열로 여러종류 객체다루기

class Product{
	int price; // 제품의 가격
	int bonusPoint; //제품구매시 제공되는 보너스 점수

	Product(int price) { //조상 생성자 매개변수 int price
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스 점수는 제품가격의 10%
	}
}

class Tvt extends Product {
	Tvt() {
		//조상 클래스의 생성자 product (int price )호출
		super(100); // tv의 가격을 100만원으로 한다 //조상의 생성자 매개변수에
	}
	//Object 클래스의 toString ()오버라이딩한다
	public String toString( ) {return "Tvt";}  //tv를 사면 tv 반환 = 함수끝
}

class Computer extends Product{
	Computer () {super(200);} //컴퓨터가격 200
	public String toString() {return "Computer";} //컴퓨터 사면 컴퓨터 반환 = 함수끝
  
}
class Buyer {    //고객, 물건을 사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; //보너스 점수
 
	void buy (Product p) {  // new tv new computer new audio
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -=p.price; // 가진 돈에서 구입한 제품의 가격을뺀다
		bonusPoint +=p.bonusPoint; // 제품의 보너스를 추가
		System.out.println(p.toString() + "을/를 구입하셨습니다");
//		System.out.println(p + "을/를 구입하셨습니다"); //참조변수 + 문자열 결합은 참조변수의 tostring을호출해서붙임위와동일 
	}
}

public class Ex13_ {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Product p = new Tvt();
		b.buy(p);
//		b.buy(new Tvt()); //buy(Product p)  // 위 두문장과 동일 
		// 생성하고 바로 넘겨서 참조변수가 없다 / 참조변수 없이 직점 넣으면 메인메소드에서 사용할수 없다
		
        b.buy(new Computer()); //buy(Product p)
        

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}

}
