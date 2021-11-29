package Ch7.gettersetter;


	class stat {
	private int power;  //힘
	private int dex;//민첩
	private int intel;//지능
//은 private로 직접적인 접근을 할 수 없도록 막고, getter/setter메서드를 통해서만 접근할 수 있도록 제한할 수 있다 게터 세터
//객체들의 데이터(필드)를 외부에서 직접적으로 접근하는 것을 막아놓습니다

	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		if(power <0) {
			this.power = 0;
		}else {
			this.power = power;
		}
	}
	//0 미만의 값이 들어갈 경우 버그가 생기지 않도록 
	//해당 값을 0으로 초기화 시킴
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		if(dex<0) {
			this.dex=0;
		}else {
			this.dex = dex;
		}
	}

	public int getIntel() {
		return intel; 
		} 
	public void setIntel(int intel) { 
		if(intel < 0) {
			this.intel = 0; 
			}else { this.intel = intel; 
			} 
		}

	
}

public class Test {

	public static void main(String[] args) {
		stat character = new stat();

		character.setPower(999);
		character.setDex(999);
		character.setIntel(90);
		//setter 메소드를통해 스탯별 능력치배분
		//, 필드 값에 직접 데이터를 입력하는 것이 아닌,
		//setter메서드를 사용하여, 값을 초기화시켜주는 방식이다.


		
	System.out.println("나의 힘 능력치는 = "+character.getPower());
	System.out.println("나의 민첩 능력치는 = "+character.getDex());
	System.out.println("나의 지능 능력치는 = "+character.getIntel());
	}
	//getter 메서드를 통해 해당 필드 값을 가져오는 방식을 사용한다.



}
