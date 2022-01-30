package Ch12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.*;

class Product{
	
	//필드
	private String title;
	private int price;
	
	//생성자
	public Product(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	//메서드
	public String toString() {
		return String.format("Product{name: %s, price: %d}", title, price);
	}
	
	
}
class Tv extends Product{
	
		Tv(String title, int price){
			super(title, price);
		}
}
class Audio extends Product{
	Audio(String title, int price){
		super(title, price);
		
	}
}

public class GenericTest2 {

	public static void main(String[] args) {

		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>(); //에러 데이터타입불일치
//		List<Tv> tvList = new ArrayList<Tv>(); // ok 다형성으로 가능
		//List 조상 ArrayList 자손으로 다형성 가능  그리고 데이터타입일치
		
		
		Product joosic = new Product("Samsung", 10000);
		
		
		
		Tv toni = new Tv("kbs", 10000);
		
		
		productList.add(joosic);
		productList.add(toni);
		
		for(int i = 0; i<productList.size(); i++) {
			System.out.printf("productlist.get(%d) -> %s\n",i, productList.get(i));
		}
//		productList.add(new Tv()); //public boolean add(Prodcut e){} // product와 자손 ok
//		productList.add(new Audio());
		
		tvList.add(toni); //public boolean add(Tv e) {} //Tv또는 그자손들

		
//		tvList.add(new Audio()); Tv와는 어떤관계가 없어서 오디오 불가
		
		printALL(productList);
//		printALL(tvList); // 컴파일에러 발생 Poduct만 가능
	}
	public static void printALL(ArrayList<Product> list) {//ArrayList의 Product만 됨
		for(Product p : list)
			System.out.println(p);
		
	}

}
