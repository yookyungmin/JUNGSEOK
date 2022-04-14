package Chapter3;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Operator {
	public static void main(String[] args) {
		boolean b= true;
		char ch= 'f';
		int c=5;
		
		System.out.printf("'a'>ch || ch>'z'= %b\n", 'a'>ch || ch>'z');
		System.out.printf("100>c && c<55 = %b\n", 100> c&&c<55); //100은 c보다 크고 또는  c는 55보다 작다
		System.out.printf("!('a'<= ch && ch<='z')= %b\n", 'a'<=ch && ch<='z');
		System.out.printf("c%%2==0 || c%%3==0 %b\n", c%2==0 || c%3==0); //c는 2의 배수 그리고 3의 배수이다
	}
}
