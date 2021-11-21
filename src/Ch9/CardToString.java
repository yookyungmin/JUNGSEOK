package Ch9;


class Card{
	String kind;
	int number;
	
	Card(){
		this("Spade",1);// 기본값
		
		}
	
		Card(String kind, int number){
			this.kind = kind;
			this.number = number;
		}
		
		public String toString() {
			return "kind : "+kind+", number : "+number; //Card 인스턴스의 kind와 number을 문자열로 변환 없으면 해쉬코드로 나옴 
		}
}



public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
