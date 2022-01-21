package Ch11;
import java.sql.Savepoint;
import java.util.*;

//최근 5개의 명령어 이력을 보여줌
class quee {
	
	static Queue q = new LinkedList();//Queue 사용하려면 , 인터페이스인데 인터페이스를 구현한 구현체중에 하나를 써야댐
	static final int MAX_SIZE = 5; //Queue 최대 5개까지만 저장되도록한다 
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼수 있습니다");
		
		while(true) {//무한반복문
			System.out.println(">>");
			try {
				//화면으로부터 라인단위로 입력받는다
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); //trim() =문자열 앞뒤  공백제거
				
				if("".equals(input)) continue;  //입력이 ""비어 있으면 아래를 건너띄고 다시 멘앞 while(true) 로
 				if(input.equalsIgnoreCase("q")) {  //equals는 대소문자 구분, equalsignorecase 대소문자 구분 안하고 비교
					System.exit(0); //프로그램 종료
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다");
					System.out.println("q 또는 Q- 프로그램을 종료합니다");
					System.out.println("history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다");
				}else if(input.equalsIgnoreCase("history")) {
//					int i=0;
					//입력받은명령어를 저장
					save(input);
					
					LinkedList list = (LinkedList)q;  //LinkedList로 형변환,  참조변수타입은q 실제객체는 LinkedList
					
					final int SIZE = list.size();  //반복횟수가많을수록 상수로 지정해주고 
					for(int i =0;i<SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
//					//linkedList의 내용을 보여준다.
//					LinkedList tmp = (LinkedList)q;
//					ListIterator it = tmp.listIterator(); //ListIterator는 Iterator의 인터페이스를 상속받아 여러기능추가 잘안씀
//					
//					while(it.hasNext())
//						System.out.println(++i+"."+it.next());
				}else {
					save(input);
					System.out.println(input);
				} //if(input.equalsIgnoreCase("q")) {
			}catch (Exception e) {
				System.out.println("입력오류입니다");
			}
		}//while(true)

	} //main
	public static void save(String input) { //q에다 입력한 명령어를 저장하는메서드
		//queue에 저장한다. 
		if(!"".equals(input)) //빈문자열 일떈 저장을안함 if(input!= null && !input.equals("") 널이 아니고 빈문자열이 아니면저장
			q.offer(input); // //offer = queue 에 객체를 저장 성공하면 true, 실패하면 false 반환
				//queue 의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다
				if(q.size()>MAX_SIZE) //size()는 collection 인터페이승 정의
					q.remove(); //Queue 에서 객체를 꺼내 반환 비어있으면 NosuchElementException 발생 
//					q.poll();
			
			
	}
} //end  of class

