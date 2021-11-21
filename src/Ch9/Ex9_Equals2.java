package Ch9;
class Ex9_Eqauls2{
   public static void main(String[] args) {
      value v1 = new value(10);  //객체 생성
      value v2 = new value(10);
      
       if (v1.equals(v2))
    	   
        System.out.println("v1과 v2는 같습니다");
       else
         System.out.println("v1과 v2는 다릅니다");
        

  }//main
}
 class value{
   int value;
   value(int value) {
      this.value = value;
  }
//Object 의 equals(0를 오버라이딩 해서 주소가 아닌 value를비교
  public boolean equals(Object obj) {
	  
 //  return this==obj; // 주소비교 서로다른 객체는 항상  false
//  	참조변수 형변환 전에는 반드시 instanceof 로 확인해야함.
//        if(obj instanceof value) 
	  
	  
            if(!(obj instanceof value))  return false;
           value v=(value)obj; // obj는 value가없기떄문에 형변환 , 캐스팅
             return this.value==v.value; //return (this==obj); 




 }
}