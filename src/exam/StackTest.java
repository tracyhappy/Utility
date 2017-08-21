package exam;

import java.util.Iterator;
import java.util.Stack;

/**
 *  Stack是继承了Vector
 *  
 */
public class StackTest {
	public static void main(String[] args) {
		//Stack是继承了Vector
		Stack<String> s = new Stack<String>();  
		System.out.println("------isEmpty");  
		System.out.println(s.isEmpty());  
		System.out.println("------push");  
		s.push("1");  
		s.push("2");  
		s.push("3");  
		it(s);  
		System.out.println("------pop");  
		String str = s.pop();  
		System.out.println(str);  
		it(s);  
		System.out.println("------peek");  
		str = s.peek();  
		System.out.println(str);  
		it(s);  
		System.out.println("------search");  
		int i = s.search("2");  
		System.out.println(i);  
		i = s.search("1");  
		System.out.println(i);  
		i = s.search("none");  
		System.out.println(i);  
	}
	
	public static void it(Stack stack){
		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println();
	}
}
