package ch6;
// 참조변수 this 와 생성자 this()

// this = 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장 되어 있다.
// 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재 /this 가붙으면 iv 인스턴스변수 없으면 LV 지역변수
// 생성자와 인스턴스 메서드에서만 사용가능


// this(), this(매개변수) // 생성자, 같은 클래스의 다른 생성자를 호출할때 사용한다. //  클래스 이름대신 this()


class Ex11_3 {

	long a, b; // this.a , this.b  //iv의 진짜이름

	//클래스이름
	Ex11_3(int a, int b) { // 생성자  a, b = LV

		this.a = a; //this.a , this.b = iv // this 생략불가 생략하면 iv lv 구별이 안되고 생략하면 lv가 되기 떄문에 
		this.b = b;  // a,b = LV //
	}

	long add( ) { // 인스턴스 메서드

		return a + b; // return this.a+ this.b;  /iv

	}
	static long add(long a, long b) {//클래스 메서드(static메서드) //lv 
		return a+b;  //lv  클래스 메서드는객체없이 호출, iv 사용 불가 this도 사용불가


	}

}
