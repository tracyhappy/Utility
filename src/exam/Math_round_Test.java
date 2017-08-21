package exam;

//   Math.round()四舍五入法：将原来的数字加上0.5后再向下取整
//1. 参数的小数点后第一位<5，运算结果为参数整数部分。
//2. 参数的小数点后第一位>5，运算结果为参数整数部分绝对值+1，符号（即正负）不变。
//3. 参数的小数点后第一位=5，正数运算结果为整数部分+1，负数运算结果为整数部分。

public class Math_round_Test {
	public static void main(String[] args) {
		System.out.println("小数点后第一位=5");
		System.out.println("正数：Math.round(11.5)=" + Math.round(11.5));
		System.out.println("负数：Math.round(-11.5)=" + Math.round(-11.5));
		System.out.println();
		System.out.println("小数点后第一位<5");
		System.out.println("正数：Math.round(11.46)=" + Math.round(11.46));
		System.out.println("负数：Math.round(-11.46)=" + Math.round(-11.46));
		System.out.println();
		System.out.println("小数点后第一位>5");
		System.out.println("正数：Math.round(11.68)=" + Math.round(11.68));
		System.out.println("负数：Math.round(-11.68)=" + Math.round(-11.68));
		
		System.out.println("Math.ceil(11.3)=" + Math.ceil(11.3));
		System.out.println("Math.ceil(-11.3)=" + Math.ceil(-11.3));
		
		System.out.println("Math.floor(11.6)=" + Math.floor(11.6));
		System.out.println("Math.floor(-11.6)=" + Math.floor(-11.6));
		

	}

}
