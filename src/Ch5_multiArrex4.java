import java.util.*;
public class Ch5_multiArrex4 {

	public static void main(String[] args) {

        String[][] words = {
        		{"Chair","의자"},  //[0][0], [0][1]
        		{"computuer","컴퓨터"},//[1][0], [1][1]
        		{"integer", "정수"}// [2][0], [2][1]
        		 
        };
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<words.length; i++) {
        	System.out.printf("Q%d,%s의 뜻은?", i+1, words[i][0]);
        	
        	String tmp = scanner.nextLine(); 
        	
        	if(tmp.equals(words[i][1 ])) {
        		System.out.printf("정답입니다.\n\n");
        	}
        	else 
        		System.out.printf("틀렸습니다. 정답은%s입니다", words[i][1]);
        	}
        	
        }
        
        
	}
