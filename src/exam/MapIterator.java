package exam;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * LinkedHashMap是有序的（按照添加进去的顺序）: 原理是链表
 * LinkHashSet是有序的（按照添加进去的顺序）: 原理是链表
 * 
 * 要想大量的数据有顺序，必然是数组或者链表结构
 */
public class MapIterator {
	
		public static void main(String[] args) {
			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "zxk");
			map.put(2, "jbx");
			map.put(null, null);
			
			System.out.println("-----------通过keySet----------------------------------");
			Iterator iter2 = map.keySet().iterator();
			while (iter2.hasNext()) {
				Object key = iter2.next();
				Object val = map.get(key);
				System.out.println(key + ":" + val);
			}

			System.out.println("-----------通过values----------------------------------");
			for (String name : map.values()) {
				System.out.println(name);
			}
			
			System.out.println("-----------通过entrySet-------------------------------");
			Iterator iter1 = map.entrySet().iterator();
			while (iter1.hasNext()) {
				Map.Entry entry = (Map.Entry) iter1.next();
				Object key = entry.getKey();
				Object val = entry.getValue();
				System.out.println(key + ":" + val);
			}
			
			System.out.println("-----------LinkedHashMap是有顺序的，按照加入的顺序----------------------------------");
			Map<Integer, String> linkMap = new LinkedHashMap<Integer, String>();
			linkMap.put(24, "chinese");
			linkMap.put(4, "math");
			linkMap.put(3, "english");
			for (Entry<Integer, String> entry : linkMap.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
			
			System.out.println("-----------LinkedHashSet是有顺序的，按照加入的顺序----------------------------------");
			Set<String> set = new LinkedHashSet<String>();
			set.add("a");
			set.add("b");
			set.add("c");
			for (String value : set) {
				System.out.println(value);
			}
			
			
			//TreeMap,TreeSet都可以按照自定义的顺序，进行排序存储。(TreeMap是按照key进行排序存储)
			//添加到TreeMap,TreeSet的元素必须实现Comparable接口(注意),否则您必须给它的构造函数提供一个Comparator接口(注意)的实现。
			System.out.println("-----------TreeMap可以自定义顺序进行排序----------------------------------");
			 //不指定排序器,所存的key必须实现Comparable接口
	        TreeMap<String, String> treeMap1 = new TreeMap<String, String>();  
	        treeMap1.put("2", "1");  
	        treeMap1.put("b", "1");  
	        treeMap1.put("1", "1");  
	        treeMap1.put("a", "1");  
	        System.out.println("treeMap1="+treeMap1);  
	  
	        //指定排序器Comparator接口
	        TreeMap<String, String> treeMap2 = new TreeMap<String, String>(new Comparator<String>(){  
	  
	            /* 
	             * int compare(Object o1, Object o2) 返回一个基本类型的整型， 
	             * 返回负数表示：o1 小于o2， 
	             * 返回0 表示：o1和o2相等， 
	             * 返回正数表示：o1大于o2。 
	             */  
	            public int compare(String o1, String o2) {  
	              
	                //指定排序器按照降序排列  
	                return o2.compareTo(o1);  
	            }     
	        });  
	        treeMap2.put("2", "1");  
	        treeMap2.put("b", "1");  
	        treeMap2.put("1", "1");  
	        treeMap2.put("a", "1");  
	        System.out.println("treeMap2="+treeMap2);
		}
}
