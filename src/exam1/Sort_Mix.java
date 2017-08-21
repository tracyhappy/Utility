package exam1;


import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * 功能:一个字符串比如：17fe38D24d6e;对数字进行排序而字母位置不变，结果为：12fe34D67d8e
 *	boolean isDigit(char) 判断字符是否为数字；isDigit(str.charAt(i))判断一个字符串里是否为数字。
	boolean isLetter(char) 判断字符是否为字母
	boolean  isSpace(char) 确定字符是否为空格或换行符
 * 
 *  字符串和字符数组的转换:  char[] array = str.toCharArray()
 */
public class Sort_Mix {

	public Sort_Mix(){
		sort();
	}
	
	public void sort(){
		String str = "17fe38D34d6e";
		//字符串因为不方便修改里面的值，我们把它转为字符数组
		char []charArray = str.toCharArray();
		//利用集合对数字进行排序
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (Character.isDigit(c)) {
				//判断是否为数字,如果是则加入集合中,并且把字符数组的数字置为0
				list.add(c);
				charArray[i] = '0';
			}
		}
		//对集合进行排序
		Collections.sort(list);
		System.out.println("数字排序后" + list);
		//将排序后数字加回字符数组
		int n = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '0') {
				charArray[i] = list.get(n);
				n++;  //list的下标后移
			}
		}
//		String str1 = new String(charArray);
		System.out.println(charArray);
	}

	public static void main(String[] args) {
		new Sort_Mix();
	}

}
