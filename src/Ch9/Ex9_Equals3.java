package Ch9;
class Person {
	long id; // this.id
	
	public boolean equals(Object obj) {
	if(!(obj instanceof Person))
	
	return false;
	  
	Person p = (Person)obj;
 
	return this.id ==p.id; // 주민번호 비교 o , 주소비교x// 
            //retun this.id ==((Person)obj).id; this 생략가능
     }
        Person(long id) {
	this.id= id;
  }
}
class Ex9_Equals3 {
      public static void main(String[] args){
	 Person p1 = new Person(8011081111222L);
	 Person p2 = new Person(8011081111222L);
        if(p1==p2) // 주소비교
          System.out.println(" p1과 p2는 같은 사람입니다");
        else
        System.out.println(" p1과 p2는 다른 사람입니다.");
        
        if(p1.equals(p2)) // this.id
 	System.out.println("p1과 p2는 같은 사람입니다.");		
        else
         System.out.println("p1과 p2는 다른 사람입니다");
}
}
      
	


