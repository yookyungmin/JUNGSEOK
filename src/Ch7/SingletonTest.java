package Ch7;


final class Singleton {
		private static Singleton s = new Singleton(); //getInstance()에서 사용될수 있도록 인스턴스가 미리 생성되어야 하므로 static
		
		private Singleton() { //private를 가진 기본생성자
			
		} 
		public static Singleton getInstance() {
			if(s==null)
				s = new Singleton();
			return s;
		}
}

class SingletonTest{
	public static void main(String args[]) {
		//Singleton s = new Singtleton(); //객체 생성불가
		Singleton s = Singleton.getInstance(); //getInstance로 
	}
}