package Ch7;


	 class Tv{
		 boolean power; // 전원상태 on/off
		 int channel; //채널
		 
		 void power()  {power = !power;}
		 void channelUp() {++channel;}
		 void channeldown() {--channel;} // 부모멤버 5개
	}
	
	class SmartTv extends Tv{ // smarttv 는 tv에 캡션(자막)을 보여주는 기능
	boolean caption;                      //캡션상태 ON/OFF
	void displayCaption(String text) {
		if (caption) {           //캡틴 상태가 ON()일때만 TEXT를 보여준다
			System.out.println(text); //자식멤버 두개 // 총 부모+자식 = 총7개  
		} 
	}
	}

   class Ex7_ {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10; // 조상 클래스로부터 상속받은 멤버
		stv.channeldown();// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption = true; //캡션(자막) 기능을 켠다
		stv.displayCaption("Hello, world");
		
		

	}

}
