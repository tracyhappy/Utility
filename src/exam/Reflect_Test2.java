package exam;

import java.lang.reflect.Array;

public class Reflect_Test2 {

	public static void main(String[] args) {
		int []a = {1,2,3,4};
		Class a1 = a.getClass().getComponentType();//返回数组类型的class对象
		System.out.println("数组类型：" + a1.getName()); //取得数组类型名称
		System.out.println("数组第一个数为：" + Array.get(a, 0));
		System.out.println("设置数组第一个内容");
		Array.set(a, 0 , 5);
		System.out.println("设置数组第一个数以后：" + Array.get(a, 0));
		
		
		//使用Array的newInstance方法动态创建数组
		String []str = (String[]) Array.newInstance(String.class, 5);
		Array.set(str, 0, "张学恺");
		Array.set(str, 1, "金碧茜");
		
		System.out.println("数组第一个元素内容：" + Array.get(str, 0));
		System.out.println("数组第二个元素内容：" + Array.get(str, 1));
	}

}
