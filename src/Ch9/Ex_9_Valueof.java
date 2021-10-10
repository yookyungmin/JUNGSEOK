package Ch9;

public class Ex_9_Valueof {

	public static void main(String[] args) {
     int iVal = 100;
//     	String strVal =String.valueOf(ival); // int를 stringm으로 변환 문자열로
     	String strVal = iVal+ ""; //int를 String으로 변환 위랑같음
     	
     	double dVal = 200.0;
     	String strVal2 = dVal +""; //int를 String 변환하는 또다른방법
     	
     	
     	
     	double sum = Integer.parseInt("+"+strVal)// 문자열을 숫자로반환
                                          + Double.parseDouble(strVal2);
     	//위아래 동일
     	double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);
     	
     	System.out.println(String.join("",strVal,"+",strVal2,"=" )+sum); // "" <구분자	
     	
     	System.out.println(strVal+"+"+strVal2+"="+sum2);

	}

}
