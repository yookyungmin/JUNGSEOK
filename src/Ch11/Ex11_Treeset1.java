package Ch11;

import java.net.MulticastSocket;
import java.util.TreeSet;

public class Ex11_Treeset1 {

	public static void main(String[] args) {
			TreeSet set = new TreeSet();
			int[] score= {80, 95, 50, 35, 45, 65, 10,100};
			
			for(int i =0; i<score.length; i++) {
				set.add(new Integer(score[i]));
			}
			System.out.println("50보다 작은값"+set.headSet(50));
			System.out.println("50보다 큰값"+set.tailSet(new Integer(50)));
			System.out.println("40과 80 사이의 값"+set.subSet(40, 80));

			
			/*
			 * subset 범위 검색 끝범위는 포함안됨 40~50 50은포함x
headSet 지정된객채보다 작은값의 객체들을반환
tailSet 지정된객체보다 큰값의 객체들을반환
			 */
	}

}
