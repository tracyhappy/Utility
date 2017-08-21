package exam1.sort;

import java.util.Random;

public class BubbleSort {

	/**
	 * ����10���������ð�ݷ����򣬼������ֵ��Сֵƽ��ֵ
	 */
	public static void main(String[] args) {
		int data[] = random(10);
		System.out.println("ð�ݷ�����:");
		print(data);
		result(data);
	}

	/*
	 * ���������������������ķ���
	 */
	public static int[] random(int t) {
		Random rn = new Random();
		int[] array = new int[t];
		int temp;
		for (int k = 0; k < array.length; k++) {
			array[k] = rn.nextInt(100);
		}
		for (int i = 0; i < array.length; i++)// �ȽϵĴ���
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
	 * ��ͣ�ƽ���������ֵ����Сֵ,���С��ƽ��ֵ�ķ���
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
		System.out.println("\n��Ϊ:" + sum + "  ƽ����Ϊ:" + avg + "  ���ֵ:" + max
				+ "  ��Сֵ:" + min);
		System.out.print("С��ƽ��ֵ������:");
		for (int i = 0; i < sort.length; i++) {
			if (sort[i] < avg) {
				count++;
				System.out.print(sort[i] + " ");
			}

		}
		System.out.print("һ��" + count + "��");
	}

	/*
	 * ����ķ���
	 */
	public static void print(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}