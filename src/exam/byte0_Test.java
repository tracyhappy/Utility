package exam;

//字母1个字节，中文一个字符（两个字节）
public class byte0_Test {
	public static void main(String[] args) {
		// 将一个英文字母赋值给一个byte变量
		byte a = 'a';
		//将一个中文汉字赋值给一个byte变量时，编译会报错
//		 byte b = '中';
		System.out.println("byte a = " + a); //实际上是把字符'a'对应的ASCII码值赋值给了byte型变量a。
//		System.out.println("byte b = "+b);
		
	}
}