package exam;


//switch可以是byte、short、int,char、enum五种
public class Switch_Test {
	public static void main(String[] args) {
		int i = 9;
		switch (i) {
		default:
			System.out.println("default");
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		}

		int j = 2;
		switch (j) {
		case 2:
			System.out.println("Value is two.");
		case 2 + 1:
			System.out.println("Value is three.");
			break;
		default:
			System.out.println("value is" + j);
			break;
		}
		
//		int k = 0;
		byte k = 0;
//		char k='a';
		switch (k) { // k可以是byet、char、short、int,enum五种
			default:
			System.out.println("Hello");
		}

	}
}
