package Ch9;

public class Ex9_rint {

	public static void main(String[] args) {
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		 for(double d=1.5; d<=10.5; d++) {
			 double d1 = Math.round(d); //소수점 첫째자리에서 반올림반올림
			 double d2 = Math.rint(d); //  가까운수
		 
			 System.out.printf("%4.1f %4.1f %4.1f\n",d, d1, d2);
			 
			 sum+=d;
			 sum+=d1;
			 sum+=d2;
		 
		 }
		 
		System.out.println("==================");
		System.out.printf("%4.1f %4.1f %4.1f\n",sum, sum1, sum2);
			
		
		 	
	}

}
