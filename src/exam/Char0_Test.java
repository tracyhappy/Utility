package exam;

//“+”运算符，当它被用于字符串和字符串之间，或者字符串和其他类型变量之间时，它产生的效果是字符串的拼接；但当
//它被用于字符和字符之间时，效果等同于用于数字和数字之间，是一种算术运算。

public class Char0_Test {
	public static void main(String[] args) {
		// 将一个中文汉字赋值给一个char变量
		char a = '中';
		char b = '文';
		char c = '测';
		char d = '试';
		char e = '成';
		char f = '功';
		System.out.print(a + b + c + d + e + f);   //156035
	}
}