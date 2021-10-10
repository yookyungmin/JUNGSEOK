package ch6;

class Data_1 {
	int value;
	
	// Data_1(){} // 기본생성자를 추가 // 생성자가 하나도없기때문에 컴파일러가 자동으로 넣어줌
}

class Data_2{
	int value;
	
	Data_2(){} // 기본생성자 //클래스 만들때 기본생성자 생성 습관화
	//자동으로 기본생성자를 추가해주는경우는 클래스내에 생성자가하나도없을때 
	Data_2(int x){ //매개변수가 있는 생성자. // 생서자가하나 있어서 기본생성자를 생성해줘야함
		value = x;
		
	}
	
}

class Ex11_1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
     Data_1 d1 = new Data_1();
     Data_1 d2 = new Data_1(); // compile error 발생
	}

}
 