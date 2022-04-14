package Chapter3;
public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//형변환
		
		char a = 'A';
		System.out.println((int)a); // a= 65 
		
		float b = 1.6f;
		System.out.println((int)b); // 실수>정수 1 소수점 사라짐 반올림x
		
		int c = 50;
		System.out.println((float)c); // 정수 > 실수 50.0 소수점 생김
		
		float f = 1234; // 1234 int 작은족에서 float 큰쪽으로 가니 에러x // 자동형변환
		
		System.out.println((float)f); 
		
		
		
		
		int i =(int)3.14f; // int i = 3.14f는 에러 큰쪽float3.14에서 int i로 가려니 수동형변환 한것
		
		System.out.println(i); 


	}

	

}
