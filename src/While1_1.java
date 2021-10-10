public class While1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int sum = 0;
		int i =0;
		// 1씩 더하는 몇가지 더해야 sum이 100을 넘는지 알아내는 문제
		while (sum<=50) { //조건식만
			System.out.printf("%d - %d%n", i, sum );
		  sum += ++i;
		}
	}

//	0 - 0
//	1 - 1
//	2 - 3
//	3 - 6
//	4 - 10
//	5 - 15
//	6 - 21
//	7 - 28
//	8 - 36
//	9 - 45
//	10 - 55
//	11 - 66
//	12 - 78
//	13 - 91
}
