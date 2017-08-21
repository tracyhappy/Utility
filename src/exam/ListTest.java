package exam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class PeopleClass {
	
	private int age;
	
	private String name;
	
	public PeopleClass(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		System.out.println("进入equals方法了");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeopleClass other = (PeopleClass) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class ListTest {
	
	/**
	 *  list的contains和indexOf方法都是根据对象equals方法进行比较的。
	 */
    @org.junit.Test
    public void TestEquals(){
    	System.out.println("===============================》TestEquals");
    	PeopleClass one = new PeopleClass(25,"zxk");
    	PeopleClass two = new PeopleClass(25,"zxk");
    	
    	
    	List<PeopleClass> list = new ArrayList<PeopleClass>();
    	list.add(one);
    	if(list.contains(two)){
    		System.out.println("已经有了该Person");
    		System.out.println("该对象的index为 : " + list.indexOf(two));
    	}else{
    		System.out.println("没有该Person");
    		list.add(two);
    	}
    	System.out.println("list的size : " + list.size());
    }
    
	
	/**
	 *  List和Set之间是可以互相转化的。如果List转化为Set，可以达到去重的目的。 new HashSet/ArrayList(Collecation c)
	 *  List和Set都可以调用toArray方法转化为普通数组。Object[] array = list/set.toArray();
	 *  普通数组转化为string : Arrays.toString(array[]) 
	 *  list/set.addAll(Collection c)
	 *	list/set.removeAll(Collection c)
	 *	Collections.addAll(Collection, Collection);
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@org.junit.Test
    public void TestList0(){
		System.out.println("===============================》TestList0");
		List list = new ArrayList();
		list.add("str1");
		list.add("str2");
		list.add("str1");				//有重复元素
		System.out.println(list);
		
		Set set = new HashSet(list);	//达到去重的目的
		System.out.println(set);
		list = new ArrayList(set);
		
		System.out.println(Arrays.toString(list.toArray()));	
		System.out.println(Arrays.toString(set.toArray()));
	}
	
	
	/**
	 * 使用Iterator进行遍历List的时候,直接使用list.add或者remove会报java.util.ConcurrentModificationException
	 * 必须使用iterator进行删除
	 */
	@org.junit.Test
    public void TestList1(){
		System.out.println("===============================》TestList1");
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer==2)
//                list.remove(integer);	
            	iterator.remove();
        }
        System.out.println(list);
	}
	
//	public static <T> List<T> asList(T...a) {
//	return new ArrayList<>(a);
//}
	
	/**
	 *  普通数组转List
	 *  Arrays.asList返回的不是java.util.ArrayList。而是一个内部类ArrayList,该类不能进行add、set、remove，否则直接会抛出UnsupportedOperationException异常。
	 *	但是也可以转成java.util.ArrayList。List<String> list = new ArrayList<>(Arrays.asList("Welcome", "to", "Java", "world"));
	 */
	@org.junit.Test
	public void TestAsList(){
		System.out.println("===============================》TestAsList");
		List<String> list = Arrays.asList("a","b","c");
		System.out.println(list);
		
		String[] array = new String[]{"a","b"};
		list= Arrays.asList(array);					//数组转list（注意该数组不是真正的ArrayList,连remove,add方法都不支持）
		list = new ArrayList<String>(Arrays.asList(array));	//可以这样转化为java.util.ArrayList
		System.out.println(list);
	}
	
	
	public static boolean isEmptyStr(String str) {
		return str == null || str.isEmpty();
	}

	public static boolean isEmptyList(List<String> list) {
		return list == null || list.size() == 0;
	}
	
	/**
	 * 字符串或者数组判断是否为空
	 */
	@org.junit.Test
	public void TestString4() {
		String str = "";
		List<String> list = new ArrayList<String>();
		if (str != null && !str.isEmpty()) {

		}

		if (!isEmptyStr(str)) {

		}

		if (list != null && !list.isEmpty()) {

		}

		if (!isEmptyList(list)) {

		}
	}
	
	

}