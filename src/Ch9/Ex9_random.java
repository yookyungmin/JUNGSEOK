package Ch9;

import java.util.Random;

public class Ex9_random {

	public static void main(String[] args) {
		Random rand = new Random();
		Random rand2 = new Random(2);
		Random rand3 = new Random(3);
		
		System.out.println("rand 값은 항상 다른값");
		
		
		for(int i=0; i<5; i++) {
			int num =Math.abs(rand.nextInt()%10)+1; //1~10까지
			System.out.println(num);
		
		}
		System.out.println();
		System.out.println("rand2의 값은 항상 똑같은 값 종자 (seed)값");
		for(int i=0; i<5; i++) {
			int num =Math.abs(rand2.nextInt()%10); //1~9까지
			System.out.println(num);
		}
		System.out.println("==rand3===");
		for(int i=0; i<5; i++) {
			
			
			
			System.out.println(i +":"+rand3.nextInt());
		}
		
		

	}
}


