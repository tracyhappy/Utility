package exam1;


public class PrintLingXing {

	/**
	 * ��ӡ���Σ���ѭ�������У���ѭ�����ƿո��"*"����
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			if (i <= 3) { 
				//ǰ4��
				for (int k = 0; k < 3-i; k++) {
					//��ӡÿ�пո�
					System.out.print(" ");
				}
				for (int j = 0; j < 2*i+1; j++) {
					//��ӡ"*"
					System.out.print("*");
				}
			}else{
				//������
				for (int k = 0; k < i-3; k++) {
					//��ӡÿ�пո�
					System.out.print(" ");
				}
				for (int j = 0; j < 13-2*i; j++) {
					//��ӡ"*"
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
