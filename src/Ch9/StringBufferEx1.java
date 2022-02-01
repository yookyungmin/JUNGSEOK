package Ch9;




public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb == sb2 ? " + (sb==sb2));
		System.out.println("sb.equals(sb2) ? "+ sb.equals(sb2));
		
		//equals가 오버라이딩 되어 있지 않아서 false
	
		//StringbUffer 의 내용을 String으로 변환한ㄷ.
		String s = sb.toString(); // String s= new String(sb); 같음
		String s2 = sb2.toString(); //String s2= new String(sb2);
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
		System.out.println("s == s2 ? "+ (s==s2));
				
		
	}

}
