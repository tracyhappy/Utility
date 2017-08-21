package exam1;


public class PrintLingXing {

	/**
	 * 打印菱形：外循环控制行，内循环控制空格和"*"个数
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			if (i <= 3) { 
				//前4行
				for (int k = 0; k < 3-i; k++) {
					//打印每行空格
					System.out.print(" ");
				}
				for (int j = 0; j < 2*i+1; j++) {
					//打印"*"
					System.out.print("*");
				}
			}else{
				//后三行
				for (int k = 0; k < i-3; k++) {
					//打印每行空格
					System.out.print(" ");
				}
				for (int j = 0; j < 13-2*i; j++) {
					//打印"*"
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
