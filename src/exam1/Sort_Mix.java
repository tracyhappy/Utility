package exam1;


import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * ����:һ���ַ������磺17fe38D24d6e;�����ֽ����������ĸλ�ò��䣬���Ϊ��12fe34D67d8e
 *	boolean isDigit(char) �ж��ַ��Ƿ�Ϊ���֣�isDigit(str.charAt(i))�ж�һ���ַ������Ƿ�Ϊ���֡�
	boolean isLetter(char) �ж��ַ��Ƿ�Ϊ��ĸ
	boolean  isSpace(char) ȷ���ַ��Ƿ�Ϊ�ո���з�
 * 
 *  �ַ������ַ������ת��:  char[] array = str.toCharArray()
 */
public class Sort_Mix {

	public Sort_Mix(){
		sort();
	}
	
	public void sort(){
		String str = "17fe38D34d6e";
		//�ַ�����Ϊ�������޸������ֵ�����ǰ���תΪ�ַ�����
		char []charArray = str.toCharArray();
		//���ü��϶����ֽ�������
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (Character.isDigit(c)) {
				//�ж��Ƿ�Ϊ����,���������뼯����,���Ұ��ַ������������Ϊ0
				list.add(c);
				charArray[i] = '0';
			}
		}
		//�Լ��Ͻ�������
		Collections.sort(list);
		System.out.println("���������" + list);
		//����������ּӻ��ַ�����
		int n = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '0') {
				charArray[i] = list.get(n);
				n++;  //list���±����
			}
		}
//		String str1 = new String(charArray);
		System.out.println(charArray);
	}

	public static void main(String[] args) {
		new Sort_Mix();
	}

}
