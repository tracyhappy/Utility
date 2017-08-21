package factory;


abstract class People{
	private String name;
	public abstract void say();
};

class Student extends People{

	@Override
	public void say() {
		System.out.println("我是学生");	
	}
};

class Worker extends People{
	@Override
	public void say() {
		System.out.println("我是工人");	
	}	
};

class Factory{
	public static People getInstance(String className){
		if ("学生" == className){
			People student = new Student();
			//然后这里可以添加执行student的函数或者也可以直接返回对象
			return student;			
		}
		if ("工人" == className){
			People worker = new Worker();
			//然后这里可以添加执行worker的函数或者也可以直接返回对象
			return worker;			
		}
		return null;
	}
}

public class Test_factory {
	public static void main(String[] args) {
		//主函数就客服端，在这里可以添加代码询问用户要实例化哪种对象。
		People people = Factory.getInstance("学生");
		if (people != null){
			people.say();
		}
	}
}
