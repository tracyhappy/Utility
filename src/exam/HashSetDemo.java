package exam;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 	String,Integer,HashSet都是重写了equals方法，比较的是里面的值。		
 *  HashSet 有两种遍历方式
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("zhang");
		hashSet.add("jin");
		hashSet.add("aaa");
		hashSet.add("aaa");
		System.out.println(hashSet);
		System.out.println("hashSet的两种遍历方式");				//hashSet的两种遍历方式
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for (String str : hashSet) {
			System.out.println(str);
		}
		
		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("zhang");
		hashSet1.add("jin");
		hashSet1.add("aaa");
		
		//HashSet重写了equals方法。
		System.out.println(hashSet1.equals(hashSet));			//true
		//比较地址					
		System.out.println(hashSet1 == hashSet);				//false
	}
}
