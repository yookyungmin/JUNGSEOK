public class Ex4_16_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int sum=0;
		int i = 0;
		while(true) { // true 무한반복문 for(;;)=for(;true;) {}  while 은 생략불가능
			if(sum>100)
				break;
			++i;
			sum+= i;
			
		} //end of while
	System.out.println("i="+i);
	System.out.println("sum="+sum);
	
	}
	
	
	

}
