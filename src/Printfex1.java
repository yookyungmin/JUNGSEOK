public class Printfex1 {

	public static void main(String[] args) {
		
	System.out.println(10.0/3);
   
	 System.out.printf("AGE:%d year:%d\n",14, 2017);
	 System.out.printf("%d\n",15); // 15 10진수  decim    \n 줄바꿈
	 System.out.printf("%o\n",15); // 17 8진수 octa
	 System.out.printf("%x\n",15); // f 16진수  hexa
	 System.out.printf("%s\n",Integer.toBinaryString(15)); // 1111 2진수 integer.tobinarystring 2전문자열
	//
	 System.out.printf("%#o\n",15); //017 8진수엔 접두사 0 
	 System.out.printf("%#x\n",15); //0xf 16 접두사 0x 
	 System.out.printf("%#X\n",15); //0xf  16진수 대문자
	 
	 float f = 123.4567890f; // 변수 f타입은 float(10자리)보단 double(정밀도15자리)사용이 더 적합
	 
	 System.out.printf("%f\n", f);   //(123.4567)87(비정확의미없음)앞에7자리가지 정확 뒷자리 두자리의미x
	 System.out.printf("%e\n",f); // 1.234568e+0.2 끝자리 8이 된이유=마지막값이라 반올림 e+0.2=10제곱 지수형태
	 
	 System.out.printf("%g\n",123.456789); // 123.457 실수로를 소수점포함해서 7자리까지 간략하게 멘뒷자리반올림
	 System.out.printf("%g\n",0.00000001); //1.00000e-0.8 간략하게
	 
	 System.out.printf("[%5d]\n",10); //[][][]10 
	 System.out.printf("[%-5d]\n",10); //10[][][]  - < 왼쪽정렬
	 System.out.printf("[%05d]\n",10); //00010
	 
	 double d=1.23456789;
	 
	 System.out.printf("%f\n",d); //1.234568
	 System.out.printf("[%14.10f]\n",d); //[  1.2345678900] 총 14자리 소수점 뒤로 10개
	 System.out.printf("[%14.6f]\n",d); //[      1.23456] 총 14자리 소수점 뒤로 6개
	 System.out.printf("[%.6f]\n",d); //[  1.2345678900] 소수점 뒤로 6개
	 
	 
	  System.out.printf("[%s]\n", "www.codechobo.com");// [www.codechobo.com]
	 System.out.printf("[%20s]\n", "www.codechobo.com"); //[    www.codechobo.com]
	 System.out.printf("[%-20s]\n", "www.codechobo.com"); //[www.codechobo.com   ]
	 System.out.printf("[%.10s]", "www.codechobo.com"); //[    www.codechobo.com]
	 
	 
	}

}
