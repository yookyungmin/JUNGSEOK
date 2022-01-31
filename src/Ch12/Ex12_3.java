package Ch12;
import java.util.*;
public class Ex12_3 {

	public static void main(String[] args) {
			
		HashMap<String, Student> map = new HashMap<>(); //jdk1.7부터 생성자에 타입지정 생략가능
		
		
		map.put("자바왕", new Student("자바왕", 1, 1, 100, 100,100));
		
		
		//public Student get(Object key) {
		Student s = map.get("자바왕"); //형변환 생략가능
		
		System.out.println(map); //{자바왕=Ch12.Student@19e0bfd}
		System.out.println(map.get("자바왕").name);
		System.out.println(s.name);

	} //main

}

class Student{
	String name = " ";
	int ban; //반
	int no; //번호
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
	this.name = name;
	this.ban = ban;
	this.no = no;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	}
}
