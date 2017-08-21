package exam;
public class Exception1 {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("C");
		} finally {
			System.out.print("B");
		}
		System.out.print("D");
	}

	public static void badMethod() throws Exception {
//		throw new Exception();			//CBD
		throw new Error();				//B
	}
	
}