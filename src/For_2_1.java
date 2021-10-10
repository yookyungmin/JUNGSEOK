public class For_2_1 {

	public static void main(String[] args) {
		int i = 1;  // scope 범위  // 선언위치부터 선언된 블럭의 끝까지
		
		for   (i=1; i<=10 ; i++) {  // {}안의 문장을 10번반복 // i=i+2, i+=2(2씩증가), i*=3(3배씩증가) i--=(1씩감소
			
             System.out.println("i="+i);
	}
		   //System.out.println(i);

}
}
