import java.util.Scanner;


public class IFONif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 0;
		char grade = ' ', opt = '0';  
		
		
		
		System.out.print("점수를 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
		
		
		System.out.printf("당신의 점수는 %d입니다.\n", score);

		if (score >=90){
			grade = 'A';      // score 90 점 보다 같거나 크면 A학점
			
			if (score>=98) {   //90 점 이상중에서도 98 점 이상 A+
				opt = '+';
			}  else if (score <94)   // 90점 이상 94미만은 A-
				opt = '-';
		
		}   else if (score >=80) {   //score 80점보다 같거나 크면 B학점
			grade = 'B';
			 if (score >=88) {
			   opt = '+';
		   }
			 else  if (score >=84) {
			   opt = '-';
			   
		   }
		} else {
			grade = 'C';
		}
		
		
		System.out.printf("당신의 학점은 %C%C입니다. \n", grade, opt);
	}

}
