package ch6;

class product {
	static int count = 0; // 생성된 인스턴스의 수를 저장하 기 위한 변수
	int seriaNo;

	{ //인스턴스 초기화 블럭, 모든 생성자에서 공통적으로 수행될 코드
		++count;
		seriaNo = count;

	}
	public product() {} // 기본생성자// 생략가능

}

public class Ex6_12_1 { //producttest
	public static void main(String[] args) {
		product p1 = new product();
		product p2 = new product();
		product p3 = new product();

		System.out.println("p1의 제품번호(seria no)는 "+p1.seriaNo);
		System.out.println("p2의 제품번호(seria no)는 "+p2.seriaNo);
		System.out.println("p3의 제품번호(seria no)는 "+p3.seriaNo);
		System.out.println("생산된 제품의 수는 모두"+product.count+"개 입니다.");



	}

}
