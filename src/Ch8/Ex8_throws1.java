package Ch8;

import java.io.*;
//직접처리 try catch
// 떠넘기기 try catch를 안쓰는것
public class Ex8_throws1 {

	public static void main(String[] args) {
		try {
			File f = createFile(""); // 파일생성(1) args[0] "test2.txt" "" <빈문자열
			System.out.println(f.getName()+"파일이 성공적으로 생성 되었습니다");
		} catch (Exception e) {
             System.out.println(e.getMessage()+"다시 입력해 주시기 바랍니다");
			
		}
} // main 메서드의 끝


     static File createFile(String fileName) throws Exception{ // 파일생성(2)
	
    	 try {
		
		if(fileName==null || fileName.equals(""))
		throw new Exception("파일이름이 유효하지 않습니다");	
		
	} catch (Exception e) {
		System.out.println(e.getMessage()); // 파일이름이 유효하지않습니다 불러오기
		fileName = "제목없음";
	}
    	 //아래는 try catch를 안쓸때 위는 쓸때
    	 
//    	 if(fileName==null || fileName.equals("")) // // 파일생성(3) 
    	 //빈문자열시 true디면 아래 파일이유효하지않습니다
//		throw new Exception("파일이름이 유효하지 않습니다");
	
	
	File f = new File(fileName); // File 클래스의 객체를만든다.
	//File 객체의 createNewFile ㅇ메서드를 이용해서 실제 파일을 생성한다.
	  f.createNewFile();
	  return f; // 생성은 객체의참조를 반환한다.
}//createFile 메서드의 끝
} //클래싀으 끝