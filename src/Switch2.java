 import java.util.Scanner;


public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보
		//스위치
		// math random 0.0과 1.0 사이의 임의의 double 값을 반환 
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner =new Scanner(System.in);
		int user = scanner.nextInt();  //화면을 통해 입력 받은 숫자를 user에 저장
		int com= (int)(Math.random()*3) + 1; // 1,2,3 중 하나가 com에저장
		
		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴은" + com + "입니다.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
		   	break;
		case 0:
			System.out.println("비겼습니다.");
		//break;
			
		}

	}

}
