package exam;
/**
 * 
 * 功能：
 * 方法参数：
	1.方法不能修改一个基本类型的参数（即数值型和布尔型）
	2.方法可以改变一个对象参数的状态（即属性）
	3.方法不能实现对两个对象参数的交换。
 * 作者：张学恺
 */
public class RelParamTest1 {
	
	public RelParamTest1(){
		Student zhang = new Student("张学恺",21);
		Student jin = new Student("金碧茜",20);
		System.out.println("------------------》开始进行交换");
		swap(zhang,jin);
		System.out.println("------------------》交换结果");
		System.out.println("zhang---> "  + zhang.getName());
		System.out.println("jin---> "  + jin.getName());
		System.out.println("结果证明：方法不能实现对两个对象参数的交换。");
	}
	
	public void swap(Student x,Student y){
		Student temp = x;
		x = y;
		y = temp;
	}
	
	public static void main(String[] args) {
		new RelParamTest1();
	}

}


class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {	
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

}