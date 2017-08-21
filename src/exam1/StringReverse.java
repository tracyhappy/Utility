package exam1;


public class StringReverse {
	public static void main(String[] args) {
		// 原始字符串
		String s = "A quick brown fox jumps over the lazy dog.";
		System.out.println("原始的字符串：" + s);
		System.out.print("反转后字符串：");
		for (int i = s.length(); i > 0; i--) {
			System.out.print(s.charAt(i - 1));
		}
		// 也可以转换成数组后再反转，不过有点多此一举
		char[] data = s.toCharArray();
		System.out.println();
		System.out.print("反转后字符串：");
		for (int i = data.length; i > 0; i--) {
			System.out.print(data[i - 1]);
		}
		
		// 原始字符串
		System.out.print("\n反转后字符串：");
		StringBuffer buff = new StringBuffer(s);
		// java.lang.StringBuffer类的reverse()方法可以将字符串反转
		System.out.println(buff.reverse().toString());
	}
}