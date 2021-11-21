package Ch8.sec1;

public class ChainedExceptionEx{
	public static void main(String args[]){
	try{
	install();
	}catch(InstallException e) {
	e.printStackTrace();
	}catch(Exception e){
	e.printStackTrace();
}
}//main의끝

	static void install() throws InstallException{//메서드에서 발생할수 있는 예외선언
	 try{
	      startInstall(); //프로그램 설치에 필요한 준비를 한다
	      copyFiles(); //파일들을 복사한
	}catch(SpaceException e){
	InstallException ie = new InstallException("설치중 예외발생"); //예외발생시키기
	ie.initCause(e); //InstallException 의 원인예외를 SpaceException 지정
	throw ie; //예외발생
	}catch(MemoryException me) {

	InstallException ie = new InstallException("설치 중 예외발생");
	ie.initCause(me); // MemoryException me를 원인 예외로 지정
	throw ie;
	}finally{//예외처리 상관없이 반드시 실행
	deleteTempFiles(); //프로그램 설치에 사용된 임시파일들을 삭제한다.
	}//try의끝
}
	static void startInstall() throws SpaceException, MemoryException{//메서드에 발생할수 있는 예외선언
	if(!enoughSpace()){ //충분한 설치 공간이 없으면
	throw new SpaceException("설치할 공간이 부족합니다");//예외발생
}
	if(!enoughMemory()){//충분한 메모리가 없으면
	throw new MemoryException ("메모리가 부족합니다");
	//throw new RuntimeException (new MemoryException("메모리가 부족합니다"); //체크드예외인데 unchecke예외로
}//startInstall 메서드의끝
}
	static void copyFiles() {/*파일들을 복사하는 코드들을 적는다.*/}
	static void deleteTempFiles() {/*임시파일들을 삭제하는 코드를 적는다*/}

	static boolean enoughSpace() {
	//설치하는데 필요한 공간이 있느지 확인하는 코드를 적는다.
	return false;
}
	static boolean enoughMemory() {
	//설치 하는데 필요한 메모리공간이 있는지 확인하느 ㄴ코드를 적느다.
	return true;
}	
}	//ExceptionTest클래스의끝
	
	class InstallException extends Exception { //사용자 정의 예외 만들기
	InstallException(String msg){
	super(msg);
}
}

	class SpaceException extends Exception{
	SpaceException(String msg) {
	super(msg);
}
}
	class MemoryException extends Exception{
	MemoryException(String msg) {//String msg = 예외발생원인 메시지
	super(msg);
}	
}	