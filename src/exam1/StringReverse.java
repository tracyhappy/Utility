package exam1;


public class StringReverse {
	public static void main(String[] args) {
		// ԭʼ�ַ���
		String s = "A quick brown fox jumps over the lazy dog.";
		System.out.println("ԭʼ���ַ�����" + s);
		System.out.print("��ת���ַ�����");
		for (int i = s.length(); i > 0; i--) {
			System.out.print(s.charAt(i - 1));
		}
		// Ҳ����ת����������ٷ�ת�������е���һ��
		char[] data = s.toCharArray();
		System.out.println();
		System.out.print("��ת���ַ�����");
		for (int i = data.length; i > 0; i--) {
			System.out.print(data[i - 1]);
		}
		
		// ԭʼ�ַ���
		System.out.print("\n��ת���ַ�����");
		StringBuffer buff = new StringBuffer(s);
		// java.lang.StringBuffer���reverse()�������Խ��ַ�����ת
		System.out.println(buff.reverse().toString());
	}
}