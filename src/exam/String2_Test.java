package exam;

public class String2_Test {
	
	public static void main(String[] args) {
		String s = "Hello" + 9 + 1;
//		String s = 9+1+"hello";
		System.out.println(s);
		
		String s1 = "a";
		String s2 = s1 + "b";
		String s3 = "a" + "b";
		System.out.println(s2 == "ab");
		System.out.println(s3 == "ab");
		
		String s4 = "a" + "b" + "c" + "d";
		System.out.println(s4 == "abcd");


	}

}
