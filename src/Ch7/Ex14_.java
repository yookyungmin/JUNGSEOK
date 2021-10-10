package Ch7;
//추상클래스 

	abstract class  player { // 추상 클래스 (미완성 클래스, 미완성 메서드)
       abstract void play(int pos); //추상메서드 (미완성매서드)
       abstract void stop (); //추상메서드(선언부만 있고 몸통{}구현부가 없는 메서드
	}
	
	
	 //추상클래스는 상속을 통해 완성해야 객체 생성가능
	 class Audioplayer extends player {
		void play (int pos){
		System.out.println(pos + "위치부터 play합니다.");
		}
		void stop() {
			System.out.println("재생을 멈춥니다");
		}

		 
//				 조상 추상 클래스의 일부만 구현하면 오류가 난다, 그래서 abstract 붙여주거나
//	    abstract class Audioplayer extends player {
//				void play (int pos){
//				System.out.println(pos + "위치부터 play합니다.");
//				}
//		       void stop() { System.out.println("재생을 멈춥니다");
		 }  //아래에 audioplayer 객체 생성 불가 
		
		
	
//	}
	
	
	public class Ex14_ {
	public static void main(String[] args) {
//		player p = new player(); // 추상클래스는 미완성이라 객체생성 불가, 자손 상속통해 생성가능 
//       Audioplayer ap = new Audioplayer(); // 추상 클래스의 객체를 생성
		player ap = new Audioplayer(); // 다형성 //player ap 리모컨
       
       ap.play(100);
       ap.stop();
       
	}

} 
