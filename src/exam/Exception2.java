package exam;

public class Exception2 {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Error ex) {			//捕获Error
			System.out.print("C");
		} finally {
			System.out.print("B");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		throw new Error();                //CBD
	}
}