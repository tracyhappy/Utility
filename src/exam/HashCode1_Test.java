package exam;

import java.util.HashSet;
import java.util.Set;

public class HashCode1_Test {
	/**
     * String类和包装类型都重写了equals和hashCode方法。如果equals相等，hashCode相等，在Hash的数据结构中就会被当成同一个对象。
     */
    @org.junit.Test
    public void TestPackClass(){
    	Integer one = new Integer(10);
    	Integer two = new Integer(10);
    	
    	System.out.println(one.equals(two));
    	System.out.println(one.hashCode() == two.hashCode());
    	
    	Set<Integer> set = new HashSet<Integer>();
    	set.add(one);
    	System.out.println(set.contains(two));
    	
    	String s1 = new String("abcd");
        String s2 = new String("abcd");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        Set<String> set2 = new HashSet<String>();
    	set2.add(s1);
    	System.out.println(set2.contains(s2));
    	
    }
}
