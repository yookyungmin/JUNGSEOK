package Ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ch6.ch11_2;


public class Ex9_regex {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bounus", "cA", "ca", "co", "c.",
				"cO", "Car", "combat", "count", "date", "disc"};
		Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자 영단어
		
		Pattern p1= Pattern.compile("b[a-z]*"); // b로 시작하는 소문자 영단어
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i]+",");
		}
		
		System.out.println();
		for(int i=0; i<data.length; i++) {
			Matcher m = p1.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i]+",");
		}

	}

}
