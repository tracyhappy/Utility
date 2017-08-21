package exam;

//普通数组.length
//string.length()
//arrayList.size()
//int email[] = new int[5];			//无论是成员变量还是局部变量，里面的默认值都为0
//String names[] = new String[5];	//无论是成员变量还是局部变量，里面的默认值都为null
//int i;							//如果是成员变量，默认值为0。如果是局部变量，无默认值，在使用之前必须赋值，否则编译都会报错


public class Array_Test {
	public static void main(String[] args) {
		
		int []a = {1,2,3};
		int []b = new int[]{1,2,3};
		int []c = new int[5]; 
		int [][]d = {{1,2,3},{2,2,4},{3,4,5}};
		int [][]e = new int[][]{{1,2,3},{2,2,4},{3,4,5}};
		int [][]f = new int[3][3];
		
		String names[] = new String[5];
		String name1[] ={"a","b"};
		for (int x = 0; x < name1.length; x++){
			names[x] = name1[x];
			System.out.println(names[x]);
		}
		System.out.println(names[2]);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		int email[] = new int[5];
		for (int i = 0; i < email.length; i++) {
			System.out.println(email[i]);          //局部变量数组默认为0
		}
		
		int h;
//		System.out.println(h); 					   //局部变量使用则必须赋值
		
		//打印二维数组
		int [][]array2 = new int[][]{{1,2},{4,5,6},{7,8,9}};
		//使用for
		System.out.println("-------------------》使用for打印数组");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]);
			}
			System.out.println();
		}
		//使用foreach
		System.out.println("-------------------》使用foreach打印数组");
		for (int []xx:array2) {
			for (int value: xx) {
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
