package Ch11;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

public class ArrayLemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book을 담기위한 ArrayList를 객체를만드시오 Book클래스를 끌어와서만듬
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList<Book> list2 = new ArrayList<Book>();
		
		//객체를생성
		Book onpice =new  Book("원피스", 5000);
		Book naruto =new  Book("나루토", 4400);
		Book javapro =new  Book("자바프로그램", 8000);
		Book htmlcss = new Book("HTML과CSS", 7500);
		
		Book spring = new Book("스프링", 9000);
		
	
		//3.ArrayList 객체에 Book객체들을 담으세요*/
		list.add(onpice);
		list.add(naruto);
		list.add(javapro);
		list.add(htmlcss);
		list.add(spring);
	
		//4리스트에 담긴 모든 책 정보 출력
		
		System.out.printf("list.get(%d) -> %s\n",0,list.get(0));
		System.out.printf("list.get(%d) -> %s\n",1,list.get(1));
		System.out.println("============");
		
		for(int i =0; i<list.size(); i++) {
			System.out.printf("list.get(%d) -> %s\n",i, list.get(i));
		}
	}

}

class Book{
	//필드
	private String title;
	private int price;
	//생성자
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
		//a메서드
	
	}
	public String toString() {
		return String.format("Book{name: %s, price: %d}", title, price);
	}
	
}
