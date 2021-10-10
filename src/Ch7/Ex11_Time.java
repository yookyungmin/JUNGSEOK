package Ch7;
// 캡슐화 외부로부터 데이터를 보호가위해 , 외부에는 불필요한 사용되는, 부분을 감추기위해
class Time{
	private int hour;  // 0~23사이의 값을 가져야함 시간이라      int = -20억~+20 억 
	private int minute;
	private int second;

   public void setHour(int hour) {
	   if(isNotValidHour(hour) ) return; // 0보다 작거나 23보다 크면 빠져나간다 //hour < 0 || hour > 23 = isNotValidHour(hour) ,altshiftm 메서드 생성 
	   this.hour = hour; // fales 일때
	   
   }

// 매개변수로 넘어진 hour 가 유효한지 확인해서 알려주는 메서드
   private boolean isNotValidHour(int hour) {   // private면 class에서만 확인가능 접근제어자 범위를 최소화해서 넓히는게 좋음
	return hour < 0 || hour > 23;
}

   
   public int getHour() {return hour;};
}


public class Ex11_Time {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 25;
		t.setHour(21); // hor의 값을 21로 변경
		System.out.println(t.getHour());
 
	}

}
  