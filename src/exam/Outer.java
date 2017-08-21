package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//内部类可以定义在外部类的方法外面，也可以定义在外部类的方法体中
//在方法体外面定义的内部类的访问类型可以是public,protected,默认的，private等4种类型
//在方法内部定义的内部类前面不能有访问类型修饰符。但这种内部类的前面可以使用final或abstract修饰符
//内部类可以访问外部类的所有成员变量,但是自己不能定义静态成员
//内部类可以继承类和实现接口

//在方法外部定义的内部类前面可以加上static关键字，从而成为Static Nested Class（静态内部类）
//静态内部类中可以定义静态成员，可以访问外部类的静态成员，不能访问外部类的非静态成员
//在外面引用Static Nested Class类的名称为“外部类名.内部类名”

//Static Nested Class 和 Inner Class的不同
//答：创建一个static内部类的对象，不需要一个外部类对象，而普通内部类需要外部类对象。
//   static内部类可以创建静态成员，而普通内部类不能创建静态成员。
//	 static内部类不能访问外部类的非静态成员。普通内部类可以访问所有成员。


public class Outer
{
		private int out_x  = 0;
		private static int out_y = 3;
		
		public void method()
		{
			Inner1 inner1 = new Inner1();
			class Inner2  //在方法体内部定义的内部类
			{
				public void method()
				{
					out_x = 3;
					out_y = 5;
				}

			}
			Inner2 inner2 = new Inner2();
		}

		public class Inner1	implements ActionListener	//在方法体外面定义的内部类。如果加上static则成为Static Nested Class静态内部类
		{
			//private static int a;				//内部类中不能定义静态成员
			private int a;
			public void method(){
				out_x = 5;
				out_y = 5;
			}
			
			public void actionPerformed(ActionEvent e) {
				
			}
		}
		
		static public class Inner3   //在方法体外面定义的类如果加上static则成为Static Nested Class静态内部类
		{
			private int b;
			private static int a;	//静态内部类中可以定义静态成员，可以访问外部类的静态成员，不能访问外部类的非静态成员
			public void method(){
				out_y = 5;
//				out_x = 2;			
			}
		}
		
		public static void main(String[] args) {
			//一定要先创建外部类的实例对象，然后用这个外部类的实例对象去创建普通内部类的实例对象
			Outer outer = new Outer();
			Outer.Inner1 inner1 = outer.new Inner1();  
			
			//创建静态内部类实例
			Outer.Inner3 inner = new Outer.Inner3();
		}
		
}




