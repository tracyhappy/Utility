package exam;

public class Varible_Test {
//	未带有字符后缀标识的整数默认为int类型；未带有字符后缀标识的浮点数默认为double类型
//	int型值可以赋给所有数值类型的变量；long型值可以赋给long、float、double类型的变量；
//	float型值可以赋给float、double类型的变量；double型值只能赋给double类型变量。
	public static void main(String[] args) {
		//没有F（不区分大小写）后缀标识的浮点数默认为double型的，不能将它直接赋值给float型变量
//		float a = 9.8;      //错误
		float f = 9.8f;
		// 不带后缀标识的浮点数默认为double类型的，可以直接赋值
		double d = 9.8;
		double e = 9.8d;
		byte by0 = -128;
		byte by1 = 127;
 		
		int x = 3;
		int y = 5;
		System.out.println(x/y);
		System.out.println(x%y);
		
		//(short) x/y * 2;    先执行强转
		
		short s1 = 1;
		// 这一行代码会报编译错误
		// s1 = s1 + 1;
		// 这一行代码没有报错
		s1 = 1 + 1;
		// 这一行代码也没有报错
		s1 += 1;
		
//		当使用+=、-=、*=、/=、%=、运算符对基本类型进行运算时，遵循如下规则：
//		运算符右边的数值将首先被强制转换成与运算符左边数值相同的类型，然后再执行运算，
//		且运算结果与运算符左边数值类型相同。
		
//		在s1=s1+1;中，s1+1运算的结果是int型，把它赋值给一个 short型变量s1，所以会报错；
//		而在s1+=1;中，由于是s1是short类型的，所以1首先被强制转换为short型，然后再参与运算，
//		并且结果也是short类型的，因此不会报错。那么，s1=1+1;为什么不报错呢？这是因为1+1是个
//		编译时可以确定的常量，“+”运算在编译时就被执行了，而不是在程序执行的时候，这个语句的效果
//		等同于s1=2，所以不会报错
		
	}
}
