package exam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 	TreeSet实现了SortedSet,可以自定义排序。如果添加的是自己定义的类对象，需要实现comparable。才能进行排序
 */

class Dog implements Comparable<Dog>{
    private int size;
 
    public Dog(int s) {
        size = s;
    }
 
    public String toString() {
        return size + "";
    }
 
    public int compareTo(Dog o) {
            return size - o.size;
    }
}


public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();	
		set.add(new Integer(10));
		set.add(new Integer(10));		//不重复
		set.add(new Integer(3));
		set.add(new Integer(7));
		set.add(new Integer(5));
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");  
			
		}
		
		System.out.println("\nTreeSet实现自定义排序");
		
		TreeSet dset = new TreeSet();
        dset.add(new Dog(2));
        dset.add(new Dog(1));
        dset.add(new Dog(3));
 
        it = dset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
	}
}
