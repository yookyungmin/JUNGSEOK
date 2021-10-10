import java.util.Arrays;
public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//       인덱스      01234  
		     String str = "ABCDE"; // str.length() 는 5
		char ch = str.charAt(4); // 인덱스 숫자 뽑기 // 문자열에서 가져오기
		
		String str2 = str.substring(1,4);//  인덱스 1부터 3까지 4 버위
		
		String str3 = str.substring(1); // 1 부터  끝가지 5까지인데 끝은 안들어가니 1~4
		String str4 = str.substring(1,5 ); // 1~4까지 5범위x
		String str5 = str.substring(1,str.length()); //문자열의 길이 5 (1,5) 1~4
		
		
		System.out.println(ch); //E
		System.out.println(str2); //bcd
		System.out.println(str3); //BCDE
		System.out.println(str4); //BCDE
		System.out.println(str5); // BCDE
		
		
		

	}

}
