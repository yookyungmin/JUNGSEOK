package Ch7;

import javax.swing.plaf.synth.SynthScrollPaneUI;

abstract class playerr {
	 abstract void play(int pos); // 추상 클래스 안의 추상메서드  미완성

	 abstract void stop(); // 추상메서드 
 }
 
 	class Audioplayerr extends playerr{
 		void play(int pos) {
 			System.out.println(pos+"채널을 출력합니다");
 			System.out.println(pos+"위치부터 play합니다");
 		}
 		void stop() {
 				System.out.println("재생을 멈춥니다");
 		}
 		public String toString() {
 			return "asdasdasdas"; 
 		}
 	}
 	
 		
 	public class PlayerTest {

	public static void main(String[] args) {
		//		playerr p = new playerr();// 에러 추상클래스는 객체를 생성못하여, 추상클래스를 상속받은 클래스로 객체생성r
			Audioplayerr ap = new Audioplayerr();
//			playerr ap = new Audioplayerr(); // 가능 다형성 조상 객체로 자손 인스턴스참조 
			ap.play(5);
			ap.stop();
			ap.toString();
			System.out.println(ap.toString());
			
		
			
	}
//추상 클래스를 상속 받을때 메서드 다 구현을 안해주면 class 앞에 abstract 붙여줘야 됨
	}
