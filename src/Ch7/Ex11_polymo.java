package Ch7;
//다형성 Tv t(조상) = new SmartTv();(자손)
// 다형성장점 다형적 매개변수, 하나의 배열에 여러종류 객체저장 
// 참조변수의 형변환 - 리모컨바구기, 사용가능한 멤버 갯수조절
//instanceof 형변환 가능여부확인



class Tv{ // 부모 조상
	boolean power; // 전원상태(on/off
	 int channel; // 채널
	 
	 void power() {power = !power;}
	 void channelUp() {++channel;}
	 void channelDOWN() {--channel; }   
}

class SmartTV extends Tv{ //자손
	String textString; // 캡션 자막을 보여주기한 위한 문자열
    void caption( ) {/*내용생량*/}
    //Tv 멤버 = power(), power, channerlUp(),channelDown(), channel
    //smrarTTV멤버 = caption(), text  // Tv멤버 포함해서 총 7개
}



public class Ex11_polymo {
	public static void main(String[] args) {
		
	}

}
