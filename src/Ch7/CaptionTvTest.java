package Ch7;


class Tv{
	boolean power; // 전원 상태 on/off
	int channel; //채널

	void power() { power=!power; } 
	void channelUp() { ++channel; }
	void channelDown() {--channel;}  //부모 멤버 5개
}

	class CaptionTv extends Tv{ // 상속
	boolean caption; //캡션상태 on/off
	void displayCaption(String text) { //자손 멤버 두개
		if(!caption) { //캡션 상태가 on(true일떄만) text를 보여준다
			
			System.out.println(text); 
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
	CaptionTv ctv = new CaptionTv(); //자손 객체생성
	ctv.channel = 10; //조상 클래스로부터 상속받은 멤버
	ctv.channelUp(); //조상클래스로부터 상속받은 멤버
	System.out.println(ctv.channel);
	ctv.displayCaption("Hello , world");
	ctv.caption=true; // 캡션(자막)기능을 켠다
	ctv.displayCaption("Hello, world");

	}

}
