
class Data{
   int x;
}

public class Test2{

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Data d = new Data();
      d.x=10;
      System.out.println(d.x);
       
      Test2.change(d.x);  // 같은 클래스 메소드의 경우 change만 단독으로 사용가능
      change(d.x);
      System.out.println(d.x);
      
   }
   static void change(int x) {
      x = 1000;
      System.out.println(x);
   }
}