package Ch7;

public class PointTest2 {

	public static void main(String[] args) {
		Point3DD p3 = new Point3DD();
		System.out.println("p3.x="+ p3.x);
		System.out.println("p3.y="+ p3.y);
		System.out.println("p3.z="+ p3.z);

	}

}

class Pointt{
	int x =10;
	int y =20;
	
	Pointt() {} // 기본생성자를 쓰면
	Pointt(int x, int y){ //매개변수가 있는 생성자
		super();//생성자 첫줄에서 다른 생성자를 호출하지 않기떄문에 컴파일러가 super(); 여기에 삽입
//		super()는 Pointtㅇ의 조상인 Object 클래스의 기본생성자인 Object()를의미
		this.x = x;
		this.y = y;
	}
}

class Point3DD extends Pointt {
	int z =30;
	Point3DD() {
		this(100, 200, 300); // Point3D(int x, int y, int z)를 호출
	}
	
	Point3DD(int x, int y, int z) {
		super(x, y); // 조상 클래스의 생성 Point(int x, int y) 
		//Pointt 생성자에 기본생성자살리고 호출하면 x,y 제거가능  
		this.z = z;
	}
}
