package exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

  
//  Cloneable为标识接口，无方法，仅表示一种能力
//  注意浅拷贝与深拷贝的区别。浅拷贝中的引用属性会指向同一块地址,深拷贝中的引用属性会指向不同地址。
//  如果只是用Object中默认的clone方法,是浅拷贝。

//	Date和GregorianCalendar之间的转化: 
//	GregorianCalendar birthday = new GregorianCalendar(1991,0,27);
//	Date bornDate = birthday.getTime();
//	将Date格式化为String:
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日");
//	String date = sdf.format(bornDate);
class Employee implements Cloneable{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String name, double salary, GregorianCalendar hireDay) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDay = hireDay.getTime();
	}
	
	//重写的clone方法是Object的
	public Employee clone() throws CloneNotSupportedException {
		return (Employee)super.clone();       //具体的克隆由父类操作
	}
	
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日");
		String date = sdf.format(hireDay);
		return name + "\t" + salary + "\t" + date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}
}

public class Clone_Test {
	public static void main(String[] args) {
		Employee origin = new Employee("张学恺",100,new GregorianCalendar(1991,0,27));
		Employee cloned = null;
		try {
			 cloned = origin.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("origin:" + origin);
		System.out.println("cloned:" + cloned);
		System.out.println(origin == cloned);         //false  比较地址
		System.out.println(origin.equals(cloned));    //false  比较地址
		System.out.println(origin.getSalary() == cloned.getSalary());			//true（因基本类型）
		System.out.println(origin.getName() == cloned.getName());				//true,同一地址,浅拷贝
		System.out.println(origin.getHireDay() == cloned.getHireDay());			//true,同一地址,浅拷贝
		String result = (origin.getHireDay() == cloned.getHireDay())?"浅拷贝":"深拷贝";
		System.out.println(result);
		
		//改变cloned里面的属性值
		System.out.println("---------------------》改变cloned里面的属性值后");
		cloned.setName("金碧茜");
		cloned.setSalary(213);
		cloned.setHireDay(new GregorianCalendar(1991,7,22).getTime());
		System.out.println("origin:" + origin);
		System.out.println("cloned:" + cloned);
		
	}
}
