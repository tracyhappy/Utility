package exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class PersonClass{
	private String name;
	private int age;
	private String description;
	
	public PersonClass(){}
	
	public PersonClass(String name) {
		this.name = name;
	}
	
	public PersonClass(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public PersonClass(String name,int age,String description) {
		this.name = name;
		this.age = age;
		this.description = description;
	}

	public  String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String toString(){
		return "姓名:" + name + "; 年龄:" + age + "; 描述:" + description;
	}
	
	public String sayHello(String name1,int age2){
		return name1 + "\t" + age2;
	}
};

public class Reflect_Test1 {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Class cls = null;  //声明class对象
		try {
			 cls = Class.forName("exam.PersonClass"); //创建与PersonClass类相关联的Class对象
		} catch (ClassNotFoundException e) {
			System.out.println("没找到该类");
			e.printStackTrace();
		}
		//*************************************************************************************************************
		Constructor cons[] = null;                     //声明Constructor类型的数组cons
		cons = cls.getConstructors();                 //通过class对象调用getConstructors得到所有公共构造方法
		PersonClass PersonClass1 = null; //声明PersonClass类对象
		try {
//			 PersonClass1 = (PersonClass)cls.newInstance();  //通过Class对象创建与之关联的类的对象,调用的是默认构造函数。（所以使用此方法必须有默认构造函数）
			 PersonClass1 = (PersonClass)cons[1].newInstance("张学恺",10,"哈哈,快乐");        //通过得到的构造方法去实例化对象
		} catch (Exception e) {		
			e.printStackTrace();
		}
		//PersonClass.setName("张学恺");
		
		System.out.println("--------------------------------》通过反射实例化的对象：");
		System.out.println(PersonClass1);
		//System.out.println(PersonClass.toString());
		//************************************************************************************************
		Constructor con1 = cls.getConstructor(String.class,int.class,String.class);
		PersonClass person =  (PersonClass)con1.newInstance("金碧茜",21,"加油");
		System.out.println(person);
		//************************************************************************************************
		System.out.println("--------------------------------》修改姓名属性后：");
		//获取name属性,并修改。。取消属性的访问权限。nameField.setAccessible(true);
		Field nameField = cls.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(PersonClass1, "金碧茜");
		System.out.println(PersonClass1);
		
		
		Class superName = cls.getSuperclass();           //获取该类的父类的class对象
		System.out.println("--------------------------------》PersonClass类的基类有：");
		System.out.println(superName.getName());         //打印该class对象所指代的类的名称。
		
		Method []methods = cls.getMethods();   //换成getDeclaredMethods()呢。。
		System.out.println("--------------------------------》PersonClass类的方法有：");
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
		
		System.out.println("--------------------------------》通过反射调用函数----开始");
		Method m = cls.getMethod("sayHello",String.class,int.class);
		String result = (String)m.invoke(PersonClass1,"金碧茜",22);
		System.out.println(result);
		System.out.println("--------------------------------》通过反射调用函数----完毕");
		
		Constructor con[] = cls.getConstructors();   //通过class对象调用getConstructors得到所有公共构造方法
		System.out.println("--------------------------------》构造函数的个数：" + cons.length);
		for(Constructor constructor:con){
			System.out.print(constructor);
			//System.out.println(constructor.toString());
			System.out.print("的访问修饰符为：");
			int mod = constructor.getModifiers();              //得到该构造函数的访问修饰符即取出权限
			String modifer = Modifier.toString(mod);           //还原权限
			System.out.println(modifer);
		}
	}

}
