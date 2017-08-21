package exam;

/**
 * 字符串性能测试
 * @author 水枫流星
 *
 */
public class StringOptimize {
	public static void main(String[] args) {
		final int N = 100000;
		long startTime = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < N; i++) {
			str += "*";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("使用+=时所费时间：" + (endTime - startTime) + "毫秒");
		startTime = System.currentTimeMillis();
		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < N; i++) {
			strBuffer.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("使用StringBuffer的append方法时所费时间：" + (endTime - startTime) + "毫秒");
		
		
		
		startTime = System.currentTimeMillis();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < N; i++) {
			strBuilder.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("使用StringBuilder的append方法时所费时间：" + (endTime - startTime) + "毫秒");
	}

}
