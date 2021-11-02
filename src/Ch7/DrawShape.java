package Ch7;

public class DrawShape {

	public static void main(String[] args) {
		Pointee[] p = {
				new Pointee(100,100),
				new Pointee(140,50),
				new Pointee(200,100)
		};
		
		Triangle t = new Triangle(p);
		
		Circlee c = new Circlee(new Pointee(150, 150),50);//아래 두분장을 합쳐놓은것
		// Pointee p = new Pointee(150, 150);
		//Circlee c = new Circlee(p, 50);  // 
		
		t.draw();//삼각형을 그린다.
		c.draw();//원을그린다
		
	}


}

class Shape{
	String color = "black";
	void draw() { //메소드
		System.out.printf("[color =%s]%n",color);
	}
}
class Pointee {// 클래스
	int x;
	int y; //필드 변수
	Pointee(int x, int y) { //매개변수가 있는 생성자 //객체생성시 초기화를 담당
		this.x = x; // this.x = 인스턴스 변수 , x; = 매개변수
		this.y = y;
	}
	Pointee() {
		this(0, 0); // 기본값
	}
	String getXY() { //메소드
		return "("+x+","+y+")"; // x와 y와 값을 문자열로 반환
	}
}
// A Circle is a Shape = 원은 도형이다 (자연스럽) (상속관계로)
// A Circle is a point = 원은 점이다?

//A Circle has a Shape 원은 도형을 가지고 있다
// A Circle has point 원은 점을 가지고 있따 (자연스럽) 포함관계로
class Circlee extends Shape{ //상속 관계
	Pointee center; //원의 원점좌표 // 포함관계 
	int r; //반지름 

	Circlee(){ // 기본값
		this(new Pointee(0, 0),100); // Circle(point center, int r) 호출
	}
	Circlee(Pointee center, int r){
		this.center = center;
		this.r =r;
	}
	void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다 // 조상 클래스에 정의 메서드와 같은 메서드를 자손클래스에 정의, 오버라이딩
		System.out.printf("[center = (%d,%d), r=%d, color = %s]%n", center.x, center.y, r, color); // shape
		
	}
		
	}

class Triangle extends Shape{
	Pointee[] p = new Pointee[3];
	
	Triangle(Pointee[] p) {
	this.p = p;
}
	void draw( ) { 
		System.out.printf("[p1=%s, p2%s, p3=%s, color = %s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
		
	}
}


