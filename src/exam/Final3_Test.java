package exam;

public class Final3_Test{

	
	public static void main(String[] args) {
		final int  array1[] = {1,2,3};
		//array = null;                  //final修饰的是array数组地址
		array1[0] = 5;					 //可以更改数组内容
		for(int a:array1){
			System.out.println(a);
		}
	}
}
