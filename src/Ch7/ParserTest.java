package Ch7;

interface Parseable{
//구문 분석작업을 수행한다.

	public abstract void parse(String fileNmae);// (매개변수목록)
         }
class ParserManager{
	//리턴 타입이 Parseable 인터페이스이다
	
		public static Parseable getParser(String type) { 
			//매개변수로 넘겨받는 type값이 따라 XMLParser 인스턴스또는 HTMLParser 인스턴스를반환
		if(type.equals("XML")){
		return new XMLParser();
	}else {
		Parseable p = new HTMLParser();
		return p;
		//return new HTMLParser();
	}
	}
}

class XMLParser implements Parseable{ //구현
	public void parse(String fileName) {
	/*구문 분석작업을 수행하는 코드를 적는다*/
	System.out.println(fileName + "- XML parsing completed.");
}
}
class HTMLParser implements Parseable{ //구현
	public void parse(String fileName){
	/*구문 분석작업을 수행하는 코드를 적는다*/
	System.out.println(fileName +" -HTML parsing completed.");
}
}
class ParserTest{
	public static void main(String args[]) {
	Parseable parser = ParserManager.getParser("XML");
	parser.parse("document.xml"); //parser는 XMLParser 인스턴스를가르킨다
	parser =  ParserManager.getParser("HTML");
	parser.parse("document2.html");
}
}