package Ch9.sec1;

class Circle implements Cloneable{
		Point p; // 원점
		double r; //반지름
		
		Circle(Point p, double r) {
			this.p = p;
			this.r = r;
		}
		
		public Circle shallowCopy() {  //얕은복사 
			Object obj = null;
			try {
				obj = super.clone();
			}catch (CloneNotSupportedException e) {}
		return (Circle)obj;
}
		
		public Circle deepCopy() { //깊은복사
			Object obj = null;
			try {
				obj = super.clone();
			} catch (CloneNotSupportedException e) {}

				Circle c = (Circle)obj;
				c.p = new Point(this.p.x, this.p.x);
				return c;
			}
			public String toString() {
				return "[p=" + p+ ", r = " +r+ "j";
			}
		}

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.x = y;	
	}
	public String toString() {
		return "("+x+ ", "+y+")";
	}
}


public class ShallowDeepCopy {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1, 1), 2.0); //객체 c1을 복사하고
		Circle c2 = c1.shallowCopy();   // 얕은 복사
		Circle c3 = c1.deepCopy(); //깊은복사
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		
		System.out.println("= c1의 변경 후 =");
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		

	}

}
