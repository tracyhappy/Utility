package exam1;
public class MaxAndMin {

	public static void main(String[] args) {
		System.out.println("最大公约数是：" + calculateGreatestCommonDivisor(3,6));
		System.out.println("最小公倍数是是：" + calculateLeastCommonMultiple(3,6));
	}
	
	public static int calculateGreatestCommonDivisor(int m ,int n ){
		int temp = 0;
		if (m < n) {
			//交换m与n
			temp = n;
			n = m;
			m = temp;
		}
		if (n == 0) {
			return m;
		} else {
			return calculateGreatestCommonDivisor(n, m % n);
		}
	}
	
	public static int calculateLeastCommonMultiple(int m ,int n ){
		int min = m * n / calculateGreatestCommonDivisor(m,n);
		return min;
	}
}

