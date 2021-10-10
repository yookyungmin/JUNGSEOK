package Ch7;
//오버라이딩 상속받은 메서드 내용을 변경할수있다
class Point {
	int x;  //좌표 위치
	int y;
	
	String getLocation() {  // 선언부1(반환타입, 메서드이름, 매개변수목록) //
		return "x:"+x+",y:" +y; 
		
	}
 }

class Point3D extends Point{ // point를 상속받는 point3d
	int z;

////조상의 getLoacation() 을 오버라이딩 // //조상의 메서드에서 수정변경
   String getLocation() { //선언부1과 일치해야됨
	   return "x:"+x+", y:" +y+",z:"+z; // 상속을 받긴 받는데 조상꺼 안스고 자손꺼 호출
   }
}


public class Ex8 {   //OverrideTest

	public static void main(String[] args) {
            Point3D p = new Point3D(); //객체 생성 
            p.x =3;       
            p.y =5;
            p.z =7;

            System.out.println(p.getLocation());
	}

}
