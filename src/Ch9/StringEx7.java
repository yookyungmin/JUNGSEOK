package Ch9;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class StringEx7 {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		//fullName에서 ' . ' 위치를 찾는다
		int index = fullName.indexOf('.'); 
		
		//fullName 의 첫번쨰 글자부터 '.'있는 곳까지 문자열을 추출한다.
		String fileName = fullName.substring(0, index);
		
		//'.' 의 다음문자부터 시작해서 문자열의 끝까지 추출한다.
		//fullName.substring(index+1, fullName.length()); 의 결과가 같다.
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName + "확장자를 제외한 이름은 "+fileName);
		System.out.println(fullName + "의 확장자는 "+ext);

		//위 소스는 substring 메서드를 이용해서 문자열에서 내용의 일부를 추출하는 예를 보인것이다.
		//substrin(int start, int end)를 사용할때 주의점은 index는 0부터 시작, start 부터 edn의
		// 범위중 end위치에 있는 문자는 결과 포함되지 않는다는것
		
	} 

}
