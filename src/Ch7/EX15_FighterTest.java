package Ch7;

import java.io.ObjectInputStream.GetField;

abstract class Unit2 {
	 int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");
	}  
}

interface Fightable { // 인터페이스의 모든 메서든는 public abstract 예외없이
	void move(int x, int y); //public abstract 생략
	void attack(Fightable f); //public abstract 생략
}

class Fighter extends Unit2 implements Fightable {
	// 오버라이딩 규칙, 조상(public)보다 접근제어자가 좁으면 안된다
	
	public void move(int x, int y) {   //구현할떈 public 필수
		System.out.println("["+x+","+y+"]로 이동"); //메인함수의f.move(100, 200);
	}   
	
	public void attack (Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	//싸울수 있는 상대를 불러온다
	Fightable getFightable() { //반환 타입이 인터페이스라는것은 이 인터페이스를 구현한 것을 반환
		Fighter f  =  new Fighter(); // Fighter 를 생성해서 반환
		return (Fightable)f; // (Fightable)생략
	}
}

public class EX15_FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter(); 
		Fightable f2 = f.getFightable();
		
		
		
////		Fighter f = new Fighter(); 
////		Unit2 f= new Fighter(); //unit2에는 attack() 없어서 호출불가 move가능
//		Unit2 u= new Fighter();
//		u.move(100, 200); 
//		u.stop();
//		
//		Fightable f = new Fighter();
//		
//		f.move(100, 200);
//		
//		
//		
////		f.attack(new Fighter());
//		//위아래 동일
//		Fighter f2 = new Fighter();
//		f.attack(f2); // 
////		f.stop(); // Fightable에는 stop()이없어서 호출불가
//		

		
	}

}
