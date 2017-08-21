package exam;

public class Person {

	private String name;
	public Person (String name){
		this.name = name;
	}
	
	//@Override Object的equals方法比较的是两个对象地址是否一样。
	//现在重写Object的equals方法,比较两个对象的属性值是否一样。（与String的equals方法类似）
	public boolean equals(Object otherObject){
		//如果为同一地址(引用)，则肯定内容相等。如果不是同一地址，则可能内容相等。
		if(this == otherObject){
			return true;
		}
		//先判断是否为空。
		if (otherObject == null) {
			return false;
		}
		//如果不是同一个类，则肯定不等。如果是同一个类，则强转，再比较内容
		if(getClass() != otherObject.getClass()){
			return false;
		}
		
		//强转
		Person otherPerson = (Person)otherObject;
		//比较内容
		return this.name == otherPerson.name;
	}
	
	public static void main(String[] args) {
		Person peron1 = new Person("张学恺");
		Person peron2 = new Person("张学恺");
		//调用重写的equals方法
		System.out.println(peron1.equals(peron2));//true
		
		Worker worker1 = new Worker("工人",11);
		Worker worker2 = new Worker("工人",11);
		System.out.println(worker1.equals(worker2));//true
		
		String str1 = "asfd";
		String str2 = "asfd";
		System.out.println(str1.hashCode());         //相同
		System.out.println(str2.hashCode());
		
		System.out.println(worker1.hashCode());      //不相同
		System.out.println(worker2.hashCode());
		
		System.out.println(worker2.toString());       //类名+散列码
 	}

}

class Worker extends Person{
	private int salary;
	
	public Worker(String name,int salary) {
		super(name);
		this.salary = salary;
	}
	
	
	public boolean equals(Object otherObject){
		if (!super.equals(otherObject)){         //可以调用父类被重写的方法,super仅是提示作用
			//先比较基类中的属性
			return false;
		}
		//super.equals(otherObject)已经证明属于同一个类了。再比较新增的属性
		Worker worker = (Worker)otherObject; 
		return salary == worker.salary;
		
	}
	
}
