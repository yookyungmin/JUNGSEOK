package BAEKJOON;


import java.io.StringReader;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		

		char grade = ' ';
		System.out.print("점수 입력 : ");
		
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		
		if (score >100) {
			System.out.println("100점이 넘을순 없다");
			System.out.println("점수를 다시 입력 하세요");
			score = sc.nextInt(); // 다시 입력
			
		}
		if(score>=90&& score<=100) {
			grade = 'A';
		}
		else if (score>=80&&score<=89) {
			grade = 'B';
		}
		else if (score>=70) {
			grade = 'C';
		}
		else if (score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
			
		}
		System.out.printf("당신의 학점은 %c입니다",grade);
		
	}
}


