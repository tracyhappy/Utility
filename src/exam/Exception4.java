package exam;

//try-finally结构是可以的
public class Exception4 {
	public static int count() {
		try {
			return 5 / 0;
		} catch (Exception e) {
			return 2 * 3;
		} finally {
			return 3;
		}
	}

	public static void main(String args[]) {
		try {
			System.out.print("Hello world ");
		} finally {
			System.out.println("Finally executing");
		}
		
		System.out.println(count());
	}
}
