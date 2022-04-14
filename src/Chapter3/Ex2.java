package Chapter3;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 증감연사자 전위형 후위형 // 부호연산자
		
		
   		int i=5, j=0;
		
		j= i;  //후위형 아래로 분리  //j=i++;
		i++;
	
		System.out.println("j=i++; 실행 후, i="+ i + ", j=" + j); //6 , 5
		
		i=5;
		j=0;
		
		++i;
 		j= i; // 전위형 위로 분리  j=++i;
		
		System.out.println("j=++i; 실행 후, i="+ i + ", j=" + j); // 6, 6
		
		
		

		
		/*int i = -10;
		i=+i;  // + 피연산자의 부호 변화 x
		
		System.out.println(i);
		
		
		i = -10;
		i=-i;  // -피연산자의 부호를 반대로 변경
		
		System.out.println(i);*/
		
		
	}

}
