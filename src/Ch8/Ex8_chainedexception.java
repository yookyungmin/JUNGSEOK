package Ch8;

public class Ex8_chainedexception {

	public static void main(String[] args) {
		static Void startInstall()  throws SpaceException {
			if(!enoughSpace()) 
				throw new SpaceException("설치할 공간이 부족합니다");
				if (!enoughMemory()) 
					throw new RuntimeException(new MemoryException("메모리가부족합니다"));
		}
	}

}
