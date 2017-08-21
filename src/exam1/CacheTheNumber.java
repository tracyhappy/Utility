package exam1;

import java.util.Arrays;

public class CacheTheNumber {
	public static void main(String[] args) {
		//缓存-128到127之间的数
		int high = 127;
		int low = -128;
		int[] cache = new int[high-low+1];
		
		int j = low;
		for (int i = 0; i < cache.length; i++) {
			cache[i] = j++;
		}
		System.out.println(Arrays.toString(cache));
		
		//在cache数组中查找5这个元素
		System.out.println(cache[-5-low]);
		
	}

}
