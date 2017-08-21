package exam1;

public class PrintTriangle {

	public static void main(String[] args) {
		printTriangle(5,"&");

	}
	
	public static void printTriangle(int row, String ch) {
		for (int i = 1; i <= row; i++) {          //外层控制行数
			for (int j = 1; j <= i ; j++) {     //内层控制个数（通过与行数的关系）
				System.out.print(ch);
			}
			System.out.println("");
		}
	}

}
