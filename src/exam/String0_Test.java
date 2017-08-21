package exam;

//只有使用引号包含文本的方式创建的String对象之间使用“+”连接产生的新对象才会被加入字符串池中。
//string.intern(),如果字符串常量池中已经含有，则直接返回;如果没有则在字符串常量池中添加一个，并返回。
public class String0_Test {
	public static void main(String[] args) {
		
		String s1 = "Hello world";
		String s2 = "Hello";
		s2 = s2 + " world";
		System.out.println(s1 == s2); 				// false   (以下的测试可说明该内容)
		
		String str = "sdf";
		String abc = str.intern();
		System.out.println(abc == str);				//true
		System.out.println(abc == "sdf");			//true
		
		String string0  = new String("yoyo");
		String string1 = string0.intern();
		System.out.println(string0 == string1);		//false
		System.out.println(string1 == "yoyo");		//true
		
		
		String a = "ab";// 创建了一个对象，并加入字符串池中
		System.out.println("String a = \"ab\";");
		String b = "cd";// 创建了一个对象，并加入字符串池中
		System.out.println("String b = \"cd\";");
		String c = "abcd";// 创建了一个对象，并加入字符串池中
		String d = "ab" + "cd";
		// 如果d和c指向了同一个对象，则说明d也被加入了字符串池
		if (d == c) {
			System.out.println("\"ab\"+\"cd\" 创建的对象 \"加入了\" 字符串池中");
		}
		// 如果d和c没有指向了同一个对象，则说明d没有被加入字符串池
		else {
			System.out.println("\"ab\"+\"cd\" 创建的对象 \"没加入\" 字符串池中");
		}
		String e = a + "cd";
		// 如果e和c指向了同一个对象，则说明e也被加入了字符串池
		if (e == c) {
			System.out.println(" a +\"cd\" 创建的对象 \"加入了\" 字符串池中");
		}
		// 如果e和c没有指向了同一个对象，则说明e没有被加入字符串池
		else {
			System.out.println(" a +\"cd\" 创建的对象 \"没加入\" 字符串池中");
		}
		String f = "ab" + b;
		// 如果f和c指向了同一个对象，则说明f也被加入了字符串池
		if (f == c) {
			System.out.println("\"ab\"+ b 创建的对象 \"加入了\" 字符串池中");
		}
		// 如果f和c没有指向了同一个对象，则说明f没有被加入字符串池
		else {
			System.out.println("\"ab\"+ b 创建的对象 \"没加入\" 字符串池中");
		}
		String g = a + b;
		// 如果g和c指向了同一个对象，则说明g也被加入了字符串池
		if (g == c) {
			System.out.println(" a + b 创建的对象 \"加入了\" 字符串池中");
		}
		// 如果g和c没有指向了同一个对象，则说明g没有被加入字符串池
		else {
			System.out.println(" a + b 创建的对象 \"没加入\" 字符串池中");
		}
	}
}
