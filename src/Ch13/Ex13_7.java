package Ch13;
class Ex13_7 implements Runnable  { 
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7()); //Thread(Runnable r)
 		t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다. // 쓰레드가 데몬쓰레드가 되도 start위에 잇어야됨
		//t.setDaemon으로 해줘야 무한루프안됨
		t.start();

		for(int i=1; i <= 10; i++) {
			try{
				Thread.sleep(1000); //1초마다 카운트
			} catch(InterruptedException e) {}
			System.out.println(i);

			if(i==5) autoSave = true; // 5초떄 autosave를 트루로
		}

		System.out.println("프로그램을 종료합니다.");
	} //main 스레드 (일반쓰레드

	public void run() { //Runnable 에 구현됨
		while(true) { //무한루프
			try { 
				Thread.sleep(3 * 1000); // 3초마다
			} catch(InterruptedException e) {}

			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if(autoSave) autoSave();
		} // 데몬쓰레드(보조) 일반쓰레드가 종료되면 자동종료 
	}
// 5초 이후부터 autosave가 true가 되어서 3초 단위로 저장
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}