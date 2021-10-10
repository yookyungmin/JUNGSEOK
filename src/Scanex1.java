import java.util.*; // import 추가

public class Scanex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Scanner 클래스 객체 생성
		
		Scanner scanner = new Scanner(System.in); 
		//노란색경고듯모든 입출력 관련개체들은 닫아줘야되는데 닫아주지않아서 에러, 화면입력같은 경우엔 자바 버츄얼머신에의해 관리가 되서 닫을필요X
		
		
/*		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num);
		System.out.println(num2);
		*/
		
		String input = scanner.nextLine(); // 값을여러개 숫자나 문자열 실수 섞여있을때 
		int num = Integer.parseInt(input);
		// = 두 문장을 한문장으로 위이체럼 쓸수있음int num = scanner.nextInt();
		
		System.out.println(num);
		
		
	}

}
 