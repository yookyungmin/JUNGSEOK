package Ch8;

public class Ex8_okdong {

	public static void main(String[] args) {
     String[] meetingLiSt = {"원빈", "현빈", "옥동자", "브레드", "홍길동"}; 

     try {
    	 for(int i=0; i<meetingLiSt.length; ++i) {
    		 if(meetingLiSt[i].equals("옥동자")) {
    			 throw new Exception("폭탄해체!!"); //옥동자가 까지 반복되면 폭탄해체
    		 }else {
    			 System.out.println("인생은 아름다워"); // 옥동자가 나올대까지 인생은 아름다워
    		 }
    	 }
    	
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
		
//// 홍길동 발견해서 e객체가 생성됨
// e가 매개변수로 캐치함수로 가서
//e에 저장된 메시지 출력하능 코드 탐
/*이 코드 기준으로 배열에서 가져온 데이터가 홍길동이 아니라면 인생은 아름다워가 나오겠죠
미팅리스트 0~3번까지는 홍길동이 아니라서 인생은 아름다워가 출력된거고
미팅리스트[4]의 경우 홍길동이라서 익셉션이 발생한거고 폭탄해체 메세지가 출력된겁니다*/