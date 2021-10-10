import java.util.Arrays;
public class String1_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//index 0~3-1 / 0~2
		String[] strArr = {"가위", "바위", "보"};
		 
		System.out.println(Arrays.toString(strArr));
		  
		for (int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
		     System.out.println(strArr[tmp]);
			
			
		}

	}

}
