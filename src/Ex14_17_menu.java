import java.util.*;
public class Ex14_17_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		
		while(true) { // 무한반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료 : 0)>");
			
			String tmp = scanner.nextLine(); //화면에 입력받은 내용을 tmp에 저장
			menu= Integer.parseInt(tmp);// 입력받은 문자열 tmp를 숫자로변환
			 
			if(menu==0) { //0이면 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <=3)) {// 메뉴 1~3 아닌걸로 골랐다 ! = 부정
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는"+menu+"번입니다.");
		}
	}

}
