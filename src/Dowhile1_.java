import java.util.Scanner;

public class Dowhile1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //블럭{} 최소한 한번 이상 반복 - 사용자 입력받을떄 유용
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1; // 1~100 사이의 임의수를 저장
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1과 100사이의 정수를 입력하세요.>");
		input = scanner.nextInt();
		
		while(input!=answer){
			System.out.print("1과 100사이의 정수를 입력하세요.>");
		input = scanner.nextInt();
		
			 if(input>answer) {
				System.out.println("더 작은 수를 다시 시도해보세요.");
			} else if (input<answer) {
				System.out.println("더 큰수로 다시 시도해보세요.");
			}
	
			
		} 
		
		System.out.println("정답입니다.");
	}  

}
