import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 0; // 점수를 저장하기 위한 변수
		char grade = 'D'; // 학점을 저장하기 위한 변수, 공백으로 초기화 // D 학점 생략 가능
		
		System.out.print("점수를 입력하세요. >");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
		
		if (score>=90) {  //score가 90점보다 같거나 크면 a학점
			grade = 'A';
		} else if (score >= 80) { 
			grade = 'B';             //80점보다 같거나 크면 B
		}   
		else if (score >=70) {    // 70점보다 같거나 크면 C
			grade = 'C';
		}
//		else {
//			grade = 'D';       //나머지는 D학점
//		}
              System.out.println("당신의 학점은" + grade + "입니다.");
	}

}
