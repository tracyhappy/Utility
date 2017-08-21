package exam;

import java.util.ArrayList;
import java.util.Collections;


class WorkerMan implements Comparable<WorkerMan>{
	private double salary;
	
	public WorkerMan( double salary){
		this.salary = salary;
	}
	
	//重写compareTo方法
	public int compareTo(WorkerMan other) {
		if (this.salary > other.salary) {
			return 1;
		}
		if (this.salary < other.salary) {
			return -1;
		}
		return 0;
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

public class Sort_Collections1 {
	
	public static void main(String[] args) {
		ArrayList<WorkerMan> workerList = new ArrayList<WorkerMan>();
		workerList.add(new WorkerMan(100));
		workerList.add(new WorkerMan(400));
		workerList.add(new WorkerMan(200));
		workerList.add(new WorkerMan(300));
		System.out.println("排序前：");
		System.out.println(workerList);  //必须重写toString
		System.out.println("排序后：");
		Collections.sort(workerList);    //进行排序  
		System.out.println(workerList);  //必须重写toString
	}
	
}
