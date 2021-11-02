


public class FighterTest {

	public static void main(String[] args) {
	Fighter f = new Fighter();
	
	if(f instanceof Unit) {
		System.out.println("f는 Unit클래스의 자손입니다");
	}
	if(f instanceof Fightable) {
		System.out.println("f는 Fightable인터페이스를 구현했습니다");
	}
	if(f instanceof Movable) {
		System.err.println("f는 Movable 인터페이스를 구현했습니다");
	}
	if(f instanceof Attackable) {
		System.out.println("f는 Attackable인터페이스를 구현했습니다");
	}
	if(f instanceof Object) {
		System.out.println("f는 Object 클래스 자손입니다"); //인터페이스는 object와 같은 최고조상이 없는데 클래스이기떄문에 존재
	}
	

	}

}

class Fighter extends Unit implements Fightable { // 상속과 구현을 동시에
	public void move(int x, int y) {/*내용 생략*/}
	public void attack(Unit u) {/*내용생략*/}
	//오버라이딩 시 조상의 메서드보다 넓은 범위의 접근제어자를 지정해야하기때문에 public abstract가 생략 되어 있기 때문에public 으로 해줘야함 
}

class Unit { //클래스
	int currentHP;// 유닛의체력
	int x; // 유닛의 위치(x좌표)
	int y; // 유닛의 위치(y좌표)
}

interface Fightable extends Movable, Attackable{} // 인터페이스 상속
interface Movable{ void move(int x, int y); }
interface Attackable{ public abstract void attack(Unit u);}