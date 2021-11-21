package Ch9;

class Point implements Cloneable {//cloneable인터페이스를 구현한 클래스에서만 clone()호출가능
	int x, y;

	Point(int x, int y) {
	this.x= x;
	this.y =y;
}
	public String toString() {
	return " x =" +x+ ", y= "+ y;
}//없으면 해쉬코드로 출력됨
	public Object clone(){

	Object obj = null;
	try{
		obj = super.clone(); // clone()은 반드시 예외처리를 해주어야 한다.
}	catch(CloneNotSupportedException e) {}
	return obj;

}
}

    public class CloneEx{
	public static void main(String args[]) {
	
	Point ori = new Point(3,5);
	Point copy =(Point)ori.clone(); //복제해서 새로운 객체 새성
	System.out.println(ori);
	System.out.println(copy);
}

}
