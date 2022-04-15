class Data{
   int x;
}

public class Test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Data d = new Data();
      d.x=10;
      System.out.println(d.x);
       
      a.change(d.x);
      System.out.println(d.x);
      
   }
}
class a{
	
   static void change(int x) {
      x = 1000;
      System.out.println(x);
   }
}