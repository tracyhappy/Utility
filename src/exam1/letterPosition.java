package exam1;
public class letterPosition {
	// ��̬���������ַ�Ϊ����
	public static int getLetterNumber(char cha) {
		// �������Ĳ�����ĸ�����׳��쳣
		if (!Character.isLetter(cha)) {
			throw new RuntimeException("������ַ�������Ӣ��26����ĸ");
		}
		// ��Сд��ĸ�����ж�
		char ch = Character.toLowerCase(cha);
		int num = ch - 'a' + 1;
		System.out.println(cha + "��Ӣ����ĸ���е�" + num + "����ĸ");
		return num;
	}

	public static void main(String[] args) {
		// �����Ǹ�����,ע�������char���͵ģ����Ա���
		// Ҫ�õ���������������������
		letterPosition.getLetterNumber('C');
	}
}