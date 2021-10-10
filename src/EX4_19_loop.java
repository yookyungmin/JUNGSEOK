public class EX4_19_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//for 문에 look1이라는 이름을 붙였다.
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==4)
					//break Loop1; // 두개의 for 문 다 벗어남   
					break; 
			System.out.println(i+"*"+j+"="+i*j);
			
			}
			System.out.println();
		}
	}

}
