package Ch8;

public class Ex8_rethrowing {
// 양쪽에서 try catch
	public static void main(String[] args) {
        try {
        	method1();
        }catch (Exception e) {
        	System.out.println("main메서드의 예외가처리되었씁니다");
        }

	} // main메서드의 긑


static void method1() throws Exception {
	try {
		throw new Exception();
	} catch (Exception e) {
		System.out.println("method1 메서드에서 예외가처리되었씁니다");
		throw e;
	}
}
}