package exam1;
public class letterPosition {
	// 静态方法，以字符为参数
	public static int getLetterNumber(char cha) {
		// 如果输入的不是字母，就抛出异常
		if (!Character.isLetter(cha)) {
			throw new RuntimeException("输入的字符不属于英语26个字母");
		}
		// 大小写字母均可判断
		char ch = Character.toLowerCase(cha);
		int num = ch - 'a' + 1;
		System.out.println(cha + "是英文字母表中第" + num + "个字母");
		return num;
	}

	public static void main(String[] args) {
		// 下面是个测试,注意参数是char类型的，所以必须
		// 要用单引号引起来，否则会出错
		letterPosition.getLetterNumber('C');
	}
}