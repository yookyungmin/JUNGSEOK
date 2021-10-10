public class Ch5_21_2arrays {

	public static void main(String[] args) {
        // 2차원배열 for문
		int[][] score= {
        		{100, 100,100},
        		{20,20,20},
        		{30,30,30},
        		{40,40,40} 
        };
        int sum =0;
        
        for(int i=0; i<score.length; i++)//score.length = 4 
        	{
        	for(int j=0; j<score[i].length; j++) //score[i] = 3 score[0]= 3 , score[1]=3 
        		{
        	System.out.printf("score[%d][%d]=%d%n",i,j, score[i][j]);
        	
        	sum += score[i][j];   /// 2차원 다룰때 for 문 2중 for문
        		
        	}
        		
        }
	
	    System.out.println("sum="+sum);
	}

}
