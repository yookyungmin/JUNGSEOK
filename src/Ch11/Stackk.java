package Ch11;

import java.util.*;
public class Stackk {

	public static void main(String[] args) {
		Stack st = new Stack();
		String exprssion = "((3+5)*8-2)";// args[0];
		
		System.out.println("expression"+exprssion);
		
		try {
			for(int i =0; i<exprssion.length(); i++ ) {
				char ch= exprssion.charAt(i); //i번쨰의 글짜
				
				if(ch=='('){ //여는 괄호 스택에 추가
					st.push(ch+" ");//push= stack에 객체를 저장한다.
					
				} else if(ch==')') { //닫는괄호 스택에서 꺼냄
					st.pop(); //pop=stack 멘위에 저장되어있는것을 꺼낸다 비어잇으면 emptystackException 발생
				}
			}
			if(st.isEmpty()) { //인스턴스는 생성되어있으나 아무것도 없는상태 값이 존재 x 객체에 ""이란 값으로 들어가 있는 상태 //괄호가 비어있으면
				System.out.println("괄호가 일치합니다");
			}else {
				System.out.println("괄호가 일치하지 않습니다");
			}
		}catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다22222");
		}//try
		
		

	}

}
