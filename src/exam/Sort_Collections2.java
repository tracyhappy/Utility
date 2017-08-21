package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Compare implements Comparator<People>{
	
	//重写compare方法
	public int compare(People o1, People o2) {
		if (o1.salary > o2.salary) {
			return 1;
		}
		if (o1.salary < o2.salary) {
			return -1;
		}
		return 0;
	}
}

class People {
	public double salary;
	
	public People( double salary){
		this.salary = salary;
	}

	public String toString(){
		return salary + "";
	}
}

/**
 * Collections.sort(list);					//比较的对象必须实现Comparable接口(重写compareTo方法,who greater who behind)
 * Collections.sort(list,comparator);
 * 其实这两个方法内部都调用的是Arrays.sort
 * String和包装类是实现了Comparable接口的,因此重写了compareTo方法
 */

public class Sort_Collections2 {
	
	public static void main(String[] args) {
		ArrayList<People> peopleList = new ArrayList<People>();
		Compare comparator = new Compare();
		peopleList.add(new People(100));
		peopleList.add(new People(400));
		peopleList.add(new People(200));
		peopleList.add(new People(300));
		System.out.println("排序前：");
		System.out.println(peopleList);  			//必须重写toString
		System.out.println("排序后：");
		Collections.sort(peopleList,comparator);    //进行排序  
		System.out.println(peopleList);  			//必须重写toString
	}
	
}
