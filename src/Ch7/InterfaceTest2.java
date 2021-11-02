package Ch7;

class AA {
	void autoPlay(II i) { //인터페이스 I를 구현한 놈들만들어와라
		i.play();
	}
}
//선언과 구현을 분리
interface II { //인터페이스 작성
	public abstract void play(); // 추상메서드
}
class BB implements II{
	public void play() {
		System.out.println("play in B class");
	}
}
//
class CC implements II{
	
	
	public void play() {
		System.out.println("play inc c Class");
	}
}


public class InterfaceTest2 {

	public static void main(String[] args) {
		AA aa = new AA();
		aa.autoPlay(new BB()); //void autoPlay(I I)를 호출
		aa.autoPlay(new CC());

	}

}
