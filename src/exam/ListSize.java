package exam;

import java.util.LinkedList;

//ArrayList,LinkedList,Vector都会有这样的检查,如果index>size就报出异常
//LinkedList是链表，因此是没有初始化长度的

public class ListSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("A");
		//list.add(1, null);  //如果去掉这句话，就会运行时报IndexOutOfBoundsException
		list.add(2, "B");
		System.out.println("list的长度为：" + list.size());
		for (int i = 0 ; i < list.size(); i++){
			String str = (String)list.get(i);
			System.out.println(str);
		}
	}

}
