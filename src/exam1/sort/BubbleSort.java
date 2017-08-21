package exam1.sort;

import java.util.Random;

public class BubbleSort {

	/**
	 * 产生10个随机数，冒泡法排序，计算最大值最小值平均值
	 */
	public static void main(String[] args) {
		int data[] = random(10);
		System.out.println("冒泡法排序:");
		print(data);
		result(data);
	}

	/*
	 * 产生随机数，并对其排序的方法
	 */
	public static int[] random(int t) {
		Random rn = new Random();
		int[] array = new int[t];
		int temp;
		for (int k = 0; k < array.length; k++) {
			array[k] = rn.nextInt(100);
		}
		for (int i = 0; i < array.length; i++)// 比较的次数
		{
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	/*
	 * 求和，平均数，最大值，最小值,输出小于平均值的方法
	 */
	public static void result(int sort[]) {
		int sum = 0, max, min, count = 0;
		double avg;
		for (int i = 0; i < sort.length; i++) {
			sum += sort[i];

		}
		avg = sum / sort.length;
		max = sort[sort.length - 1];
		min = sort[0];
		System.out.println("\n和为:" + sum + "  平均数为:" + avg + "  最大值:" + max
				+ "  最小值:" + min);
		System.out.print("小于平均值的数有:");
		for (int i = 0; i < sort.length; i++) {
			if (sort[i] < avg) {
				count++;
				System.out.print(sort[i] + " ");
			}

		}
		System.out.print("一共" + count + "个");
	}

	/*
	 * 输出的方法
	 */
	public static void print(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}