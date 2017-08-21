package exam;

import java.util.Calendar;

//抽象类可以有private（静态）变量,可以无抽象函数
//抽象类可以有构造函数，但是不能抽象类不能实例化对象。
//抽象类可以有属性和普通方法。
//接口和抽象类均不能实例化。
//抽象类中的抽象方法可以是public和protected，不能使private。
public abstract class Abstract_Test {
	//属性
	private static int i;
	private int j;
	
	//方法
	void play(){System.out.println("aaa");};
	private static void haha(){System.out.println("bbbb");};
	
	//抽象方法
	abstract  void amethod(); 			//注意结尾形式
	
}

interface in{
	void play();
}