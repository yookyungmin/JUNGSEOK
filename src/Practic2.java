class stdunt {
   int subject; // 과목   //인스턴스 변수 변할수 있음
  static int sum_real; // 클래스 변수 공통 

   stdunt() {  //디폴트 생성자
   }
/// public 제어자 공부하면 알수있다
  stdunt(int subject) {
      sum_real += subject;
   }

   public void avg() { 
      System.out.printf("%.1f\t", (double) sum_real / 3);
   }
   public void sum() {
      System.out.printf("%d\t", sum_real);
      sum_real = 0;
   }
}

public class Practic2{

   public static void main(String[] args) {
      int[][] c = { { 30, 30, 40 },
    		        { 10, 20, 30 } };
      double summmm = 0;
      int i, j;
      int gett = 0;

      System.out.printf("\t자바\tc\t컴퓨터구조\t평균\t총합\t학점");
      System.out.println();
      for (i = 0; i < 2; i++) {
         System.out.printf("%d학생\t", i + 1);
         for (j = 0; i < 3; j++) {

            if (j == 3) {
               break;
            }

            stdunt a = new stdunt(c[i][j]);
            gett += c[i][j];
            summmm += c[i][j];
            System.out.printf("%d\t", c[i][j]);
         }
         stdunt a = new stdunt();
         a.avg();
         a.sum();
         gett /= 3; // 과목이 세개라 3으로 나누고 대입하여 학점을 구분
         if (gett <= 100 && 90 <= gett) {
            System.out.printf("a");
         } else if (gett > 29 && 45 >= gett) {
            System.out.printf("b");
         } else if (gett <= 29 && 20 <= gett) {
            System.out.printf("f");
         }
         gett = 0;
         System.out.println();
      }
      System.out.printf("과목 평균\t");
      for (i = 0; i < 3; i++) {
         System.out.printf("%.1f\t", ((double) (c[0][i] + c[1][i])) / 2);
      }
      System.out.printf("%.1f\t", summmm / 6);
      System.out.printf("%.1f\t", summmm / 2);
   }
}

