package exam1;

public class PrintTriangle {

	public static void main(String[] args) {
		printTriangle(5,"&");

	}
	
	public static void printTriangle(int row, String ch) {
		for (int i = 1; i <= row; i++) {          //����������
			for (int j = 1; j <= i ; j++) {     //�ڲ���Ƹ�����ͨ���������Ĺ�ϵ��
				System.out.print(ch);
			}
			System.out.println("");
		}
	}

}
